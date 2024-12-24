package com.nj.simple;
import java.util.Arrays;

public class TwoNumberSumSolution4 {

    public static void main(String[] args) {
        int[] inputArr = {3, 5, -4, 8, 11, 5,12,1, 6};
        int targetSum=13;
        int[] result=twoNumberSum(inputArr,targetSum);
        System.out.println(Arrays.toString(result));
    }

   private static int[] twoNumberSum(int[] inputArr,int targetSum){
Arrays.sort(inputArr);
//-4,1,3,5,6,8,11,12
int left=0;
int right=inputArr.length-1;
while(left<inputArr.length && right>0){
    if(targetSum==inputArr[left]+inputArr[right])
    {
    return new int[]{inputArr[left], inputArr[right]};
    }
    else if(targetSum>inputArr[left]+inputArr[right]){
        left++;
    }
    else{
        right++;
    }
}
        return new int[0];
    }
}
