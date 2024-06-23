package String.Hard;

public class ReverseString2 {
//    Input : My name is arsha
//    Output : ah sras ie manym

    public static void main(String[] args) {
        String str="My name is arsha";
        int n=str.length();
        for(int left=0; left<n; left++){
            int right=n-left-1;

            //print space
            if(str.charAt(left)==' '){
                System.out.print(" ");
            }
            if(str.charAt(right)!=' '){
                System.out.print(str.charAt(right));
            }
        }
    }
}
