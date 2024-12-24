package com.nj;

import java.util.ArrayList;
import java.util.*;

public class Test {

    public static void main(String[] args){
        int[] input={12,3,1,2,-6,5,-8,6};
    int targetSum=0;
        List<Integer[]>  result=threeSumSol(input,targetSum);

    for(Integer[] a:result){
        System.out.println(Arrays.toString(a));
    }
    }

    public static List<Integer[]> threeSumSol(int[] input,int targetSum){
        List<Integer[]> result=new ArrayList<>();
        Arrays.sort(input); //-8,-6,1,2,3,5,6,12
        for(int i=0;i<input.length-2;i++){
            for(int j=i+1;j<input.length-1;j++){
             for(int k=j+1;k<input.length;k++){
            if((i!=j & j!=k)&&(targetSum==input[i]+input[j]+input[k]))
            {
                Integer[] triplet=new Integer[3];
                triplet[0]=input[i];
                triplet[1]=input[j];
                triplet[2]=input[k];
                Arrays.sort(triplet);
                result.add(triplet);
            }
             }
            }
        }

        return result;
    }
}
