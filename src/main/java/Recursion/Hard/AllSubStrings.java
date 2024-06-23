package Recursion.Hard;

public class AllSubStrings {
    public static void main(String[] args) {
        String str="abcd";
        //substrings(str,0,1);
        StringBuffer ns=new StringBuffer("");
        sub(str,ns);
    }

    private static void substrings(String str,int start, int end) {
//        if(start==str.length() && end==str.length()){
//            return;
//        }
//        if(end==str.length()+1){
//            substrings(str,start+1,start+1);
//        }
//        else{
//            System.out.println(str.substring(start,end));
//            substrings(str,start,end+1);
//        }
    }

    private static void sub(String str,StringBuffer ns){
        for(int i=0;i<str.length();i++){
            repeat(str,ns,i);
            
        }
        return;
    }

    private static void repeat(String str, StringBuffer ns,int index) {
        if(index>str.length()-1){
            return;
        }
        repeat(str,ns.append(str.charAt(index)),index+1);
        System.out.println(ns);
        ns.deleteCharAt(ns.length()-1);
    }
}

