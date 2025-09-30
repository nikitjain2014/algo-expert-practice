package com.nj.simple;

import java.util.Arrays;

public class SelectionSort {
    public static int[] selectionSort(int[] array){
        //Loop to iterate entire array
        for(int i=0;i<array.length;i++){
            int minElementPosition=i;
            int minElement=array[i];
            //iterate entire array from j index,find min element and replace it with j position
            for(int j=i+1;j<array.length;j++){
                if(minElement>array[j]){
                    minElement=array[j];
                    minElementPosition=j;
                }
            }
            //Swap Min element with i position
            if(i!=minElementPosition){
                int tempVar=array[i];
                array[i]=array[minElementPosition];
                array[minElementPosition]=tempVar;
            }
        }
      return  array;
    };

    public static void main(String[] args){
        int[] array=new int[]{12,11,2,5,6};
        System.out.println("Input Array:"+Arrays.toString(array));
        System.out.println("Sorted Array:"+Arrays.toString(selectionSort(array)));
        ;
    }
}
