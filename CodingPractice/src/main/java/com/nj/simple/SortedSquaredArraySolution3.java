package com.nj.simple;

import java.util.Arrays;

public class SortedSquaredArraySolution3 {

    public static void main(String[] args) {
        int[] inputArray={-7,-2,4,5,6};
        int[] result=sortedSquaredArray(inputArray);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sortedSquaredArray(int[] array) {
        int[] sortedSquares=new int[array.length];
        int startIndex=0;
        int endIndex=array.length-1;

        for(int j=array.length-1;j>=0;j--){
            int smallerValue=array[startIndex];
            int largerValue=array[endIndex];

            if(Math.abs(smallerValue) > Math.abs(largerValue)){
                sortedSquares[j]=smallerValue*smallerValue;
                startIndex++;
            }
            else{
                sortedSquares[j]=largerValue*largerValue;
                endIndex--;
            }

        }

        return sortedSquares;
    }
}
