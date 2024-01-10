package String.Easy;

import java.util.HashMap;
import java.util.Map;
//Given string str consisting of lowercase English alphabets, the task is to find the total number of palindromic sub-strings present in the sorted form of str.
//Input: str = “acbbd”
//        Output: 6
//        All palindromic sub-string in it’s sorted form (“abbcd”) are “a”, “b”, “b”, “bb”, “c” and “d”.
public class PalindromStrings {
    public static void main(String[] args) {
        String str="abbabdbd";
        Map<Character,Integer> m=new HashMap<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(m.containsKey(ch)){
                m.put(ch,m.get(ch)+1);
            }
            else
                m.put(ch,1);
        }
        int ans=0;
        for(Map.Entry<Character,Integer>  entry:m.entrySet()){
            int res=entry.getValue();
            ans= (res*(res+1))/2 + ans;
        }
        System.out.println(ans);
    }
}
