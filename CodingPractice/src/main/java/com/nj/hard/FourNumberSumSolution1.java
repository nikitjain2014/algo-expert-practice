package com.nj.hard;
import java.util.*;

public class FourNumberSumSolution1  {
    public static void main(String[] args)
    {
        int[] input={7,6,4,-1,1,2};
        int targetSum=16;
        List<Integer[]> result=fourNumberSum(input,targetSum);
        for(Integer[] a:result){
            System.out.println(Arrays.toString(a));
        }
    }

    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        List<Integer[]> result=new ArrayList<Integer[]>();
        Arrays.sort(array);
        for(int i=0;i<array.length-3;i++){
            for(int j=i+1;j<array.length-2;j++)
            {
                for(int k=j+1;k<array.length-1;k++){
                    for(int u=k+1;u<array.length;u++){
                        if(targetSum==array[i]+array[j]+array[k]+array[u]){
                            Integer[] fourNumSumArr=new Integer[4];
                            fourNumSumArr[0]=array[i];
                            fourNumSumArr[1]=array[j];
                            fourNumSumArr[2]=array[k];
                            fourNumSumArr[3]=array[u];
                            result.add(fourNumSumArr);
                        }
                    }
                }
            }
        }
        return result;
    }
}
