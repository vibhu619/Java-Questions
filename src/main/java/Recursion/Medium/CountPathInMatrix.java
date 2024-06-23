package Recursion.Medium;
//count total paths in n*m matrix to reach from 0,0 to n,m such that u can move only right or down
public class CountPathInMatrix {
    public static void main(String[] args) {
        int n=3;
        int m=3;
        System.out.println(countPath(0,0,n,m));
    }

    private static int countPath(int i, int j, int n, int m) {
        //Base case
        //1. if u cross boundary of matrix means no path there
        if(i==n || j==m){
            return 0;
        }
        //2. if u have reached m,n in matrix u got one path
        if(i==n-1 && j==m-1){
            return 1;
        }

        //if move down
        int downPathCount=countPath(i+1,j,n,m);

        //if move right
        int rightPathCount=countPath(i,j+1,n,m);

        //total paths from that point
        return downPathCount+rightPathCount;
    }
}
