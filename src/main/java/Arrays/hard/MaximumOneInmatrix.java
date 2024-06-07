package Arrays.hard;
//Given a boolean 2D array of n x m dimensions, consisting of only 1's and 0's,
//        where each row is sorted. Find the 0-based index of the first row that has the maximum number of 1's.
//        Input:
//        N = 4 , M = 4
//        Arr[][] = {{0, 1, 1, 1},
//        {0, 0, 1, 1},
//        {1, 1, 1, 1},
//        {0, 0, 0, 0}}
//        Output: 2
//        Explanation: Row 2 contains 4 1's (0-based
//        indexing).
public class MaximumOneInmatrix {
    public static void main(String[] args) {
        int[][] arr={{0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};

        int n=4;
        int m=4;

        //We could have done through brute force approach by going through each row and keeping count of 1. It will take TC(N*M)
        //Another sol for TC(N+M) is to use binary search at every row as it is sorted array at each row ,to  find the first occurrence of 1
        // and no of 1= m-first occurrence of 1 at each row
        System.out.println(rowWithMax1s(arr,n,m));
    }

    static int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int maxCount=0;
        int ans=-1;
        for(int i=0;i<n;i++){
            int c=0;
            int firstIndex=binary(arr[i],0,m-1);
            if(firstIndex!=-1){
                c=m-firstIndex;
            }
            if(c>maxCount){
                maxCount=c;
                ans=i;
            }
        }
        return ans;
    }

    public static int binary(int[] arr, int s, int e){
        int ans=-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]==1){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
}
