package Recursion.Hard;
//https://www.geeksforgeeks.org/problems/replace-os-with-xs0052/1?page=1&category=Recursion&difficulty=Medium,Hard&status=unsolved&sortBy=submissions
//Given a matrix mat of size N x M where every element is either 'O' or 'X'. Replace all 'O' or a group of 'O' with 'X' that are surrounded by 'X'.
//
//        A 'O' (or a set of 'O') is considered to be surrounded by 'X' if there are 'X' at locations just below, just above, just left and just right of it.
public class ReplaceOWithX {
    public static void main(String[] args) {
        char[][] arr={{'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'O', 'X', 'X'},
                {'X', 'X', 'O', 'O'}};

        int n=5 ;
        int m=4;
        char[][] ans=fill(arr,n,m);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }

    static char[][] fill(char a[][],int n, int m) {
        // code here
        //1.create a new matrix replacing '0' with '-'
        //2. traverse the new  matrix for first row, last row, first column and laST COLUMN. if e get '-' then replace it ith '0' and recursively check for
        //row+1, row-1, col+1, col-1.
        //LOGIC- As '0's on the boundary will never change to X .
        // Hence, we identify '-'s at the boundary which will become back to 0 and also will make adjacent continuous '-'s in the direction up,down,left ,right as '0'.
        // After this, if still some '-' is left e ill make them X.

        char[][] temp=new char[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]=='O'){
                    temp[i][j]='-';
                }
                else{
                    temp[i][j]='X';
                }
            }
        }


        for(int i=0;i<n;i++){
            if(temp[i][0]=='-'){
                callRec(temp,i,0,'-','O',n,m);
            }
        }
        for(int i=0;i<n;i++){
            if(temp[i][m-1]=='-'){
                callRec(temp,i,m-1,'-','O',n,m);
            }
        }
        for(int i=0;i<m;i++){
            if(temp[0][i]=='-'){
                callRec(temp,0,i,'-','O',n,m);
            }
        }
        for(int i=0;i<m;i++){
            if(temp[n-1][i]=='-'){
                callRec(temp,n-1,i,'-','O',n,m);
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(temp[i][j]=='-'){
                    temp[i][j]='X';
                }
            }
        }

        return temp;
    }

    private static void callRec(char[][] temp, int x, int y, char prevChar, char newChar,int n, int m) {

        if(x<0 || x>=n || y<0 ||y>=m){
            return;
        }
        if(temp[x][y]!=prevChar){
            return;
        }

        temp[x][y]=newChar;
        callRec(temp,x+1,y,prevChar,newChar,n,m);
        callRec(temp,x-1,y,prevChar,newChar,n,m);
        callRec(temp,x,y+1,prevChar,newChar,n,m);
        callRec(temp,x,y-1,prevChar,newChar,n,m);
    }


}
