package com.nj.simple;

import java.util.Arrays;

public class InsertionSort {

    public static int[] insertionSort(int[] array) {
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args){
        int[] array=new int[]{12,11,2,5,6};
        System.out.println("Input Array:"+ Arrays.toString(array));
        System.out.println("Sorted Array:"+ Arrays.toString(insertionSort(array)));
    }

}
