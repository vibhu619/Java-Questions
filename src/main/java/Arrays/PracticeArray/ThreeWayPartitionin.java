package Arrays.PracticeArray;

public class ThreeWayPartitionin {
    public static void main(String[] args) {
        int[] arr={1, 4,2, 3, 6, 0,2, 1};
        int n=arr.length;
        int i=0;
        int l=0;
        int r=n-1;
        int a=1;
        int b=3;
        while(i<=r){     //////////  TRICK- 2/3 POINTER APPROACH ////////////
            if(arr[i]<a){
                int temp=arr[l];
                arr[l]=arr[i];
                arr[i]=temp;
                i++;
                l++;
            }
            else if (arr[i]>b){
                int temp=arr[r];
                arr[r]=arr[i];
                arr[i]=temp;
                r--;
            }
            else {
                i++;
            }
        }
        for (int x: arr){
            System.out.println(x);
        }
    }
}
