package String.Practice;
//You are given two strings of equal lengths, s1 and s2. The task is to check if s2 is a rotated version of the string s1.
//
//        Note: The characters in the strings are in lowercase.
//
//        Example 1:
//
//        Input:
//        geeksforgeeks
//        forgeeksgeeks
//        Output:
//        1
public class RotatedString {
    public static void main(String[] args) {
        String str1="geeksforgeek";
        String str2="forgeekgeeks";
        String concat=str1+str1;  /////TRICK -  ADD STRING WITH ITSELF ///////
        if(isRotate(concat,str2)){
            System.out.println("yes");
        }
        else
            System.out.println("No");
    }

    private static boolean isRotate(String concat, String str2) {
        int n=str2.length();
        for(int i=0;i<concat.length()-n;i++){
            if(concat.substring(i, i + n).equals(str2)){
                return true;

            }
        }
        return false;
    }
}
