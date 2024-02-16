package Arrays.PracticeArray;
//A sorted(in ascending order) array A[ ] with distinct elements is rotated at some unknown point, the task is to find the minimum element in it.
//
//        Example 1
//
//        Input:
//        N = 5
//        arr[] = {4 ,5 ,1 ,2 ,3}
//        Output: 1
//        Explanation: 1 is the minimum element in the array.
//        Example 2
//
//        Input:
//        N = 7
//        arr[] = {10, 20, 30, 40, 50, 5, 7}
//        Output: 5
//        Explanation: Here 5 is the minimum element.
public class MinimumElementInSortedAndRotatedArray {
    //required TC- logn
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,5,7};
        int n=arr.length;
        int s=0;
        int e=n-1;
        while(s<e){            //////////// TRICK- BINARY SEARCH //////////
            int mid=(s+e)/2;
            if(arr[mid] > arr[e]){
                s=mid+1;
            }
            else{
                e=mid;
            }
        }
        System.out.println(arr[s]);
    }
}
