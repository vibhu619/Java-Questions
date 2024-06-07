package Arrays.PracticeArray;

import java.util.ArrayList;

public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1,0};
        int n = arr.length;
        ArrayList<Integer> res=subarraySum(arr,n,0);

        for(int x:res){
            System.out.println(x+" ");
        }
    }
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here
        ArrayList<Integer> a=new ArrayList<>();
        int cs=0;
        int start=0;
        for(int i=0;i<n;i++){
            if(s==0 ){
                if( arr[i]==0){
                    a.add(start+1);
                    a.add(i);
                    break;
                }

                else
                    continue;
            }
            else{

                while(cs>s){
                    cs=cs-arr[start];
                    start++;
                }
                if(cs==s){
                    a.add(start+1);
                    a.add(i);
                    break;
                }
                cs=cs+arr[i];
            }
        }

        return a;
    }
}
