package Arrays.medium;
//BINARY SEARCH APPROACH
public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int[] arr={5, 7, 7 ,7 ,8, 8, 8};
        int n=arr.length;
        int k=8;
        int first=firstOccc(arr,0,n-1,k);
        int last=lastOcc(arr,0,n-1,k);
        System.out.println(first+ " "+ last);
    }

    private static int lastOcc(int[] arr, int s, int e, int k) {

        int pot=Integer.MIN_VALUE;

        while(s<=e){
            int mid=(e+s)/2;
            if(arr[mid]==k){
                pot=Math.max(pot,mid);
                s=mid+1;
            }
            else if(arr[mid]>k){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return pot;
    }

    private static int firstOccc(int[] arr, int s, int e,int k) {

        int pot=Integer.MAX_VALUE;

        while(s<=e){

            int mid=(e+s)/2;
            if(arr[mid]==k){
                pot=Math.min(mid,pot);
                e=mid-1;
            }
            else if(arr[mid]<k){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return pot;

    }
}
