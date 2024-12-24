package com.nj.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SortedSquaredArraySolution2{

    public static void main(String[] args){
        //Sorted Array as Input
        int[] input={-2,1,4,5};
        System.out.println(Arrays.toString(sortedSquaredArray(input)));

        //HashMap<String,Integer> teamScore=new HashMap<String,Integer>();

    }
    public static int[] sortedSquaredArray(int[] array) {
        int[] result=new int[array.length];
        int low=0; int high=array.length-1;
        for(int j=array.length-1;j>=0;j--)
        {
            int smallerValue=array[low];
            int largeValue=array[high];
            if(Math.abs(smallerValue)> Math.abs(largeValue))
            {
                result[j]=smallerValue*smallerValue;
                low++;
            }
            else{
                result[j]=largeValue*largeValue;
                high--;
            }
        }

        return result;
    }
}
