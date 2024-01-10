package Arrays.easy;


import static java.lang.Integer.*;
//Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.

class Pair{
    int first;
    int second;

    public Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
public class MinMax {
    public static void main(String[] args) {


       // int[] a = {3, 2, 1, 56, 10000, 167};

        int[] a = {1, 345, 234, 21, 56789};


        int maxi=MIN_VALUE;
        int mini=MAX_VALUE;
        Pair p=new Pair(mini,maxi);
        int n = a.length;
        for(int i=0;i<n;i++){
            mini=min(mini,a[i]);
            maxi=max(maxi,a[i]);
        }

        p.first=mini;
        p.second=maxi;

        System.out.println("min: " + p.first + " max: " + p.second);


}

}
