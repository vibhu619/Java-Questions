package Arrays.medium;

import java.util.HashSet;

//Given an array A of size N which contains elements from 0 to N-1, you need to find all the
// elements occurring more than once in the given array. Return the answer in ascending order.
// If no such element is found, return list containing [-1].
public class RemoveDuplicatesWithCyclicSort {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 2, 1, 1, 4, 4, 5};
        int n = arr.length;
        HashSet<Integer> duplicates = new HashSet<>();
        cyclicSort(arr, duplicates);


        for (int x : duplicates
        ) {
            System.out.println(x + ",");

        }
    }

    private static void cyclicSort(int[] arr, HashSet<Integer> duplicates) {
        for (int i = 0; i < arr.length; i++) {
            int y = arr[i] - 1;
            if (arr[i] != arr[y]) {
                int temp = arr[i];
                arr[i] = arr[y];
                arr[y] = temp;
            } else {
                duplicates.add(arr[i]);
            }
        }
    }
}
