package String.Practice;

public class LongestSubstringWithUniqueCharacter {
    public static void main(String[] args) {
        String str="aewergrththy";
        int n=str.length();

        longSubstring(str,n);
    }

    private static void longSubstring(String str, int n) {
        int max=-1;
        boolean[] arr=new boolean[256];
        int left=0;
        for(int i=0;i<n;i++){
            if(!arr[str.charAt(i)]){
                arr[str.charAt(i)]=true;
            }
            else {
                max=Math.max(max,i-left);
                while(str.charAt(left)!=str.charAt(i)){
                    arr[str.charAt(left)] = false;
                    left++;
                }
                left++;
            }
        }
        max = Math.max(max, n - left);
        System.out.println(max);


    }
}
