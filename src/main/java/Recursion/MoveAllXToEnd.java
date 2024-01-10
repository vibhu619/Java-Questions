package Recursion;

public class MoveAllXToEnd {
    public static void main(String[] args) {
        String str="axbcxxxdxe";
        moveXToEnd(str,0,0,"");
    }

    private static void moveXToEnd(String str, int index,int count , String newString) {

        //Base case-- if reached to lenght than add x at last
        if(index==str.length()){
            for(int i=0;i<count;i++){
                newString+='x';
            }
            System.out.println(newString );
            return;
        }

        //Body
        char curr=str.charAt(index);
        if(curr=='x'){
            count++;
            moveXToEnd(str,index+1,count,newString);
        }
        else{
            newString+=curr;
            moveXToEnd(str,index+1,count,newString);
        }


    }
}
