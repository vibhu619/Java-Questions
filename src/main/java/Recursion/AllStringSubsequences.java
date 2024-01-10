package Recursion;

public class AllStringSubsequences {
    public static void main(String[] args) {
        String str="abc";
        subsequence(str,0,"");
    }

    private static void subsequence(String str, int index, String newString) {
        if(str.length()==index){
            System.out.println(newString);
            return;
        }
         char curr=str.charAt(index);
        //If char taken
        subsequence(str,index+1,newString+curr);

        //if not taken
        subsequence(str,index+1,newString);
    }
}
