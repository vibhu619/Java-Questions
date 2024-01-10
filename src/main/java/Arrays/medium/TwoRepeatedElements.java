package Arrays.medium;
//You are given an array of N+2 integer elements.
// All elements of the array are in the range 1 to N. Also, all elements occur once except two numbers which occur twice. Find the two repeating numbers.
/*Example 1:

Input:
N = 4
array[] = {1,2,1,3,4,3}
Output: 1 3
Explanation: In the given array,
1 and 3 are repeated two times.
Example 2:

Input:
N = 2
array[] = {1,2,2,1}
Output: 2 1
Explanation: In the given array,
1 and 2 are repeated two times
and second occurence of 2 comes
before 1. So the output is 2 1.*/

//Using same logic as remove duplicates
public class TwoRepeatedElements {
    public static void main(String[] args) {
        int[] arr={4 ,6 ,2 ,5 ,2 ,4 ,3 ,7 ,1};
        int n=arr.length;
        int[] ans=new int[2];
        int  idx=-1;
        for(int i=0;i<n;i++){
            int index=arr[i]%n;
            arr[index]+=n;
            if(arr[index]/n>=2){
                idx=arr[i]%n;
            }
        }

        int first=-1;
        int second=-1;
        for(int i=0;i<n;i++){
            if(arr[i]/n>=2){
                if(i==idx){
                    second=i;
                }
                else{
                    first=i;
                }
            }
        }
        ans[0]=first;
        ans[1]=second;

        System.out.println(ans[0] + "  "  + ans[1]);
    }
}
