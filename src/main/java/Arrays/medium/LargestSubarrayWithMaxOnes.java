package Arrays.medium;
//Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
//
//        Example 1:
//
//        Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
//        Output: 6
//        Explanation: [1,1,1,0,0,1,1,1,1,1,1]
//        Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
public class LargestSubarrayWithMaxOnes {
    public static void main(String[] args) {
        int[] nums={0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k=3;
        int count0 = k;
        int mx = 0;
        int ans = 0;
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count0--; // Decrease count of allowed zeroes
            }

            ans++; // Always increase the window size

            // If we have used more than the allowed zeros, shrink the window
            while (count0 < 0) {
                if (nums[j] == 0) {
                    count0++; // We remove one zero from the window
                }
                ans--; // Decrease the size of the window as we shrink
                j++; // Slide the window from the left
            }

            mx = Math.max(mx, ans); // Update the max length of the window
        }

        System.out.println( mx);
    }
}
