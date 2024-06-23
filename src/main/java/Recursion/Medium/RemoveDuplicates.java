package Recursion.Medium;

public class RemoveDuplicates {
    public static boolean[] arr=new boolean[26];

    public static void main(String[] args) {
        String str="aabcddefd";
        removeDup(str,0,"");
    }


    //Logic
    //we have created an array of length 26 which has false value in all index initially.
    //To get index of alphabet just do- char - 'a'  For ex- 'b' -'a'=1 , 'c'-'a'=2......... 'z'-'a'=26
    //We can keep track of each element and see if this element has value true in array than it has already come , if not, than its first time coming
    private static void removeDup(String str, int index, String newString) {
        if(index==str.length()){
            System.out.println(newString);
            return;
        }
        char curr=str.charAt(index);
        if(arr[curr-'a']){
            removeDup(str,index+1,newString);
        }
        else{
            newString+=curr;
            arr[curr-'a']=true;
            removeDup(str,index+1,newString);
        }


    }
}
