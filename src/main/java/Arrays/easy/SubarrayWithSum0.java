package Arrays.easy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
//Given an array of positive and negative numbers. Find if there is a subarray (of size at-least one) with 0 sum

//Used prefix subarray technique when both positive and negative integer present
public class SubarrayWithSum0 {
    public static void main(String[] args) {
        int[] arr={4 ,2 ,0 ,1 ,6};
        int n=arr.length;
        Map<Integer,Integer> m=new LinkedHashMap<>();
        m.put(0,1);
        int lastKey=0;
        boolean bo=false;
        for(int i=0;i<n;i++){
            int newKey=lastKey+arr[i];  //making newKey = a[i] + lastKey to avoid making the cummulative array, directly storing cummulative key in map
            if(m.containsKey(newKey)){
                m.put(newKey,m.get(newKey)+1);
                bo=true;
                break;

            }
            else{
                m.put(newKey,1);
            }
            lastKey=newKey;
        }

        if(bo)
            System.out.println("Yes");
        else
            System.out.println("No");


    }
}
