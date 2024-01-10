package String.Easy;
//S is string containing only lowercase English alphabets. We need to find if there exists at least one palindromic sub-string whose length is even.
//
//        Examples:
//
//        Input  : aassss
//        Output : YES
//        Input  : gfg
//        Output : NO
public class EvenLengthPalindromeString {
    public static void main(String[] args) {
        String str="aassss";

        if(evenPalindromeString(str)) {
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }


    private static boolean evenPalindromeString(String str) {
        for(int i=0;i<str.length();i++){
            for(int len=2;i+len<=str.length();len+=2){
                return isPalindrome(str.substring(i,i+len));
            }
        }
        return false;
    }

    private static boolean isPalindrome(String str) {
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
