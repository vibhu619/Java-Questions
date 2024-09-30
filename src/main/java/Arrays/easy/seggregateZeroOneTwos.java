package Arrays.easy;
//Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
public class seggregateZeroOneTwos {
    public static void main(String[] args) {


        int[] arr = {1, 0, 2, 0, 2, 1, 0, 2, 1};
        int n = arr.length;
        int i=0;  //used for iteration
        int l=0;  //keep track for 0's
        int r=n-1; //keep track for 2's
        //note- 1 will automatically manage
        while (i <=r) {
            if(arr[i]==0){
                //if 0 swap arr[i] and arr[l] & increment i and l
                int temp=arr[l];
                arr[l]=arr[i];
                arr[i]=temp;
                i++;
                l++;
            } else if (arr[i]==1) {
                //if 1 do nothing just increment i
                i++;


            }
            else{
                //if 2 just swap arr[i] and arr[r] && decrement r
                int temp=arr[r];
                arr[r]=arr[i];
                arr[i]=temp;
                r--;
            }

        }

        for (int x:arr
             ) {
            System.out.println(x + " ");

        }
    }
}
