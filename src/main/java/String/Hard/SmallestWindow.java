//package String.Hard;
//
//public class SmallestWindow {
//    //    S = "timetopractice"
////    P = "toc"
////    k
//
//    public static void main(String[] args) {
//        String S = "dezoomlazapzo";
//        String P = "oza";
//        String result = getSmallestSubstring(S, P);
//        System.out.println(result);
//    }
//
//    private static String getSmallestSubstring(String input, String match) {
//        //for
//        // while
//        String smallest = "";
//
//        //----
//        int[] matchArray = new int[256];
//        for (int i = 0; i < match.length(); i++) {
//            matchArray[match.charAt(i)]++;
//        }
//
//        //---
//        int[] inputArray = new int[256];
//
//        //right - left + 1
//        /*
//        S = "dezoomlazapzo"
//        P = "oza"
//         */
//        int leftIndex = 0;
//        int length = Integer.MAX_VALUE;
//        for (int rightIndex = 0; rightIndex < input.length(); rightIndex++) {
//            inputArray[input.charAt(rightIndex)]++;
//            if (matched(matchArray, inputArray,match)) {
//                length = minLength(leftIndex, length, rightIndex);
//            }
//            if(matched(matchArray, inputArray,match) && matchArray[input.charAt(leftIndex)]==0)
//                while (matched(matchArray, inputArray)) {
//                    length = minLength(leftIndex, length, rightIndex);
//                    inputArray[input.charAt(leftIndex)]--;
//                    leftIndex++;
//                }
//        }
//        return input.substring(leftIndex, leftIndex + length-1 );
//    }
//
//    private static boolean matched(int[] matchArray, int[] inputArray) {
//        int count=0;
//        for (int i = 0; i < matchArray.length; i++) {
//            if(inputArray[i] <= matchArray[i]){
//                count++;
//            }
//        }
//        return true;
//    }
//
//    private static int minLength(int leftIndex, int length, int rightIndex) {
//        if (rightIndex - leftIndex + 1 < length){
//            length = rightIndex - leftIndex + 1;
//        }
//        return length;
//    }
//
//
//}