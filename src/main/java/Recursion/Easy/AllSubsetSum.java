package Recursion.Easy;

import java.util.ArrayList;
//Given a list arr of N integers, return sums of all subsets in it.
public class AllSubsetSum {
    private static ArrayList<Integer> ans=new ArrayList<>();
    public static void main(String[] args) {
        int[] arr={2 ,5 ,8 ,11, 13};
        ArrayList<Integer> res=new ArrayList<>();
        subsetSum(arr,0,res);

        for (Integer an : ans) {
            System.out.println(an);
        }

    }

    private static void subsetSum(int[] arr, int index, ArrayList<Integer> res) {
        if(index==arr.length){
            int sum=0;
            for (Integer re : res) {
                sum += re;
            }
            ans.add(sum);
            return;

        }
        //take that element
        res.add(arr[index]);
        subsetSum(arr,index+1,res);

        //dont take
        res.remove(res.get(res.size()-1));
        subsetSum(arr,index+1,res);
    }
}
