package com.nj.medium;
import java.util.*;

class ThreeNumberSumSolution2 {

    public static void main(String[] args){
        int[] input={12,3,1,2,-6,5,-8,6};
        int targetSum=0;
        List<Integer[]> result=threeNumberSum(input,targetSum);
        for(Integer[] arr:result){
            System.out.println(Arrays.toString(arr));
        }
    }

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        Arrays.sort(array); //-8,-6,1,2,3,5,6,12
        List<Integer[]> result=new ArrayList<Integer[]>();

        for(int i=0;i<array.length-2;i++){
            int left=i+1;
            int right=array.length-1;
            while(left < right){
                int currentSum=array[i]+array[left]+array[right];
                if(currentSum==targetSum){
                    Integer[] tripletArr=new Integer[3];
                    tripletArr[0]=array[i];
                    tripletArr[1]=array[left];
                    tripletArr[2]=array[right];
                    Arrays.sort(tripletArr);
                    result.add(tripletArr);
                    left++;right--;
                }
                else if(currentSum < targetSum){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return result;
    }
}