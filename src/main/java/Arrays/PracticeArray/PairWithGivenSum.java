package Arrays.PracticeArray;

import java.util.Arrays;

class pair  {
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}
public class PairWithGivenSum {
    public static void main(String[] args) {
        long[] A={1, 2, 4, 5, 7};
        long[] B={5, 6, 3, 4, 8};
        int N=A.length;
        int M=B.length;
        long X=9;
        Arrays.sort(A);
        Arrays.sort(B);
        pair[] res=new pair[N];
        int k=0;
        int i=0;
        int j=M-1;

        while(i<N && j>=0){
            if(A[i]+B[j]==X){
                pair p=new pair(A[i],B[j]);
                res[k]=p;
                k++;
                i++;
                j--;

            }
            else if(A[i]+B[j]<X){
                i++;
            }
            else{
                j--;
            }
        }
        for(int l=0;l< res.length;l++){
            pair p=res[l];
            System.out.println(p.first + " " +p.second);
        }
    }
}
