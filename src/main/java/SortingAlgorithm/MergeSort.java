package SortingAlgorithm;

public class MergeSort {
    public static void main(String[] args) {


        int[] arr = {1, 4, -2, 9, 6, 8, 3, 23, 16, 0, -5};
        int n = arr.length;
        divide(arr, 0, n - 1);

        for (int x:arr
             ) {
            System.out.println(x + " ");
        }
    }

    public static void divide(int arr[],int s,int e) {
        //Base condition-only one element in array
        if (s >= e) {
            return;
        }
        if (s < e) {
            int mid = s + (e - s) / 2; //finding mid element
            divide(arr, s, mid);  //recursive divide array for left subarray
            divide(arr, mid + 1, e); //recursive divide array for right subarray

            merge(arr, s, mid, e);  //merge
        }
    }

    /*public static void merge(int arr[],int s,int mid, int e){
        int[] merge=new int[e-s+1];  //new array to store merger array

        int l=s;  //to track index of left subarray
        int r=mid+1; //to track index of right subarray
        int k=0;  //to track index of new merger array

        while(l<=mid && r<=e){
            //keep that element first in mergerd array which is smaller from both left and right subarray
            if(arr[l] <= arr[r])
                merge[k++]=arr[l++];
            else
                merge[k++]=arr[r++];
        }
        //check if any element is left in left subarray , then add in mergerd array
        while(l<=mid){
            merge[k++]=arr[l++];
        }
        //check if any element is right in left subarray , then add in mergerd array
        while(r<=e){
            merge[k++]=arr[r++];
        }

        //copy elements from merged array to original array
        for(int i=0,j=s; i<merge.length;i++,j++){
            arr[j]=merge[i];
        }
    }*/

    public static void merge(int arr[],int s, int mid, int e){
        int n1=mid-s+1;  //size of left subarray
        int n2=e-mid;  //size of right subarray

        //Create two subarray left and right
        int[] L=new int[n1];
        int[] R=new int[n2];

        //Copy data from subarray created virtually in arr to these two subarray
        for(int i=0;i<n1;i++){
            L[i]=arr[s+i];
        }
        for(int i=0;i<n2;i++){
            R[i]=arr[mid+1+i];
        }

        int i=0;  //track the left subarray
        int j=0;  //track the right subarray
        int k=s; //track the merged array(which is original array) as we are again taking data back to original array arr  ****IMP****

        //Copy data from L and R till both n1 and n2 are not exhausted
        while(i<n1 && j<n2){
            //if element from left subarray is smaller, copy that element in arr
            if(L[i] <= R[j]){
                arr[k]=L[i];
                i++;
            }
            //else element from right subarray is smaller, copy that element in arr
            else{
                arr[k]=R[j];
                j++;
            }
            k++;
        }

        //copy the rest of element from L if R exhausts
        while(i<n1){
            arr[k++]=L[i++];
        }

        //copy the rest of element from R if L exhausts
        while(j<n2){
            arr[k++]=R[j++];
        }
    }
}
