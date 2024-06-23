package Recursion.Hard;
//Given an array of integers and a sum B, find all unique combinations in the array where the sum is equal to B. The same number may be chosen from the array any number of times to make B.
//
//        Note:
//        1. All numbers will be positive integers.
//        2. Elements in a combination (a1, a2, …, ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
//        3. The combinations themselves must be sorted in ascending order.
//Example 1:
//
//        Input:
//        N = 4
//        arr[] = {7,2,6,5}
//        B = 16
//        Output:
//        (2 2 2 2 2 2 2 2)
//        (2 2 2 2 2 6)
//        (2 2 2 5 5)
//        (2 2 5 7)
//        (2 2 6 6)
//        (2 7 7)
//        (5 5 6)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CombinationSum {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(7);
        arr.add(2);
        arr.add(6);
        arr.add(5);
        int sum=16;

        ArrayList<ArrayList<Integer>> ans=combination(arr,sum);
        for (ArrayList<Integer> ar: ans){
            System.out.println(ar);
        }

    }

    private static ArrayList<ArrayList<Integer>> combination(ArrayList<Integer> arr, int sum) {
        //1. Sort arr
        //2. Create a new arraylist with unique elements of arr
        //3. find combination
        Collections.sort(arr);
        ArrayList<Integer> unique=new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            int j=i+1;
            while(j<arr.size() && arr.get(i)==arr.get(j)){
                j++;
            }
            unique.add(arr.get(i));
            i=j-1;
        }
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();//too store list combination array
        ArrayList<Integer> res=new ArrayList<>(); //to store each combination

        findCombo(unique,unique.size(),sum,0,res,ans);
        return ans;
    }

    private static void findCombo(ArrayList<Integer> unique, int size, int sum, int index, ArrayList<Integer> res, ArrayList<ArrayList<Integer>> ans) {
        if(index>=size || sum<0){
            return;
        }
        if(sum==0){
            ans.add(new ArrayList<Integer>(res));
            return;
        }

        //body
        //take the current element at index , sum reduced
        res.add(unique.get(index));
        findCombo(unique,size,sum-unique.get(index),index,res, ans);

        //finally all combinations taken with current index
        //now remove current index value from result array
        res.remove(res.size()-1);


        //goo to next index
        findCombo(unique,size,sum,index+1,res, ans);
    }
}
