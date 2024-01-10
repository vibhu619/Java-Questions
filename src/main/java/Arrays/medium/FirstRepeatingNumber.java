package Arrays.medium;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
//Given an array arr[] of size n, find the first repeating element.
// The element should occur more than once and the index of its first occurrence should be the smallest.

/*Input:
  n = 7
  arr[] = {1, 5, 3, 4, 3, 5, 6}
  Output: 2*/

import static java.lang.Integer.MAX_VALUE;

public class FirstRepeatingNumber {
    public static void main(String[] args) {
        int[] arr={7 ,4 ,0 ,9 ,4 ,8 ,8 ,2 ,4 ,5 ,5 ,1};
        int n=arr.length;
        Map<Integer,Integer> m=new HashMap<>();

        int potentialAns=MAX_VALUE;
        for(int i=0;i<n;i++){
            if(m.containsKey(arr[i])){
                if(potentialAns>m.get(arr[i])) {
                    potentialAns = m.get(arr[i]);
                }
            }
            else{
                m.put(arr[i],i);
            }
        }
        System.out.println(potentialAns);

    }
}
