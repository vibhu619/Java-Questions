package Recursion.Hard;

public class AllSubStrings {
    public static void main(String[] args) {
        String str="abcd";
        substrings(str,0,1);
    }

    private static void substrings(String str,int start, int end) {
        if(start==str.length() && end==str.length()){
            return;
        }
        else{
            if(end==str.length()+1){
                substrings(str,start+1,start+1);

            }
            else{
                System.out.println(str.substring(start,end));
                substrings(str,start,end+1);
            }
        }
    }
}
