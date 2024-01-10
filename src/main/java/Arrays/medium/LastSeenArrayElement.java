package Arrays.medium;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
/*Given an array arr of N integers that might contain duplicates, find the element whose last appearance is earliest.

Input : arr[] = {10, 30, 20, 10, 20}
Output : 30
Explanation:
Below are indexes of last
appearances of all elements (0 based
indexes). 10 last occurs at index 3
30 last occurs at index 1. 20 last
occurs at index 4 The element whose
last appearance earliest is 30.*/

public class LastSeenArrayElement {
    public static void main(String[] args) {
        int[] arr={1 ,7, 3, 10, 4, 7, 7, 3, 5, 10, 1 ,10, 6 ,3 ,4};
        int n=arr.length;
        Map<Integer,Integer> m=new LinkedHashMap<>();
        int index=n;
        for(int i=0;i<n;i++){
            if(m.containsKey(arr[i])){
                m.put(arr[i],i);
            }
            else{
                m.put(arr[i],i);
            }

        }
        //int ans=-1;
        int minIndx=n;
//        for(Map.Entry<Integer,Integer> entry : m.entrySet()){
//            if(entry.getValue()<minIndx){
//                minIndx=entry.getValue();
//                ans=arr[minIndx];
//            }
//        }

        for(Map.Entry<Integer,Integer> entry : m.entrySet()){
            if(entry.getValue()<minIndx){
                minIndx=entry.getValue();
            }
        }
        System.out.println(arr[minIndx]);
    }
}
