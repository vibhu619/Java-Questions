package Recursion;
//no of ways to call n guest aas single or in pair
public class GuestInvitation {
    public static void main(String[] args) {
        int n=4;
        System.out.println(call(n));
    }

    private static int call(int n){
        if (n <= 1) {
            return 1;
        }

        int singleGuest=call(n-1);

        int pairGuest= (n-1)* call(n-2);

        return singleGuest+pairGuest;
    }
}
