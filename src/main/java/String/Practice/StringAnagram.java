package String.Practice;

import java.util.Arrays;

//Find total number of anagrams for a given string  in input string
public class StringAnagram {
    public static void main(String[] args) {
        String s="for";
        String input="forxxorfdffro";  //isme 'for' k kitne anagram h
        int count=0;
        int n=input.length();
        int k=s.length();

        int[] arr1=new int[256];
        for(int i=0;i<k;i++){
            arr1[s.charAt(i)]++;
        }
        int[] arr2=new int[256];
        for(int i=0;i<k;i++){
            arr2[input.charAt(i)]++;
        }

        if(Arrays.equals(arr1,arr2)){
            count++;
        }

        for(int i=k;i<n;i++){
            arr2[input.charAt(i)]++;
            arr2[input.charAt(i-k)]--;

            if(Arrays.equals(arr1,arr2)){
                count++;
            }
        }

        System.out.println(count);
    }
}
