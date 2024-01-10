package Recursion.Hard;
//https://www.geeksforgeeks.org/minimum-number-of-jumps-to-reach-end-of-a-given-array/
public class MinJumps {
    public static int ans=Integer.MAX_VALUE;
    public static void main(String[] args) {
        int[] arr={1, 4, 3, 2, 6, 7};

        int n=arr.length;
        int i=0;
         int c=0;
        jumps(arr,n,i,c);
        System.out.println(ans);
    }


    private static void jumps(int[] arr, int n, int index,int count) {
        if(index>=n){
            return;
        }
        if(index==n-1){
            ans=Math.min(ans,count);
        }
        int curr=arr[index];
        for(int k=1;k<=curr;k++){
            jumps(arr,n,index+k,count+1);

        }
    }
}
