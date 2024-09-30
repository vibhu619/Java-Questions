package Arrays.easy;

import java.util.ArrayList;
//Union and intersection of 2 sorted arrays
//Using 2 pointer approach
public class UnionAndIntersection {
    public static void main(String[] args) {
        int[] a={1, 3, 4, 5, 7};
        int[] b= {2, 3, 5, 6};
        int n1=a.length;
        int n2=b.length;

        union(n1, n2, a, b);
        interection(a,b,n1,n2);
    }



    private static void union(int n1, int n2, int[] a, int[] b) {
        int i=0;
        int j=0;
        int k=0;
        ArrayList<Integer> result=new ArrayList<>();
        while(i< n1 && j< n2) {
            if (a[i] < b[j]) {
                result.add(a[i]);
                i++;
            } else if (a[i] > b[j]) {
                result.add(b[j]);
                j++;
            } else {
                result.add(a[i]);
                i++;
                j++;
            }
            k++;

        }
        while(i< n1){
            result.add(a[i]);
            i++;
            k++;
        }
        while(j< n2){
            result.add(b[j]);
            j++;
            k++;
        }
        System.out.println("Union");
        for (int x:result
             ) {

            System.out.println( +x+ ",");

        }
        System.out.println("\n");

    }

    private static void interection(int[] a, int[] b, int n1, int n2) {
        int i = 0;
        int j = 0;
        int k = 0;
        ArrayList<Integer> result = new ArrayList<>();
        while (i < n1 && j < n2) {
            if (a[i] == b[j]) {
                result.add(a[i]);
                i++;
                j++;
                k++;
            } else if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            }
        }

        System.out.println("Intersection");
            for (int x:result
            ) {
                System.out.println(x+ ",");

            }
    }
}
