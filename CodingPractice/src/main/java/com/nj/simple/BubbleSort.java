package com.nj.simple;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
     int[] input={5,3,8,4,2};
     System.out.println("Sorted Output:"+ Arrays.toString(bubbleSort(input)));
    }

    static int[]  bubbleSort(int[] input){
       // int[] sortedOutput=new int[input.length];
     for(int i=0;i<input.length;i++){
       for(int j=i+1;j<input.length;j++){
     if(input[i]>=input[j]){
        int temp=input[j];
        input[j]=input[i];
        input[i]=temp;
    }
}
        }
        return input;
    }
}
