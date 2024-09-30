package Arrays.medium;

import java.util.ArrayList;
//Given an array A of size N which contains elements from 0 to N-1, you need to find all the
// elements occurring more than once in the given array. Return the answer in ascending order.
// If no such element is found, return list containing [-1].
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr={2 ,0 ,3 ,3 ,2,1};
        int n=arr.length;
        ArrayList<Integer> duplicates=new ArrayList<>();

        //iterate all the elements in array and go to the index which is the value of that element
        //then add n at that index
        for(int i=0;i<n;i++){
            int correctIndex=arr[i]%n;  //Iterate through the array and for each element A[i], increment the value at index A[i] % N by N. This way, the remainder ensures we access the correct index even after modifying the value.
            arr[correctIndex]+=n;
        }

        //if u have added n at any particular index twice or more that means that index was there twice or more than twice in that array
        for(int i=0;i<n;i++){
            if(arr[i]/n>=2){
                duplicates.add(i);
            }
        }
        if(duplicates.isEmpty()){
            duplicates.add(-1);
        }
        for (int x:duplicates
             ) {
            System.out.println(x+ ",");

        }
    }
}
