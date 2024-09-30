package Arrays.easy;

import java.util.ArrayList;
//Given an unsorted array Arr of N positive and negative numbers. Your task is to create an array of alternate
// positive and negative numbers without changing the relative order of positive and negative numbers.

//tc- o[n^2]
public class AlternateNegPosWithoutExtraSpace {
    public static void main(String[] args) {
        int[] arr={-15 ,30, 43, -18, -38, 38, 36, 78, -22, -68 ,16, 39, -41, -15, 98, 69, -72, -32};
        int n=arr.length;

        rearrange(arr,n);

        for (int x:arr
        ) {
            System.out.println(x + " ");

        }
    }

    private static void rearrange(int[] arr, int n) {
        //iterate through array
        for(int i=0;i<n;i++){

            //check the element .if its positive and is at odd index, means it's out of place.
            if(arr[i]>0 && i%2!=0){
                //hence find an immediate next negative number after this element which is out of place
                for(int j=i+1;j<n;j++){
                    if(arr[j]<0){
                        rightRotate(arr,i,j);   //and rotate clockwise from that out of place element to an immediate negative number
                        break;
                    }
                }
            }

            //check the element .if its negative and is at even index, means it's out of place.
            else if(arr[i]<0 && i%2==0){
                //hence find an immediate next positive number after this element which is out of place
                for(int j=i+1;j<n;j++){
                    if(arr[j]>0){
                        rightRotate(arr,i,j);  //and rotate to bring correct positive number at place of negative number
                        break;
                    }
                }
            }
        }
    }

    private static void rightRotate(int[] arr, int start, int end) {
        int temp=arr[end];
        for(int i=end;i>start;i--){
            arr[i]=arr[i-1];
        }
        arr[start]=temp;
    }
}
