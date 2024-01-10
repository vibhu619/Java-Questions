package String.Hard;

import javax.swing.text.MaskFormatter;
import java.util.HashMap;
import java.util.Map;
//Given a string you need to print longest possible substring that has exactly M unique characters. If there is more than one substring of longest possible length, then print any one of them.
//
//        Examples:
//
//        Input: Str = “aabbcc”, k = 1
//        Output: 2
//        Explanation: Max substring can be any one from {“aa” , “bb” , “cc”}.
//
//        Input: Str = “aabbcc”, k = 2
//        Output: 4
//        Explanation: Max substring can be any one from {“aabb” , “bbcc”}.
public class LongestSubstringWithKUnique {
    public static void main(String[] args) {
        String str="aabacbebebe";
        int k=3;
        System.out.println(unique(str,k));
    }

    private static Integer unique(String str, int k) {
        Map<Character,Integer> distinct=new HashMap<>();
        int ans=-1;
        int i=-1;
        int j=-1;

        boolean flag1=true;
        boolean flag2=true;

        while(flag1 || flag2){
            flag1=false;
            flag2=false;

            while(i<str.length()-1){
                flag1=true;
                i++;
                char ch=str.charAt(i);

                distinct.put(ch, distinct.getOrDefault(ch,0)+1);

                if(distinct.size()<k){
                    continue;
                }
                else if(distinct.size()==k){
                    int len=i-j;
                    ans=Math.max(ans,len);
                }
                else{
                    break;
                }

            }
            while(i<j){
                flag2=true;
                j++;
                char ch=str.charAt(j);
                if(distinct.get(ch)==1){
                    distinct.remove(ch);
                }
                else{
                    distinct.put(ch,distinct.get(ch)-1);
                }

                if(distinct.size()==k){
                    int len=i-j;
                    ans= Math.max(ans,len);
                    break;
                }
                else{
                    continue;
                }

            }


        }
        return ans;
    }
}
