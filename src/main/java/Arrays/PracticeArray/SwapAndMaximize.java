package Arrays.PracticeArray;

import java.util.Arrays;
//Given an array a[ ] of N elements. Consider array as a circular array i.e. element after an is a1.
// task is to find maximum sum of the absolute difference between consecutive elements with rearrangement of array elements allowed i.e.
// after any rearrangement of array elements find |a1 – a2| + |a2 – a3| + …… + |an-1 – an| + |an – a1|.
//
//        Example 1:
//
//        Input:
//        N = 4
//        a[] = {4, 2, 1, 8}
//        Output:
//        18
//        Explanation: Rearrangement done is {1, 8,
//        2, 4}. Sum of absolute difference between
//        consecutive elements after rearrangement =
//        |1 - 8| + |8 - 2| + |2 - 4| + |4 - 1| =
//        7 + 6 + 2 + 3 = 18.
public class SwapAndMaximize {
    public static void main(String[] args) {
        int[] arr={4, 2, 1, 8};
        int n=arr.length;
        Arrays.sort(arr);  ////////TRICK - SORTING ////////
        int i=0;
        int j=n-1;
        long sum=0;
        while(i<j){
            sum+=Math.abs(arr[i]-arr[j]); //as elements after n/2 is getting add twice ,one with arr[i] and another with arr[i-1]
            sum+=Math.abs(arr[i+1]-arr[j]);
            i++;
            j--;
        }
        sum+=Math.abs(arr[0]-arr[i]);
        System.out.println(sum);
    }
}
