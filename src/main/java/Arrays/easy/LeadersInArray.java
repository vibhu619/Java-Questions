package Arrays.easy;

import java.util.ArrayList;
import java.util.Collections;

//Given an array A of positive integers. Your task is to find the leaders in the array. \
// An element of array is leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader.
//
//        Example 1:
//
//        Input:
//        n = 6
//        A[] = {16,17,4,3,5,2}
//        Output: 17 5 2
public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr={16,17,4,3,5,2};
        int n=arr.length;

        int maxi=arr[n-1];
        ArrayList<Integer> list=new ArrayList<>();
        list.add(maxi);

        for(int i=n-2;i>=0;i--){
            if(arr[i]>maxi){
                maxi=arr[i];
                list.add(arr[i]);
            }
        }
        //Collections.reverse(list);
        //OR reverse the list using recursion
        reverse(list);
        for(int x:list){
            System.out.println(x);
        }

    }

    private static void reverse(ArrayList<Integer> list) {
        if(list.isEmpty() || list==null){
            return;
        }

        int value=list.remove(0);

        //call reverse recursively
        reverse(list);

        list.add(value);
    }
}
