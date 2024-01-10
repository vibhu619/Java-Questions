package Arrays.hard;

public class RepeatedAndMissing {
    public static void main(String[] args) {
        int[] arr={7, 3, 4, 5, 5, 6, 2 };
        int n=arr.length;
        int m=n+1;
        int r=0;
        int mi=0;
        for(int i=0;i<n;i++){
            int index=(arr[i]%m)-1;
            if(arr[index]<m){
                arr[index]=arr[index]+m;
            }
            else{
                r=arr[i]%m;
                break;
        }}


        for(int i=0;i<n;i++){
            if(arr[i] < n+1){
                mi=i+1;
                break;
            }
        }

        System.out.println(r + " " + mi);


    }
}
