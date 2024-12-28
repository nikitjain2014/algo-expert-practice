package com.nj.simple;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class OptimalFreelanceSolution1  {
    public static void main(String[] args) {
        int weeklyPaymentSum=0;
      /*  boolean[] weekTimeline=new boolean[7];
        for(boolean b:weekTimeline)
        System.out.println("Initial WeekTimeline value"+b);*/
        Map<String,Integer>[] jobs=new HashMap[7];

        Map<String,Integer> job1=new HashMap();
        job1.put("deadline",1);
        job1.put("payment",1);
        jobs[0]=job1;

        Map<String,Integer> job2=new HashMap();
        job2.put("deadline",2);
        job2.put("payment",2);
        jobs[1]=job2;

        Map<String,Integer> job3=new HashMap();
        job3.put("deadline",2);
        job3.put("payment",2);
        jobs[2]=job3;

        Map<String,Integer> job4=new HashMap();
        job4.put("deadline",7);
        job4.put("payment",1);
        jobs[3]=job4;

        Map<String,Integer> job5=new HashMap();
        job5.put("deadline",4);
        job5.put("payment",3);
        jobs[4]=job5;

        Map<String,Integer> job6=new HashMap();
        job6.put("deadline",4);
        job6.put("payment",5);
        jobs[5]=job6;

        Map<String,Integer> job7=new HashMap();
        job7.put("deadline",3);
        job7.put("payment",1);
        jobs[6]=job7;

       /* for(Map<String,Integer> job:jobs){
            System.out.println("Deadline:"+job.get("deadline")+" Payment:"+job.get("payment"));
        }*/
      //  Arrays.sort(jobs,(a, b) ->b.get("payment")-a.get("payment"));

        for(Map<String,Integer> job:jobs){
            System.out.println("Deadline:"+job.get("deadline")+" Payment:"+job.get("payment"));
        }


        System.out.println("Total Week Earning:"+optimalFreelancing(jobs));

    }

    public static int optimalFreelancing(Map<String, Integer>[] jobs) {
        //Sort Array of Jobs based on Payment
        Arrays.sort(jobs,(a, b) ->b.get("payment")-a.get("payment"));

        //Create Week Days array to keep track for higher payment job
        boolean[] weekJobs=new boolean[7];
        int totalWeekPayment=0;

        for(Map<String,Integer> job:jobs){
            int deadline=job.get("deadline");

            //If deadline greater than 7 then set it as 7, as we can do that job within week only
            if(deadline>7)deadline=7;
            int paymentAmount=job.get("payment");
            //Fill weekly Payment Job with higher payment data
            for(int j=deadline;j>=1;j--){
                if(!weekJobs[j-1]){
                    weekJobs[j-1]=true;
                    totalWeekPayment=totalWeekPayment+paymentAmount;
                    break;
                }
            }
        }
        return totalWeekPayment;
    }
}
