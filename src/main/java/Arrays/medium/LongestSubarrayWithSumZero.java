package Arrays.medium;

import java.util.HashMap;
//Use prefix subarray technique: no sorted array with negative integers
public class LongestSubarrayWithSumZero {
    public static void main(String[] args) {
        int[] arr = { 15, -2, 2, -8, 1, 7, 10, 23 };
        int n=arr.length;
        System.out.println(maximumSubarray(arr,n));
    }


    private static int maximumSubarray(int[] arr, int n) {
        int prefixSum=0;
        int maxL=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            prefixSum=prefixSum+arr[i];  //calculate prefix sum on the fly
            if(prefixSum==0){  //if prefix sum itself is 0 hence subarray from i=0 is having sum 0
                maxL=Math.max(maxL,i+1);
            }
            //if map contains prefix sum hence it will make subarray sum 0
            if(map.containsKey(prefixSum)){
                maxL=Math.max(maxL,i-map.get(prefixSum));
            }
            else {
                map.put(prefixSum,i);
            }
        }
        return maxL;
    }
}
