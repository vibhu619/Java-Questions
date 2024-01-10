package Recursion.Easy;

public class FibonacciSeries {
    static long[] res=new long[6];
    public static void main(String[] args) {
        res[0]=0;
        res[1]=1;
        fib(5,2);
        for(long i:res){
            System.out.println(i);
        }
    }
    static long[] fib(int N, int index){
        if(N<index){
            return res;
        }
        res[index]=res[index-1]+res[index-2];
        return fib(N,index+1);
    }
}
