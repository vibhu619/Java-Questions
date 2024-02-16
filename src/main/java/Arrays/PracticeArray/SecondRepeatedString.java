package Arrays.PracticeArray;

import java.util.HashMap;
import java.util.Map;

//Given a sequence of strings, the task is to find out the second most repeated (or frequent) string in the given sequence.
//
//        Note: No two strings are the second most repeated, there will be always a single string.
//
//        Example 1:
//
//        Input:
//        N = 6
//        arr[] = {aaa, bbb, ccc, bbb, aaa, aaa}
//        Output: bbb
//        Explanation: "bbb" is the second most
//        occurring string with frequency 2.
public class SecondRepeatedString {
    public static void main(String[] args) {
        String[] arr={"aaa", "bbb", "ccc", "bbb", "aaa", "aaa"};
        Map<String,Integer> map=new HashMap<>();      //////// TRICK USING HASHMAP -- BCZ FREQUENCY RELATED QUESTION /////////
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        int high=0;
        String max="";
        for(String key : map.keySet()){
            if (map.get(key)>high){
                high=map.get(key);
                max=key;
            }
        }
        map.remove(max);
        int freq=0;
        for(String key : map.keySet()){
            if (map.get(key)>freq){
                freq=map.get(key);
                max=key;
            }
        }

        if(map.size()==0){   //corner case when only one element
            System.out.println("");}
        else
            System.out.println(max);
    }
}
