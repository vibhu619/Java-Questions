package String.Practice;
//Given a binary string, that is it contains only 0s and 1s. We need to make this string a sequence of alternate characters by flipping some of the bits, our goal is to minimize the number of bits to be flipped.
//
//        Example 1:
//
//        Input:
//        S = "001"
//        Output: 1
//        Explanation:
//        We can flip the 0th bit to 1 to have
//        101.
public class MinNumberOfFlips {
    public static void main(String[] args) {
        //LOGIC - there could be two cases only , 1) 010101010 2) 101010101 ,one having 0 at even index and 1 at odd index and other vice versa
        //We will calculate one and find other by flip2= n-flip1 --> ans= min(flip1,flip2)
        String S="0001010111";
        int n=S.length();
        int flip=0;
        for(int i=0;i<n;i++){
            if(i%2==0 && S.charAt(i)!='1'){
                flip++;
            }
            else if(i%2!=0 && S.charAt(i)!='0'){
                flip++;
            }
            else{
                continue;
            }
        }

        System.out.println(Math.min(flip,n-flip));

    }
}
