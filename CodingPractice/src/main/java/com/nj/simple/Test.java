package com.nj.simple;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] input={1,2,3,4,5};
        Arrays.sort(input);
        int[] decSorted=new int[input.length];
        for(int i=0;i<input.length;i++){
            decSorted[input.length-1-i]=input[i];
        }
        System.out.println("Descending Sorted Array:"+Arrays.toString(decSorted));

    }
}
