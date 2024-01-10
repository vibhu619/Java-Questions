package Recursion;

public class StringPermautation {
    public static void main(String[] args) {
        String str="ljr";
        permutation(str,"");
    }

    private static void permutation(String str, String permutation) {
        //Base case- if there is no character left
        if(str.isEmpty()){
            System.out.println(permutation);
            return;
        }
        //Body
        // iterate over string and fix one element in a permutation and do recursive call by passing new string which does not have that character
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            //making new string without that character-- ex abc ---> curr=a hence passing bc
            String newString=str.substring(0,i)+str.substring(i+1);
            permutation(newString,permutation+curr);
        }
    }
}
