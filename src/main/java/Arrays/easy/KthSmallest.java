package Arrays.easy;

import java.util.Scanner;
//Given an array arr[] and an integer K where K is smaller than size of array, the task
// is to find the Kth smallest element in the given array. It is given that all array elements are distinct.

//Used quick sort to sort the array
public class KthSmallest {
    public static void main(String[] args) {
        int[] arr={7 ,10, 4, 3, 20, 15};
        int n=arr.length;
        Scanner scanner=new Scanner(System.in);
        int k= scanner.nextInt();
        int low=0;
        int high=n-1;

        quickSort(arr,n,low,high);
        System.out.println(arr[k-1]);
    }

    private static void quickSort(int[] arr, int n, int low, int high) {
        if(low<high){
            //find pivot
            int pivot=partition(arr,n,low,high);

            //do quicksort on left and right part
            quickSort(arr,n,low,pivot-1);
            quickSort(arr,n,pivot+1,high);

        }
    }

    private static int partition(int[] arr, int n, int low, int high) {
        int pivotIdx=high; //initially pivot is at high
        int i=low-1; //and i at low -1

        //iterate j and only increment i and swap arr[i] and arr[j] if arr[i]<pivot element
        for(int j=low;j<high;j++){
            if(arr[j]<arr[pivotIdx]){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        //finally u reach at pivot element
        i++;
        int temp=arr[i];
        arr[i]=arr[pivotIdx];
        arr[pivotIdx]=temp;

        //return pivot index after swapping
        return i;
    }
}
