package Arrays.easy;
//Print minimum size of sub array which has sum equals to given sum
//Cant use prefix sub array technique as example includes only Non neg integer--use sliding window
public class SubarrayWithGivenSum {
    public static void main(String[] args) {


        int[] arr = {1,1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        int k = 11;
        int sum=0;
        int j=0;
        int mINSize=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            while(sum>k){
                sum=sum-arr[j];
                j++;
            }
            if(sum==k){
                int ans=i-j+1;
                mINSize=Math.min(mINSize,ans);

            }
        }

        System.out.println("Subarray of size with sum " + mINSize );

    }
}
