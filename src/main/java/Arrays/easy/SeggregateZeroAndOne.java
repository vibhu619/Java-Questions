package Arrays.easy;
//Seggreagate 0s and 1s
//Note - 2 pointer approach will only work in seggregation questions if order has not to be maintainedx
public class SeggregateZeroAndOne {
    public static void main(String[] args) {

    int[] arr = {1,1,0,1,0,0,1,0,0,1};
    int n = arr.length;

    int e = n - 1;  //to keep track of 1's
    int s = 0; //to keep track of 0's
        while (s < e) {
        if(arr[s] == 1 ){
            if(arr[e] != 1){
                //swap
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
            }
            else{
                e--;
            }
        }
        else{
            s++;
        }
    }

        for (int x: arr
             ) {
        System.out.println(x + " ");

        }
    }
}
