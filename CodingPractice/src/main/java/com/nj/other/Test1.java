package com.nj.other;

public class Test1 {
    public static void main(String[] args) {
        int flag=0;
        int[] arr=new int[2];
        arr[0]=2;
        arr[1]=2;
        flag= arr[0]==arr[1] ? 5 : 6;
        System.out.println("Flag:"+flag);
    }
}
