package Recursion.Medium;

public class ReverseString {
    public static void main(String[] args) {
        String str="ABCDE";
        String str1=reverseString(str);
        System.out.println(str1);

    }

    private static String reverseString(String str) {
        //Base case--- if only one character is left you cant reverse it
        if(str.length()==1){
            return str;
        }
        //Body
        //Return last element + substring
        return str.charAt(str.length()-1) + reverseString(str.substring(0,str.length()-1));

    }
}
