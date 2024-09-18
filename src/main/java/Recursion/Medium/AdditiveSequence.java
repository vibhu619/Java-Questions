package Recursion.Medium;

public class AdditiveSequence {
    public static void main(String[] args) {
        String n="14748";

        if(n.length()<3){
            System.out.println(false);
        }
        String[] temp=new String[n.length()];
        temp[0]= String.valueOf(n.charAt(0));
        temp[1]= String.valueOf(n.charAt(1));
        System.out.println(fun(n,1,1,temp));
    }
    //1. create a array temp and store 0th and 1st index i.e 1,2
    //2. iterate string from i=1
    //3.cal temp[j]+temp[j-1]=ans, find ans length, if ans is substring from n.substring(i+1,i+3)
    //5. agar mila, then call recursively for next part with i =i+ans.length()
    //6. base when i>=n.length()
    public static boolean fun(String str, int i, int j,String[] temp){
        if(i>=str.length()-1){
            return true;
        }

        //body
        String nstr= String.valueOf(Integer.parseInt(temp[j])+Integer.parseInt(temp[j-1]));
        int l=nstr.length();
        if(search(str,nstr, i,l) ){

            temp[++j]=nstr;
            i=i+l;
        }
        else
            return false;
        return fun(str,i,j,temp);
    }

    private static boolean search(String str, String nstr,int i,int l) {
        if(i+l>str.length()-1){
            return false;
        }
        String substring=str.substring(i+1,i+l+1);
        if(substring.equals(nstr)){
            return true;
        }
        return  false;

    }

}
