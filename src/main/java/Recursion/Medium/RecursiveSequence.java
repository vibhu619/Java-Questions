package Recursion.Medium;

public class RecursiveSequence {
    public static void main(String[] args) {
        int n  =7;
        System.out.println(sequence(n));
    }

    static long sequence(int n){
        // code here

        long ans=seqRec(n,1,1);
        return ans;
    }

    static long seqRec(int n,int i,int jump){
        if(jump>n){
            return 0;
        }


        //body
        long mul=1;
        int temp=jump;
        while(temp>0){
            mul=mul*i;
            i++;
            temp--;
        }
        return mul+seqRec(n,i,jump+1);
    }
}
