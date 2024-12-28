package com.nj.simple;
import java.util.*;

//O(nlogn) and Space O(1)
public class NonConstructibleChangeSolution1 {
    public static void main(String[] args){
        int[] coins={1};
        int result=nonConstructibleChange(coins);
        System.out.println("Minimum Amount of Change that can't create:"+result);

    }
    public static int nonConstructibleChange(int[] coins) {
        Arrays.sort(coins);
        int change=0;
        for(int i=0;i<coins.length;i++){
            int value=coins[i];
            if(value>change+1)
            {
                return change+1;
            }
            else
            {
                change=change+value;
            }
        }

        return change+1;
    }
}
