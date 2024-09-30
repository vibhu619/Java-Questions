package Arrays.easy;
//Given an array nums of size n, return the majority element.
//
//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

//Example 2:
//
//        Input: nums = [2,2,1,1,1,2,2]
//        Output: 2
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int count = 0;
        int candidate = -1;

        // Phase 1: Find a potential candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count += 1;
            }
            else {
                count -= 1;
            }
        }
        System.out.println( candidate);
    }
//TC- O(N) AND SC- O(1)
//    Boyer-Moore Voting Algorithm Explanation:
//    The idea is to keep a running count of a potential majority element.
//    We initialize a candidate and a count.
//    As we iterate through the array, if the current element is the same as the candidate, we increment the count; otherwise, we decrement the count.
//    If the count drops to 0, we change the candidate to the current element and reset the count.
//    By the end of the array, the candidate will be the majority element because it appears more than half the time.
}
