package com.nj.simple;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoNumberSumSolution2 {

    public static void main(String[] args) {
        int[] inputArr = {3,42, 5, -4, 8, 11, -1, 6};
        int[] result = twoNumberSum(inputArr, 10);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoNumberSum(int[] array, int targetSum) {
        Set<Integer> inputSet=new HashSet<>();
        int[] outputArr=new int[2];
        for(int i=0;i<array.length;i++){
        if(inputSet.contains(targetSum-array[i])){
                return new int[] {array[i],targetSum-array[i]};
            }
            else{
                inputSet.add(array[i]);
            }
        }
        return new int[0];
    }

}
