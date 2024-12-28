package com.nj.simple;
import java.util.*;

class TwoNumberSumSolution3 {

    public static void main(String[] args){
        int[] inputArr={3, 5, -4, 8, 11, -1, 6};
        int targetSum=10;

        int[] result=twoNumberSum(inputArr,targetSum);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        Hashtable<Integer,Integer> inputTable=new Hashtable<>();

        for(int i=0;i<array.length;i++){
            int potentialElement=targetSum- array[i];
            if(inputTable.containsKey(potentialElement)){
                return new int[]{array[i],potentialElement};
            }
            else{
                inputTable.put(array[i],i);
            }
        }

        return new int[0];
    }
}
