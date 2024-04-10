package Streams;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;



public class Question2 {
    public static void main(String[] args) {
        String s="Java is so awesome junior vibhu";
        //7.Given a String, find the first non-repeated character in it using Stream functions?
        System.out.println("first non-repeated character");
        Character ch= s.chars()
                .mapToObj(t -> Character.toLowerCase((char) t))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry->entry.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElseThrow(()-> new RuntimeException("No unique word"));

        System.out.println(ch);

        //8.Given a String, find the first repeated character in it using Stream functions?
        System.out.println("first repeated character");
        Character ch1=s.chars()  //int stream
                .mapToObj(t->Character.toLowerCase((char)t)) //stream<characters>
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry->entry.getValue()>1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElseThrow(()->new RuntimeException("No repeated character"));

        System.out.println(ch1);




    }
}
