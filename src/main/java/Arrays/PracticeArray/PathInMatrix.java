package Arrays.PracticeArray;

import java.lang.reflect.Array;
import java.util.ArrayList;
//Given a N x M grid. Find All possible paths from top left to bottom right.From each cell you can either move only to right or down.
//
//        Example 1:
//
//        Input: 1 2 3
//        4 5 6
//        Output: 1 4 5 6
//        1 2 5 6
//        1 2 3 6
//        Explanation: We can see that there are 3
//        paths from the cell (0,0) to (1,2).
public class PathInMatrix {
    public static void main(String[] args) {
        int[][] grid={{1,2,3},{4,5,6}};
        int n=2;
        int m=3;
        ArrayList<Integer> res=new ArrayList<>();
        rec(grid,n,m,0,0,grid[n-1][m-1],res);
    }

    private static void rec(int[][] grid, int n, int m, int i, int j, int target, ArrayList<Integer> res) {
        //base case - if we reach to end , them add element to res and print res and go back to previous state by removing last element
        if(grid[i][j]==target){
            res.add(grid[i][j]);
            for(int x:res){
                System.out.println(x);
            }
            System.out.println();
            res.remove(res.size()-1);
            return;
        }

        //Body
        res.add(grid[i][j]);  //1) Add element\
        //2) Go to right if possible
        if(j+1<m){
            rec(grid,n,m,i,j+1,target, res);
        }
        //3)Go to bottom if possible
        if(i+1<n) {
            rec(grid, n, m, i + 1, j, target, res);
        }
        //4)Remove element to go to previous state
        res.remove(res.size()-1);
        return;
    }
}
