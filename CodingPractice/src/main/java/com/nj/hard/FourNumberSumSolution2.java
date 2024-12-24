package com.nj.hard;
import java.util.*;

public class FourNumberSumSolution2 {
    public static void main(String[] args){
        int[] array={7,6,4,-1,1,2};
        int targetSum=16;
        List<Integer[]> result=fourNumberSum(array,targetSum);

        for(Integer[] a:result){
            System.out.println(Arrays.toString(a));
        }
    }

    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        List<Integer[]> result=new ArrayList<>();
        Arrays.sort(array);

        for(int i=0;i<array.length-1;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                int left=j+1;
                int right=array.length-1;
                while(left < right){
                    int currentSum=array[i]+array[j]+array[left]+array[right];
                    if(targetSum==currentSum){
                        Integer[] fourNum=new Integer[4];
                        fourNum[0]=array[i];
                        fourNum[1]=array[j];
                        fourNum[2]=array[left];
                        fourNum[3]=array[right];
                        result.add(fourNum);
                        left++;
                        right--;
                    }
                    else if(currentSum < targetSum){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
        }

        return result;
    }
}

