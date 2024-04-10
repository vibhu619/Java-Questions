package Streams;

import java.io.StringReader;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32, 112, 1, 10, 25);

        //1. Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
        System.out.println(" all the even numbers that exist in the list");
        list.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        //2.Given a list of integers, find out all the numbers starting with 1 using Stream functions?
        System.out.println(" all the numbers starting with 1");
        list.stream()
                .map(s -> s + "")
                .filter(s -> s.startsWith("1"))
                .forEach(System.out::println);

        //3.How to find duplicate elements in a given integers list in java using Stream functions?
        System.out.println(" duplicate elements in a given integers list");
        Set<Integer> s = new HashSet<>();
        list.stream()
                .filter(n -> !s.add(n))   //here s.add(n) will give false if it's a duplicate in element and not added to set, hence to make predicate true we add '!'
                .forEach(System.out::println);


        //4.Given the list of integers, find the first element of the list using Stream functions?
        System.out.println(" first element of the list");
        System.out.println(list.stream()
                .findFirst()
                .orElseThrow());

        //5.Given a list of integers, find the total number of elements present in the list using Stream functions?
        System.out.println(" total number of elements present");
        System.out.println(list.stream()
                .count());

        //6.Given a list of integers, find the maximum value element present in it using Stream functions?
        System.out.println("maximum value element present");
        int max=list.stream()
                .mapToInt(Integer::valueOf)  //converting to int stream
                .max()
                .orElseThrow();
        System.out.println(max);

        //7.Given a list of integers, sort all the values present in it using Stream functions?
        System.out.println(" sort all the values");
        list.stream()
                .sorted()
                .forEach(System.out::println);

        //8.Given a list of integers, sort all the values present in it in descending order using Stream functions?
        System.out.println("sort all the values present in it in descending order");
        list.stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);

        //9.Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
        System.out.println("appears at least twice in the array");
        int[] nums={1,2,3,4};
        List<Integer> list1=Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());

        Set<Integer> set = new HashSet<>(list);
        if(set.size() == list.size()) {

        }
        else
            System.out.println( "true");

        //10.Java 8 program to perform cube on list elements and filter numbers greater than 50.
        System.out.println("cube on list elements  greater than 50");
        List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
        integerList.stream()
                .map(n->(n*n*n))
                .filter(n->n>50)
                .forEach(System.out::println);


        //11.Write a Java 8 program to sort an array and then convert the sorted array into Stream?
        System.out.println("sorted stream");
        int arr[] = { 99, 55, 203, 99, 4, 91 };
        Arrays.stream(arr)
                .sorted()
                .boxed()
                .forEach(System.out::println);

        //12.How to find only duplicate elements with its count from the String ArrayList in Java8?
        System.out.println("only duplicate elements with its count");
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
        Map<String,Long> namesCount = names
                .stream()
                .filter(x->Collections.frequency(names, x)>1)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(namesCount);


        //13.Write a Program to find the Maximum element in an array?
        System.out.println("Maximum element");
        System.out.println(Arrays.stream(arr).max().getAsInt());


        //14.Write a program to print the count of each character in a String?
        System.out.println("count of each character in a String");
        String str="Java is cool";
        Map<String,Long> map=Arrays.stream(str.split(""))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
        System.out.println(map);
    }

}
