package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepetitivCharacteer {
    public static void main(String[] args) {
        String str="abbcadc";

        Queue<Character> q=new LinkedList<>();

        int[] freq=new int[27];

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;
        }

        while(!q.isEmpty()){
            int idx=q.peek()-'a';
            if(freq[idx]>1){
                q.remove();
            }
            else{
                System.out.println(q.peek());
                break;
            }
        }
        if(q.isEmpty()){
            System.out.println("-1");
        }
    }
}
