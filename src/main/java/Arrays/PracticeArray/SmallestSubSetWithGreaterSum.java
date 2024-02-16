package Arrays.PracticeArray;

import java.util.Arrays;
//You are given an array Arr of size N containing non-negative integers.
//Your task is to choose the minimum number of elements such that their sum should be greater than the sum of the rest of the elements of the array.
public class SmallestSubSetWithGreaterSum {
    public static void main(String[] args) {
        int [] arr={20, 12, 18, 4};
        int n=arr.length;
        Arrays.sort(arr);      ////////TRICK - SORTING ////////
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        int tempSum=0;
        int c=0;
        for(int i=n-1;i>=0;i--){
            c++;
            tempSum=tempSum+arr[i];
            if(tempSum>sum-tempSum){
                System.out.println(c);
                break;
            }
        }
        //System.out.println(-1);;
    }
}
