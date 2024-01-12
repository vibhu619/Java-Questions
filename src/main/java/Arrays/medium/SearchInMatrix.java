package Arrays.medium;

public class SearchInMatrix {
    public static void main(String[] args) {
        int n=3;
        int m=3;
        int[][] mat = {{3 ,30, 38},{44, 52, 54},{57, 60, 69}};

        int x=57;
        int[] ans=new int[2];
        int i=0;
        int j=m-1;
        while(i<n && j>=0){
            if(mat[i][j]==x){
                ans[0]=i;
                ans[1]=j;
                break;
            } else if (mat[i][j]>x) {
                j--;

            }
            else{
                i++;
            }
        }
        System.out.println(ans[0] +","+ ans[1]);
    }
}
