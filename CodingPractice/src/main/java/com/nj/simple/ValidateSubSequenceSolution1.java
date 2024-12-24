package com.nj.simple;
import java.util.*;

class ValidateSubSequenceSolution1  {

    public static void main(String[] args){
        List<Integer> array=new ArrayList<Integer>(Arrays.asList(1,1,6,1));
        List<Integer> sequence=new ArrayList<Integer>(Arrays.asList(1,1,1,6));
        boolean result=isValidSubsequence(array,sequence);
        System.out.println(result);
    }

    public static boolean isValidSubsequence(
            List<Integer> array, List<Integer> sequence
    ) {
        int k=0;

        if(array.equals(sequence)){
            return true;
        }

        for(int i=0;i<array.size();i++){
            if(k!=sequence.size() && array.get(i)==sequence.get(k))
            {k=k+1;}
        }

        if(k==sequence.size())
        {
            return true;
        }

        return false;
    }
}


/*{

    public static void main(String[] args){
        List<Integer> array=new ArrayList<Integer>(Arrays.asList(1,1,6,1));
        List<Integer> sequence=new ArrayList<Integer>(Arrays.asList(1,1,1,6));
        // List<Integer> sequence=new ArrayList<Integer>(Arrays.asList(1,6,-1,10));
        boolean result=isValidSubsequence(array,sequence);
        System.out.println(result);
    }

    public static boolean isValidSubsequence(
            List<Integer> array, List<Integer> sequence
    ) {
        boolean flag=false;
   if(sequence.size()>array.size())
    {
      return false;
    }
   else{
        List<Integer> sequenceIndexLst=new ArrayList<Integer>();
        for(int i=0;i<sequence.size();i++)
        {
            int k=array.indexOf(sequence.get(i));
            sequenceIndexLst.add(k);
        }

        int index=0;

        for(int j=0;j<sequenceIndexLst.size();j++){

            if(index<=sequenceIndexLst.get(j)){
                flag=true;
                index=sequenceIndexLst.get(j);
            }
            else{
              return false;
            }
        }
        return flag;
    }
    }
}
*/