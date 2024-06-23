package Recursion.Easy;

public class RecursiveSequence {
    public static void main(String[] args) {

        System.out.println(lastNon0Digit(84));
    }

    static int lastNon0Digit(int N){
        int n=fac(N);
        String str=String.valueOf(n);
        char potans='\0';
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='0'){
                potans=str.charAt(i);
            }
        }
        return Character.getNumericValue(potans);

    }
    public static int fac(int N){
        if(N==0){
            return 1;
        }
        return (N*fac(N-1))%1000000000;
    }
}
