package Arrays.easy;

import java.util.Scanner;

//Provided an array Arr of N integers, you need to reverse a subarray of that array. The range of this subarray is given by L and R.

public class ReverseSubarray {
    public static void main(String[] args) {


        int[] arr = {1, 4, 2, 3, 5, 7, 9, 8};
        int n = arr.length;
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();  //1 based indexing
        int r = scanner.nextInt(); //1 based indexing
         int l1=l-1;
        int r1=r-1;
        while(l1<r1){
            //swap arr[l] and arr[r]
            int temp= arr[r1];
            arr[r1]=arr[l1];
            arr[l1]=temp;

            l1++;
            r1--;
        }

        for (int x: arr
             ) {
            System.out.println(x+ " ");

        }
    }
}
