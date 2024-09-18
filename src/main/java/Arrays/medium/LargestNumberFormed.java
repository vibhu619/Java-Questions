package Arrays.medium;

import java.util.Arrays;
import java.util.Comparator;

//Given an array of strings arr[] of length n representing non-negative integers, arrange them in a manner, such that, after concatenating them in order,
//        it results in the largest possible number. Since the result may be very large, return it as a string.
//
//        Examples:
//
//        Input: n = 5, arr[] =  {"3", "30", "34", "5", "9"}
//        Output: "9534330"
//        Explanation: Given numbers are  {"3", "30", "34", "5", "9"}, the arrangement "9534330" gives the largest value.
public class LargestNumberFormed {
    public static void main(String[] args) {
        String[] arr={"3", "30", "34", "5", "9"};
        System.out.println(printLargest(arr.length,arr));
    }


    //Logic: Given two numbers X and Y, decide which number to put first –
    // we compare two numbers XY (Y appended at the end of X) and YX (X appended at the end of Y). If XY is larger,
    // then X should come before Y in output, else Y should come before.
    static String printLargest(int n, String[] arr) {
        Arrays.sort(arr,new Comparator<String>(){
            @Override
            public int compare(String x,String y ){
                String xy=x+y;
                String yx=y+x;
                return yx.compareTo(xy);
            }

        });

        StringBuilder ans= new StringBuilder();
        for(String x: arr){
            ans.append(x);
        }
        return ans.toString();
    }
}
