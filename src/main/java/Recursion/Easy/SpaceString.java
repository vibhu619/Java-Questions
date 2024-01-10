package Recursion.Easy;
//Given a string str your task is to complete the function spaceString
//which takes only one argument the string str and  finds
//all possible strings that can be made by placing spaces (zero or one) in between them.
public class SpaceString {
    public static void main(String[] args) {
        String str="abc";
        space(str,1,"a");
    }

    private static void space(String str,int index, String newString) {
        if(index==str.length()){
            System.out.println(newString);
            return;
        }
        {
            char curr=str.charAt(index);
            space(str,index+1,newString+curr);
            space(str,index+1,newString+" "+curr);
        }
    }
}
