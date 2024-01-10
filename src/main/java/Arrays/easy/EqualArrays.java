package Arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class EqualArrays {
    public static void main(String[] args) {
        int[] A={1,2,5,4,0};
        int[] B={2,4,5,6,1};
        int N=5;
        System.out.println(equalOrNot(A,B,N));

    }

    private static boolean equalOrNot(int[] A, int[] B, int N) {
        //Your code here

        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<N;i++){
            m.put(A[i],m.getOrDefault(A[i],0)+1);
        }

        for(int i=0;i<N;i++){
            if(m.containsKey(B[i])){
                m.put(B[i],m.get(B[i])-1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : m.entrySet()){
            if(entry.getValue()!=0){
                return false;
            }
        }
        return true;
    }
}
