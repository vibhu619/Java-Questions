package String.Hard;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithUniqueChar {
    public static void main(String[] args) {
        String str="aewergrththy";
        int n=str.length();
       int ans=-1;
       int i=0;
        Map<Character,Integer>  map=new HashMap<>();
       while(i<str.length()){
           char ch=str.charAt(i);
           if(!map.containsKey(ch)){
               map.put(ch,1);
           }
           else{
               int len=map.size();
               ans=Math.max(ans,len);
               map.clear();
               map.put(ch,1);
           }
           i++;


       }
        System.out.println(ans);
    }
}
