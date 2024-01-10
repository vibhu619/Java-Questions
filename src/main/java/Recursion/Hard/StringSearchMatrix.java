package Recursion.Hard;
//Given a string s and matrix of characters mat having n number of rows and m number of columns. Find if string exist in the grid.
//
//        The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.
//
//        Example 1:
//
//        Input:
//        n = 4 , m = 4
//        mat = [ ['a','b','c','d'],['e','f','g','h'],['i','j','k','l'],['m','n','o','p'] ]
//        str = "bcgkjn"
//        Output: 1
//        Explanation:
//        Follow the path ( 0,1 ), ( 0,2 ), ( 1,2 ), ( 2,2 ), ( 2,1 ), ( 3,1 ).
public class StringSearchMatrix {
    public static void main(String[] args) {
        String str="bcgkjp";
        char[][] board={{'a','b','c','d'},{'e','f','g','h'},{'i','j','k','l'},{'m','n','o','p'}};
        int n=4;
        int m=4;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                char ch=board[i][j];
                if(ch==str.charAt(0)){
                    if(helper(i,j,board,str,1,n,m)){
                        System.out.println(1);
                    }
                    else
                        System.out.println(-1);
                }
            }
        }
    }

    private static boolean helper(int r, int c, char[][] board, String str, int index,int n,int m) {
        if(index==str.length()){
            return true;
        }
        char currChar=board[r][c];
        char nextChar =str.charAt(index);

        if(r>0 && board[r-1][c]==nextChar){
            if(helper(r-1,c,board,str,index+1,n,m)){
                return true;
            }
        }
        if(r<n-1 && board[r+1][c]==nextChar){
            if(helper(r+1,c,board,str,index+1,n,m)){
                return true;
            }
        }
        if(c>0 && board[r][c-1]==nextChar){
            if(helper(r,c-1,board,str,index+1,n,m)){
                return true;
            }
        }
        if(c<m-1 && board[r][c+1]==nextChar){
            if(helper(r,c+1,board,str,index+1,n,m)){
                return true;
            }
        }
        board[r][c]=nextChar;
        return false;
    }
}
