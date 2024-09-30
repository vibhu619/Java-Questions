package Arrays.easy;

import java.util.ArrayList;
//Given an unsorted array Arr of N positive and negative numbers. Your task is to create an array of alternate
// positive and negative numbers without changing the relative order of positive and negative numbers.

//This is two array use with Tc- O(N) and SC- O(N)
public class AlternateNegPos {
    public static void main(String[] args) {
        int[] arr={-15 ,30, 43, -18, -38, 38, 36, 78, -22, -68 ,16, 39, -41, -15, 98, 69, -72, -32};
        int n=arr.length;

        //Take 2 list each for storing positive and negative elements
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                pos.add(arr[i]);
            }
            else
                neg.add(arr[i]);
        }

        int m=pos.size();
        int k=neg.size();


        int posIndex=0;
        int negIndex=0;
        int i=0;

        //Fill array alternatively(positive at even place and negative at odd place) till both arraylist have elements
        while(posIndex < m && negIndex < k && i<n){
            if(i%2==0) {
                arr[i] = pos.get(posIndex);
                posIndex++;
            }
            else {
                arr[i] = neg.get(negIndex);
                negIndex++;
            }
            i++;


        }

        //See if elements are left in positive array than fill them in original array
        while (posIndex<m && i<n){
            arr[i]=pos.get(posIndex);
            posIndex++;
            i++;

        }

        //See if elements are left in negative array than fill them in original array
        while (negIndex<k && i<n){
            arr[i]=pos.get(negIndex);
            negIndex++;
            i++;

        }


        for (int x:arr
        ) {
            System.out.println(x + " ");

        }



    }
}
