package Arrays.easy;
//Cant use prefix subarray technique as example includes only Non neg integer--use sliding window
public class SubarrayWithGivenSum {
    public static void main(String[] args) {


        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        int k = 15;
        int sum=0;
        int size=0;
        int f=0;
        int l=0;
        for (int i = 0; i < n; i++) {

            if(sum+arr[i]<k){
                sum=sum+arr[i];
                size++;
            }
            else if(sum+arr[i]==k){
                f=0;
                l=i;
                break;
            }
            else
                break;
        }
        int window_sum=sum;
        for(int i=size;i<n;i++){
            window_sum+=arr[i]-arr[i-size];
            if(window_sum==k){
                f=i-size+1;
                l=i;

            }
        }

        System.out.println(f + " " + l);


    }
}
