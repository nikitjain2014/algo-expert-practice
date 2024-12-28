package com.nj.simple;
import java.util.*;

class TwoNumberSumSolution1 {
    public static void main(String[] args) {
        int[] inputArr = {3, 5, -4, 8, 11, 1, 6};
        int[] result = twoNumberSum(inputArr, 8);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    continue;
                } else {
                    if (array[i] + array[j] == targetSum) {
                        int[] result = new int[2];
                        result[0] = array[i];
                        result[1] = array[j];
                        return result;
                    }
                }
            }
        }
        return new int[0];
    }
}
