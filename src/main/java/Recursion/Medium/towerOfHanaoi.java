package Recursion.Medium;

import java.util.ArrayList;

public class towerOfHanaoi {
    public static void main(String[] args) {
        int n=4;
        towerhanaoi(n,"S", "H","D");
    }

    private static void towerhanaoi(int n, String src, String helper, String dest) {
        //base case - only 1 disk
        if(n==1){
            System.out.println("Move disk "+n + " from " +src +" to "+ dest);
            return;
        }
        //Body
        //1. move n-1 disk from  src to helper -----> helper is now destination rod and destination rod become helper
        towerhanaoi(n-1,src,dest,helper);
        System.out.println("Move disk "+n + " from " +src +" to "+ dest);
        //2. move 1 disk from src to dest-- base

        //3. Move n-1 disk from helper to destination----> helper is now src rod and src rod is helper
        towerhanaoi(n-1,helper,src,dest);



    }
}
