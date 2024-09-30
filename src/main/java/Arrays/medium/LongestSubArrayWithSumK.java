package Arrays.medium;

import java.util.HashMap;

//Given an array arr containing n integers and an integer k.
// Your task is to find the length of the longest Sub-Array with the sum of the elements equal to the given value k.
//
//
//
//        Examples:
//
//
//        Input :
//        arr[] = {10, 5, 2, 7, 1, 9}, k = 15
//        Output : 4
//        Explanation:
//        The sub-array is {5, 2, 7, 1}.
//
//
//        Input :
//        arr[] = {-1, 2, 3}, k = 6
//        Output : 0
//        Explanation:
//        There is no such sub-array with sum 6.
public class LongestSubArrayWithSumK {

    public static void main(String[] args) {
        int arr[] = {10, 5, 2, 7, 1, 9};
        int k=15;
        System.out.println(lenOfLongSubarr(arr,arr.length,k));
    }


    //if we have only positive numbers we could have used sliding window technique
    //but we have negative number too hence we used hashmap to calculate and  prefix sub array sum technique
    public static int lenOfLongSubarr (int arr[], int N, int K) {
        //Complete the function
        int sum=0;
        int ml=0;
//        Prefix Sum: We maintain a running sum of elements.
//        HashMap: Stores the first occurrence of each prefix sum and its index.
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<N;i++){
            sum=sum+arr[i];
            if(sum==K){   //If the current sum equals K, the entire sub-array from the start to the current index has the sum K, so update the maxLength.
                ml=Math.max(ml,i+1);
            }
            if(m.containsKey(sum-K)){   //If sum - K exists in the map, it means there's a sub-array that sums up to K, and we update the maxLength.
                ml=Math.max(ml,i-m.get(sum-K));
            }
            if(!m.containsKey(sum)){  //else store prefix sum in hashmap with index
                m.put(sum,i);
            }
        }

        return ml;

    }
}
