package Recursion.Easy;

import java.util.ArrayList;
import java.util.List;

public class juggleSequence {
    static List<Integer> list=new ArrayList<>();
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        fun(9,list);
        for(int i:list){
            System.out.println(i);
        }
    }
    // code here
    public static List<Integer> fun(int N, List<Integer> list){
        if(N==1){
            list.add(1);
            return list;
        }
        list.add(N);
        if(N%2==0){
            fun((int)Math.pow(N,0.5),list);
        }
        else{
            fun((int)Math.pow(N,1.5),list);
        }
        return list;
    }
}
