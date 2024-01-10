package String.PatternSearching;
//Given text string with length n and a pattern with length m, the task is to prints all occurrences of pattern in text.
//        Note: You may assume that n > m.
//Input:  text =  “AABAACAADAABAABA”, pattern = “AABA”
//        Output: Pattern found at index 0, Pattern found at index 9, Pattern found at index 12
public class NaiveApproach {
    public static void main(String[] args) {
        String str="AABAACAADAABAAABAA";
        String pattern="AABA";

        matchPattern(str,pattern);
    }

    private static void matchPattern(String str, String pattern) {
        int n=str.length();
        int m=pattern.length();

        for(int i=0,j=m-1;j<n;i++,j++){
            if(pattern.equals(str.substring(i,j+1))){
                System.out.println(i);
            }
        }
    }
}
