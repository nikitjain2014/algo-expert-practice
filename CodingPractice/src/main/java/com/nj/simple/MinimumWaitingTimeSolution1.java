package com.nj.simple;
import java.util.*;

public class MinimumWaitingTimeSolution1  {

    public static void main(String[] args){

        int[] queries={3,2,1,2,6};
        //Arrays.sort(queries,(a,b)->{ return (b-a);});
       // Arrays.sort(queries,(a,b)->b-a);
        System.out.println("Minimum execution time:"+minimumWaitingTime(queries));
    }
    public static int minimumWaitingTime(int[] queries) {
        // Write your code here.
        //1,2,2,3,6
        //1+2
        int waitingTime=0;
        Arrays.sort(queries);
        int sum=0;
        for(int i=0;i<queries.length-1;i++){
            waitingTime=waitingTime+queries[i];
            sum=sum+waitingTime;
            //i==0, t=1
            //i=1, t=3
            //i=2; t=5
            //i=3; t=8
        }
        return sum;
        //0+1+3+5+8=17
        //
    }
}
