package Arrays.medium;

public class MinimumLengthSubarraySumGreaterGivenValue {
    public static void main(String[] args) {
        int[] arr={1, 11, 100, 1, 0, 200, 3, 2, 1, 250};
        int n=arr.length;

        int x=280;

        int start=0;
        int cs=0;
        int minL=n+1;

        //corner case if array has 1 element and greater than x
        if(arr.length==1 && arr[0]>x){
            System.out.println(1);;
        }
        for(int i=0;i<n;i++){
            //simply add each element one by one
            //if adding element doesnt make cs > x then add it to cs
            if(arr[i]+cs<x){
                cs=cs+arr[i];
            }
            //else
            else{
                cs=cs+arr[i]; //add it to cs to make cs>x
                //then store potential ans as cs>x
                //and remove the elements from start to check if another subarray exist with minimum length
                while(i<n && cs>x){
                    minL=Math.min(minL,i-start+1);
                    cs=cs-arr[start];
                    start++;


                }
            }

        }
        if(minL>=n){
            System.out.println("Not possible");
        }
        else
            System.out.println(minL);
    }
}
