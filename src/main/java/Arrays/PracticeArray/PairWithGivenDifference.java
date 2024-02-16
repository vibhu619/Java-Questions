package Arrays.PracticeArray;

import java.util.Arrays;
//Given an array of integers, arr[] and a number, K.
//        You can pair two numbers of the array if the difference between them is strictly less than K.
//        The task is to find the maximum possible sum of such disjoint pairs (i.e., each element of the array can be used at most once).
//        The Sum of P pairs is the sum of all 2P elements of pairs.
//        Example 1:
//
//        Input  :
//        arr[] = {3, 5, 10, 15, 17, 12, 9}
//        K = 4
//        Output :
//        62
//        Explanation :
//        Then disjoint pairs with difference less
//        than K are, (3, 5), (10, 12), (15, 17)
//        max sum which we can get is
//        3 + 5 + 10 + 12 + 15 + 17 = 62
//        Note that an alternate way to form
//        disjoint pairs is,(3, 5), (9, 12), (15, 17)
//        but this pairing produces less sum.
public class PairWithGivenDifference {
    public static void main(String[] args) {
        int [] arr={5, 15, 10, 300};
        int n=arr.length;
        int k=12;
        Arrays.sort(arr);              /////// TRICK - SORTING /////////////
        int sum=0;
        for(int i=n-1;i>0;i--){
            if(arr[i]-arr[i-1] >= k){
                continue;
            }
            else {
                sum = sum + arr[i] + arr[i - 1];
                i--;
            }
        }
        System.out.println(sum);
    }
}
