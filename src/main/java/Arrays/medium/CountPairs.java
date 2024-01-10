package Arrays.medium;

import java.util.HashMap;
import java.util.Map;
//Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.

/*Input:
N = 4, K = 2
arr[] = {1, 1, 1, 1}
Output: 6*/

public class CountPairs {
    public static void main(String[] args) {
        int[] arr={1,1,1,1};
        int n=arr.length;
        int k=2;
        HashMap<Integer,Integer> m=new HashMap<>();
        int count=0;
        for(int i=0;i<n;i++){
            if(m.containsKey(k-arr[i])){
                count=count+m.get(k-arr[i]);
            }

            if(m.containsKey(arr[i])){
                m.put(arr[i],m.get(arr[i])+1);
            }
            else{
                m.put(arr[i],1);
            }
        }
        System.out.println(count);
    }
}
