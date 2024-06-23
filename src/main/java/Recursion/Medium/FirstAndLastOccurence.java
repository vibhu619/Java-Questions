package Recursion.Medium;

public class FirstAndLastOccurence {
    static int first=-1;
    static int last=-1;


    public static void main(String[] args) {
        String str="a";
        occ(str,0,'a');
    }

    //We are using index i nstring though it is used mostly in array but here as we need index hence we are using index
    private static void occ(String str, int index, char element) {
        //Base case--- if index went out of index then we got our first and last index
        if(str.length()==index){
            System.out.println(first + " " +last);
            return;
        }
        //Body
        //Find the current element and if it is equal to 'a' ,we check if first value is still -1 hence no 'a' has come yet
        char currentElement=str.charAt(index);
        if(currentElement==element){
            if(first==-1){
                first=index;
            }
            //always update last if you got the element
            last=index;

        }

        //call recursively for next index
        occ(str,index+1,element);
    }
}
