package Recursion.Hard;
//Given an infinite number line. You start at 0 and can go either to the left or to the right. The condition is that in the ith move, youmust take i steps.
// Given a destination D , find the minimum number of steps required to reach that destination.
//
//        Example 1:
//
//        Input: D = 2
//        Output: 3
//        Explaination: The steps takn are +1, -2 and +3.
public class MinimumStepsToDest {
    public static void main(String[] args) {
        int d=11;
        int res = steps(d,0,0);
        System.out.println(res);
    }

    static int steps(int d, int i,int steps){
        if(i-d>=0 && (i-d)%2 == 0){
            return steps;
        }
        steps++;
        return steps(d,i+steps,steps);
    }
}
