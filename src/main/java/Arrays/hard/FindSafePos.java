package Arrays.hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
//There are n people standing in a circle (numbered clockwise 1 to n) waiting to be executed. The counting begins at point 1 in the circle and proceeds around the circle in a fixed direction (clockwise). In each step, a certain number of people are skipped and the next person is executed. The elimination proceeds around the circle (which is becoming smaller and smaller as the executed people are removed), until only the last person remains, who is given freedom.
//        Given the total number of persons n and a number k which indicates that k-1 persons are skipped and kth person is killed in circle. The task is to choose the place in the initial circle so that you are the last one remaining and so survive.
//
//        Example 1:
//
//        Input:
//        n = 2, k = 1
//        Output:
//        2
//        Explanation:
//        Here, n = 2 and k = 1, then safe position is
//        2 as the person at 1st position will be killed.
//        Example 2:
//
//        Input:
//        n = 4, k = 2
//        Output:
//        1
//        Explanation:
//        The safe position is 1
public class FindSafePos {
    public static void main(String[] args) {
        int n=6;
        int k=3;

        System.out.println(safePos(n,k));
    }
    //1. create map with index and bool
    //2.iterate i till n - size of map>1-- if 1 means only one man left, answer found
    //3.find index which getting killed, keep in mind to skip already dead indexes(indexes which are already present in map) + circular trap
    //4.find the next index, which is not dead
   //5. coming out from while loop, take set of keys and find the missing number from 1 to n
    private static int safePos(int n, int k) {
        int ans=-1;
        int sum1=0;
        int sum2=0;
        Map<Integer,Boolean> m=new HashMap<>();
        int i=1;
        while(n-m.size()>1){

            int deadIndex=findDeadIndex(i,n,k,m);
            m.put(deadIndex,true);
            //System.out.println("dead :" +deadIndex);
            i=findNextIndex(deadIndex,n,m);
            //
        }
        ArrayList<Integer> arr=new ArrayList<>(m.keySet());
        Collections.sort(arr);

        for(int j=1;j<=n;j++){
            sum1=sum1+j;
        }
        for(int j=0;j<arr.size();j++){
            sum2=sum2+arr.get(j);
        }
        ans=sum1-sum2;
        return ans;
    }

    private static int findNextIndex(int deadIndex, int n, Map<Integer, Boolean> m) {
        int i=deadIndex;
        if(!isCyclicJumpMade(i,n,1)) {
            i = deadIndex + 1;
        }
        else
            i=1;
        i = isIndexDeadOrNot(i, n, m);
        return i;

    }

    private static int findDeadIndex(int i, int n, int k, Map<Integer, Boolean> m) {
        while(k-1>0){
            if(!isCyclicJumpMade(i,n,1)) {
                i = i + 1;
            }
            else
                i=1;
            i=isIndexDeadOrNot(i,n,m);
            k--;
        }
        return i;
    }

    private static int isIndexDeadOrNot(int i, int n, Map<Integer, Boolean> m) {
        while(m.containsKey(i)){
            if(!isCyclicJumpMade(i, n,1)) {
                i = i + 1;
            }
            else{
                i =1;
            }
        }
        return i;
    }

    private static boolean isCyclicJumpMade(int i, int n, int k) {
        return i + k > n;
    }
}
