package Arrays.easy;
//Rearrange the given array in-place such that all the negative numbers occur before all non-negative numbers.--simple two iteration method
//Naive approach
public class Seggregrate {
    public static void main(String[] args) {
        int[] arr={1 ,-1 ,3 ,2 ,-7 ,-5 ,11 ,6};
        int n=arr.length;
        int[] a=new int[n];
        int j=0;

        for(int i=0;i<n;i++){
            if(arr[i]<0){
                a[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                a[j]=arr[i];
                j++;
            }
        }


        arr=a;
        for (int x: arr
             ) {
            System.out.println(x + " ");

        }
    }
}
