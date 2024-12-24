package com.nj.simple;
import java.util.*;
public class SortedSquaredArraySolution1  {
    public static void main(String[] args){
        //Sorted Array as Input
        int[] input={-2,1,4,5};
        System.out.println(Arrays.toString(sortedSquaredArray(input)));

    }
    public static int[] sortedSquaredArray(int[] array) {
        // Write your code here.
        int[] result=new int[array.length];


        for(int i=0;i<array.length;i++){

            result[i]=array[i]*array[i];
        }
        Arrays.sort(result);
        return result;
    }
}
