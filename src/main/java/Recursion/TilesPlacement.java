package Recursion;
//you have a n*m floor , u need to tell in how many ways u can fill floor with 1*m size of tile.
public class TilesPlacement {
    public static void main(String[] args) {
        int n=5;
        int m=3;
        System.out.println(ways(n,m));
    }
    //You can place tile either horizontally or vertically. If placed horizontally then length of floor left is n-1 and
    //if placed vertically than floor length left n-m. No need to care about width as width of tile and floor is same
    private static int ways(int n, int m) {
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }

        int verticalPlacement= ways(n-m,m);

        int horizontalPlacement=ways(n-1,m);

        return verticalPlacement+horizontalPlacement;
    }
}
