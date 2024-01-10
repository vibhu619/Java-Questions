package Recursion;

public class keypadCombination {
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public static void main(String[] args) {
        String str="23";
        combo(str,0,"");
    }

    private static void combo(String str, int index, String combination) {
        if(str.length()==index){
            System.out.println(combination);
            return;
        }

        char curr=str.charAt(index);
        String key=keypad[curr - '0'];
        for(int i=0;i<key.length();i++){
            combo(str,index+1,combination+key.charAt(i));
        }
    }
}
