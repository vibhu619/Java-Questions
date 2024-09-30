package SortingAlgorithm;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr={3,5,2,1,6,4,8,7};
        cyclicSort(arr);
        for(int x: arr){
            System.out.println(x+" ");
        }
    }

    private static void cyclicSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(i!=arr[i]-1){
                while(i!=arr[i]-1) {
                    //swap arr[i] and arr[arr[i]-1]
                    int y=arr[i]-1;
                    int temp = arr[i];
                    arr[i] = arr[y];
                    arr[y] = temp;
                }
            }
        }
    }
}
