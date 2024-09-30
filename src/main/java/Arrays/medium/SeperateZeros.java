package Arrays.medium;
//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//        Note that you must do this in-place without making a copy of the array.
//
//
//
//        Example 1:
//
//        Input: nums = [0,1,0,3,12]
//        Output: [1,3,12,0,0]
public class SeperateZeros {
    public static void main(String[] args) {


        int[] nums = {0, 1, 0, 3, 12};
        divide(nums, nums.length, 0, nums.length - 1);
        for(int x: nums){
            System.out.println(x+" ");
        }
    }

    private static void divide(int[] arr, int n, int s, int e) {
        if (s >= e) {
            return;
        }

        int mid = (s + e) / 2;
        divide(arr, n, s, mid);
        divide(arr, n, mid + 1, e);

        merge(arr, s, mid, e);
    }

    private static void merge(int[] arr, int s, int mid, int e) {   ///USE MERGE SORT///
        int n1 = mid - s + 1;
        int n2 = e - mid;

        int[] l = new int[n1];
        int[] r = new int[n2];

        for (int i = 0; i < n1; i++) {
            l[i] = arr[s + i];
        }

        for (int j = 0; j < n2; j++) {
            r[j] = arr[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = s;

        while (i < n1 && j < n2) {
            if (l[i] != 0 && r[j] != 0) {
                arr[k++] = l[i++];
            } else if (l[i] != 0) {
                arr[k++] = l[i++];
            } else if (r[j] != 0) {
                arr[k++] = r[j++];
            } else {
                j++;  // skip the zero in right array
            }
        }

        // Copy remaining non-zero elements in left array if any
        while (i < n1) {
            if (l[i] != 0) {
                arr[k++] = l[i];
            }
            i++;
        }

        // Copy remaining non-zero elements in right array if any
        while (j < n2) {
            if (r[j] != 0) {
                arr[k++] = r[j];
            }
            j++;
        }

        // Fill remaining positions with zero
        while (k <= e) {
            arr[k++] = 0;
        }
    }
}
