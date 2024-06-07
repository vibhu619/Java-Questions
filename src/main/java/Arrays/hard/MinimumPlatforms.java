package Arrays.hard;

import java.util.Arrays;

//Given arrival and departure times of all trains that reach a railway station. Find the minimum number of platforms required for the railway station so that no train is kept waiting.
//        Consider that all the trains arrive on the same day and leave on the same day. Arrival and departure time can never be the same for a train but we can have arrival time of one train equal to departure time of the other. At any given instance of time, same platform can not be used for both departure of a train and arrival of another train. In such cases, we need different platforms.
//
//
//        Example 1:
//
//        Input: n = 6
//        arr[] = {0900, 0940, 0950, 1100, 1500, 1800}
//        dep[] = {0910, 1200, 1120, 1130, 1900, 2000}
//        Output: 3
//        Explanation:
//        Minimum 3 platforms are required to
//        safely arrive and depart all trains.
public class MinimumPlatforms {
    public static void main(String[] args) {
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int [] dep = {910, 1200, 1120, 1130, 1900, 2000};

        System.out.println(findPlatform(arr,dep,arr.length));
    }
    static int findPlatform(int arr[], int dep[], int n)
    {

        //Logic- sort both arrival and departure. Check on  a timeline if a train arrives then u need a platform hence count of platform is increased
        //if train time is to depart comes, means platform count reduced. Every time keep maximum count of platform in a variable stored which will be the answer
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=0;
        int j=0;
        int c=0;
        int m=0;
        while(i<n && j<n){
            if(arr[i]<=dep[j]){  //if train arrives
                c++;  //count of platform++
                m=Math.max(c,m);
                i++;
            }
            else{//if train departs platform --
                c--;
                j++;
            }
        }
        return m;

    }
}
