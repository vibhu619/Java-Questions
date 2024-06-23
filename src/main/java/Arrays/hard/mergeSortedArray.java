package Arrays.hard;

public class mergeSortedArray {
    public static void main(String[] args) {
        int[] arr1={1,4,6,8};
        int[] arr2={2,3,11};

        merge(arr1,arr2);

        print(arr1);
        System.out.println("---------");
        print(arr2);
    }

    private static void print(int[] arr1) {
        for(int x: arr1){
            System.out.print(x+" ");
        }
    }

    private static void merge(int[] arr1, int[] arr2) {
        int len=arr1.length+arr2.length;

        int gap=(len/2)+(len%2);

        while(gap>0){
            int left=0;
            int right=left+gap;

            while(right<len){
                //1) left in arr1 && right in arr2
                if(left<arr1.length && right>=arr1.length){
                    swapIfGreater(arr1,arr2,left,right-arr1.length);
                }
                //2) left and right both in arr1
                else if (left<arr1.length && right<arr1.length) {
                    swapIfGreater(arr1,arr1,left,right);
                }
                //3)left and right both in arr2
                else{
                    swapIfGreater(arr2,arr2,left-arr1.length,right-arr1.length);
                }

                left++;
                right++;
            }
            if(gap==1){
                break;
            }

            gap=(gap/2)+(gap%2);
        }
    }

    private static void swapIfGreater(int[] arr1, int[] arr2, int left, int right) {
        if(arr1[left]>arr2[right]){
            //swap
            int temp=arr1[left];
            arr1[left]=arr2[right];
            arr2[right]=temp;
        }
    }
}
