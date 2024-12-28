package com.nj.simple;
import java.util.*;

class ValidateSubSequenceSolution2 {

    public static void main(String[] args){
        List<Integer> array=new ArrayList<Integer>(Arrays.asList(1,1,6,1));
        List<Integer> sequence=new ArrayList<Integer>(Arrays.asList(1,1,6));
        boolean result=isValidSubsequence(array,sequence);
        System.out.println(result);
    }

    public static boolean isValidSubsequence(
            List<Integer> array, List<Integer> sequence
    ) {
        int arrayIdx=0;
        int sequenceIdx=0;
        while(arrayIdx<array.size() && sequenceIdx<sequence.size()){
            if(array.get(arrayIdx)==sequence.get(sequenceIdx)){
                sequenceIdx++;
            }
            arrayIdx++;
        }
        return sequenceIdx==sequence.size();
    }
}
