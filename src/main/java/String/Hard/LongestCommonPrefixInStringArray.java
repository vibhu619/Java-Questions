package String.Hard;

import java.util.Arrays;
/*Given an array of N strings, find the longest common prefix among all strings present in the array.


        Example 1:

        Input:
        N = 4
        arr[] = {geeksforgeeks, geeks, geek,
        geezer}
        Output: gee*/
public class LongestCommonPrefixInStringArray {
    public static void main(String[] args) {

        String[] arr = {"geeksforgeeks", "geeks", "geek", "geezer"};
        int n = arr.length;
        System.out.println(commonPrefixBruteForce(arr, n));
        System.out.println(commonPrefixOptimalSolution(arr, n));
    }

    private static String commonPrefixOptimalSolution(String[] arr, int n) {
//        If the number of strings is 1 (n == 1), return that single string arr[0] as it is the only string available, and it is the longest common prefix by default.
//        Initialize an empty string res to store the longest common prefix found so far.
//        Create a boolean variable include to determine if a character is eligible to be included in the common prefix.
//        Iterate through each character position in the first string arr[0] using the variable i.
//        For each character at position i in the first string:
//        Set include to true for each new character arr[0][i].
//        Check if the character arr[0][i] matches the corresponding character in other strings.
//        If the character doesn't match in any of the other strings or if i exceeds the length of any string, set include to false and break the loop.
//        If the character matches in all strings, add it to the res string.
//        If no common prefix is found (res is empty), return "-1".
//        Otherwise, return the res string, which contains the longest common prefix.


        String res="";
        boolean include=true;
        for(int i=0;i<arr[0].length();i++){  //we take arr[0] and traverse its each character through i
            include=true;
            for(int j=1;j<n;j++){   //we will traverse each string of array through j
                if(i>arr[j].length()-1 || arr[0].charAt(i)!=arr[j].charAt(i)){  //we will check if character of arr[0] is there in other strings at same index or not
                    include=false;  //if not than character will not be included and break
                    break;
                }
            }
            if(!include){  //if character is not included than nom point traversing further characters of arr[0]
                break;
            }
            res=res+arr[0].charAt(i);  //else add that character to result
        }
        if(res.isEmpty()){
            return "-1";

        }
        return res;
    }

    private static String commonPrefixBruteForce(String[] arr, int n) {
        //here we will sort string array.After sorting we know that first element and last element of array will be most different, and between elements will have that common prefix
//        If the array size N is 0, return an empty string.
//        If the array size N is 1, return the only string in the array as it is the longest common prefix.
//        Sort the array of strings to bring the lexicographically smallest and largest strings to the first and last positions, respectively.
//        Find the minimum length (en) between the first and last strings.
//        Iterate through the characters of the first and last strings until a mismatch is encountered, and store the common prefix in a string.
//        Return the common prefix.

        if(n==0){
            return "-1";
        }
        if(n==1){
            return arr[0];
        }
        Arrays.sort(arr);
        int minLen=Math.min(arr[0].length(),arr[n-1].length());
        int i=0;
        while (i<minLen && arr[0].charAt(i)==arr[n-1].charAt(i)){
            i++;
        }
        String res=arr[0].substring(0,i);
        if(res.isEmpty()){
            return "-1";
        }
        return res;
    }
}

