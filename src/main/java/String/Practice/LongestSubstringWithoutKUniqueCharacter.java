package String.Practice;

import java.util.HashMap;
import java.util.Map;
//Given a string you need to print the size of the longest possible substring that has exactly K unique characters.
// If there is no possible substring then print -1.
//
//Example 1:
//
//Input:
//S = "aabacbebebe", K = 3
//Output:
//7
//Explanation:
//"cbebebe" is the longest substring with 3 distinct characters.
//Example 2:
//
//Input:
//S = "aaaa", K = 2
//Output: -1
//Explanation:
//There's no substring with 2 distinct characters.
public class LongestSubstringWithoutKUniqueCharacter {
    public static void main(String[] args) {
        String s="aabacbebebe";
        int k=3;

        ans(s,k);

    }

    private static void ans(String s, int k) {
        Map<Character,Integer> m=new HashMap<>();
        int left=0;
        int max=0;
        for(int i=0;i<s.length();i++){

            //1. store each character in map
            if(m.containsKey(s.charAt(i))){
                m.put(s.charAt(i),m.get(s.charAt(i))+1);
            }
            else{
                m.put(s.charAt(i),1);
            }

            //if map size is more than k means more than k unique characters we got, then start removing character from map till its size become k again
            if(m.size()>k){
                while(m.size()!=k){
                    m.put(s.charAt(left),m.get(s.charAt(left))-1);
                    if(m.get(s.charAt(left))==0){
                        m.remove(s.charAt(left));
                    }
                    left++;
                }
            }
            //if size becomes k , check length of the substring is maximum or not
            if(m.size()==k){
                max=Math.max(i-left+1,max);
            }

        }
        System.out.println(max);
    }
}
