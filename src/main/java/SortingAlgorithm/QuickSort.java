package SortingAlgorithm;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={6,3,9,5,10,2,8};
        int n=arr.length;
        int low=0;
        int high=n-1;
        quickSort(arr,low,high,n);

        for (int x:arr
             ) {
            System.out.println(x+ ",");

        }
    }

    private static void quickSort(int[] arr, int low, int high, int n) {
        //do sorting till u get only one element
        if(low<high){
            int pivot=partiton(arr,low,high,n);  //find pivot index

            quickSort(arr,low,pivot-1,n);  //sort left part of pivot
            quickSort(arr,pivot+1,high,n);  //sort right part of pivot
        }

    }

    private static int partiton(int[] arr, int low, int high, int n) {
        int pivot=high;  //place pivot at last index
        int i=low-1;
        for(int j=low;j<high;j++){  //iterate array with j
            //if arr[j] is smaller than pivot element
            //then i++ and swap arr[i] and arr[j]
            if(arr[j]<arr[pivot]){
                i++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        //now place pivot at correct position
        i++;
        int temp =arr[i];
        arr[i]=arr[pivot];
        arr[pivot]=temp;

        return i;
    }
}
