package Recursion.Medium;
//Given an integer N representing the number of pairs of parentheses, the task is to generate all combinations of well-formed(balanced) parentheses.
//
//
//        Example 1:
//
//        Input:
//        N = 3
//        Output:
//        ((()))
//        (()())
//        (())()
//        ()(())
//        ()()()
public class ParenthesisCombination {
    public static void main(String[] args) {
        int n=3;
        //start of all combination will be with '('
        combinationPara(n,"(",1,0);
    }

    private static void combinationPara(int n,String ns,int open,int close) {
        //base
        if(open>n || close>n){
            return;
        }
        //close will tell if we reach n pairs or not
        if(close==n){
            System.out.println(ns);
            return;
        }

        //body
        //at every point we have two options
        //either take '('
        combinationPara(n,ns+'(',open+1,close);

        //or take ')'
        //but we can take ')' only when open and close bracket count are not equal
        if(open!=close){
            combinationPara(n,ns+')',open,close+1);
        }
    }
}
