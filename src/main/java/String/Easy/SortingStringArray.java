package String.Easy;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortingStringArray {
    public static void main(String[] args) {
        String[] countires={"Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", " Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"};

        sortingByStringLogic(countires);
        
        sortingUsingArraysMethod(countires);
    }

    private static void sortingUsingArraysMethod(String[] countires) {
        Arrays.sort(countires);
        System.out.println("Printing array in ascending order by using Arrays.sort method");
        System.out.println(Arrays.toString(countires));
        System.out.println("");
        Arrays.sort(countires, Collections.reverseOrder());
        System.out.println("Printing array in descending order by using Arrays.sort method");
        System.out.println(Arrays.toString(countires));
    }

    private static void sortingByStringLogic(String[] countires) {
        int n=countires.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                //using compare function of string- x.compareTo(y)>0 --- x greater than y
                  //                                                <0 ---y greater than x
                   //                                               =0 ---x is equal to y
                if(countires[i].compareTo(countires[j])>0){
                    //swap
                    String temp=countires[j];
                    countires[j]=countires[i];
                    countires[i]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(countires));
        System.out.println("");
    }
}
