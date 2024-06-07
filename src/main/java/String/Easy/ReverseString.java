package String.Easy;

public class ReverseString {
    public static void main(String[] args) {
        String str="ABCDE";

        System.out.println(reverseWord(str));
    }

    public static String reverseWord(String str)
    {
        // Reverse the string str
        if(str.length()==1){
            return str;
        }

        return str.charAt(str.length()-1)+reverseWord(str.substring(0,str.length()-1));
    }
}
