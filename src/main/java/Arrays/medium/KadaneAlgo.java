package Arrays.medium;
//Given an array Arr[] of N integers. Find the contiguous
// sub-array(containing at least one number) which has the maximum sum and return its sum.
public class KadaneAlgo {
    public static void main(String[] args) {
        int[] arr= {-2, -3, 4, -1, -2, 1, 5, -3};

        int n= arr.length;
        int ms=0;
        int cs=0;

        for(int i=0;i<n;i++){
            cs=cs+arr[i];

            if(cs<0){
                cs=0;
            }
            ms=Math.max(ms,cs);

        }
        System.out.println(ms);
    }
}
