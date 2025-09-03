package com.nj.simple;

import java.util.Arrays;

public class FindThreeLargestNumbers {

    public static void main(String[] args) {
        int[] array=new int[]{141,1,17,-7,-17,-27,18,541,8,7,7};
        System.out.println("Top three numbers:"+ Arrays.toString(findThreeLargestNumbers(array)));
    }


    public static int[] findThreeLargestNumbers(int[] array) {
        // Write your code here.
        int[] result=new int[3];
        int a=array[0];int b= array[1];int c=array[2];

        if(a>=b && a>=c){result[0]=a; if(b>=c) {result[1]=b;result[2]=c;} else{result[1]=c;result[2]=b;}  }
        if(b>=a && b>=c){result[0]=b; if(a>=c) {result[1]=a;result[2]=c;} else{result[1]=c;result[2]=a;} }
        if(c>=a && c>=b){result[0]=c; if(a>=b){result[1]=a;result[2]=b;} else{result[1]=b;result[2]=a;}}

        for(int i=3;i<array.length;i++){
            int d=array[i];
            if(d>=result[0]){
                int temp=result[0];
                if(result[1]>=result[2]){result[2]=result[1];};
                if(result[0]>=result[1]){result[1]=result[0];};
                result[0]=d;
            }
            else if(d>=result[1]){
                if(result[1]>=result[2]){result[2]=result[1];};
                result[1]=d;
            }
            else if(d>result[2]){
                result[2]=d;
            }
        }

        int[] finalResult=new int[3];
        finalResult[0]=result[2];finalResult[1]=result[1];finalResult[2]=result[0];
        return finalResult;
    }
}
