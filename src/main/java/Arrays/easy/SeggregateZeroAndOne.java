package Arrays.easy;
//Seggreagate 0s and 1s
//Note - 2 pointer approach will only work in seggregation questions if order has not to be maintained
public class SeggregateZeroAndOne {
    public static void main(String[] args) {

    int[] arr = {1,1,0,1,0,0,1,0,0,1};
    int n = arr.length;

    int p = n - 1;
    int ne = 0;
        while (ne < p) {
        if(arr[ne] == 1 ){
            if(arr[p] != 1){
                //swap
                int temp=arr[ne];
                arr[ne]=arr[p];
                arr[p]=temp;
            }
            else{
                p--;
            }
        }
        else{
            ne++;
        }
    }

        for (int x: arr
             ) {
        System.out.println(x + " ");

        }
    }
}
