package Recursion;

import java.util.ArrayList;

//print all subset of n natural numbers
public class AllSubset {
    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> arr=new ArrayList<>();
        subset(n,arr);
    }

    private static void subset(int n, ArrayList<Integer> arr) {
        if(n==0){
            printsubset(arr);
            return;
        }

        //add hoga
        arr.add(n);
        subset(n-1,arr);

        //add ni hoga...but upar add kia to hatana pdega--- which was added at the last of arraylist
        arr.remove(arr.get(arr.size()-1));
        subset(n-1,arr);


    }

    private static void printsubset(ArrayList<Integer> arr) {
        for (Integer integer : arr) {
            System.out.print(integer);

        }
        System.out.println('\n');

    }
}
