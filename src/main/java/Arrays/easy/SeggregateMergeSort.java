package Arrays.easy;
//First negative number than positive number( without changing the order)  --using merge sort
//Maintaining order hence cant use 2 pointer
public class SeggregateMergeSort {
    public static void main(String[] args) {
        int[] arr={ 5, 5,  -3, 4, -8, 0, -7, 3, -9, -3, 9, -2, 1};
        int n=arr.length;
        divide(arr,0,n-1);
        for (int x:arr
             ) {
            System.out.println(x+ " ");

        }

    }

    public static void divide(int arr[], int s, int e){
        if(s>=e){
            return;
        }
        int mid=s+(e-s)/2;  //not using s+e/2 to avoid overflow of data type range
        divide(arr,s,mid); //divide left half
        divide(arr,mid+1,e); //divide right half

        merge(arr,s,mid,e);
    }

    public static void merge(int arr[],int s ,int mid, int e){
        int n1=mid-s+1;  //size of left subarray in arr
        int n2=e-mid;  //size of right subarray in arr/ not including mid

        //two temp array to store left and right subarray elements
        int[] L=new int[n1];
        int[] R=new  int[n2];

        //copy elements into it
        for(int i=0;i<n1;i++){
            L[i]=arr[s+i];
        }
        for(int i=0;i<n2;i++){
            R[i]=arr[mid+1+i]; //starting right sub array from mid+1
        }

        int i=0;
        int j=0;
        int k=s;
        //copy elements back from temp array to original array arr
        //To maintain order and seggregate neg first than positive
        //1) put negative elements of left array
        while(i<n1 && L[i]<0){
            arr[k++]=L[i++];
        }
        //2) put negative elements of right array
        while(j<n2 && R[j]<0){
            arr[k++]=R[j++];
        }
        //3)put rest of elements if left from left array
        while(i<n1){
            arr[k++]=L[i++];
        }
        //4)put rest of elements if left from right array
        while(j<n2){
            arr[k++]=R[j++];
        }
    }
}
