package String.Easy;

public class KlengthSubStrings {
    public static void main(String[] args) {
        String str="ababadb";
        int k=2;
        boolean flag=false;
        //logic- keep prefix - {0,k-1} and each time go from {k,2k-1},{2k,3k-1},{3k-4k-1} and match index wise with prefix
        int n=str.length();
        for(int i=k;i<n;i+=k){
            if(!subString(str,n,i,k)){
                flag=false;
                break;
            }
            else{
                flag=true;
            }

        }
        System.out.println(flag);
    }

    private static boolean subString(String str, int n, int i, int k) {
        if(i+k>n){
            return false;
        }
        //traversing prefix {0,k-1} and matching with substring
        for (int j=0;j<k;j++){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
        }
        return true;
    }
}
