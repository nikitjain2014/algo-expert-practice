package com.nj.stream;

import java.util.Arrays;
import java.util.List;

public class SmallestLargestNumber {
    public static void main(String[] args) {

        //Write a Java program to find the K smallest and largest elements in a list of integers using streams.
        List<Integer> inputNumLst= Arrays.asList(1,4,5,6,3,23,54,36,24,67);
        int k=2;
        int largestNum=inputNumLst.stream().sorted((a,b) -> b - a).skip(1).mapToInt(Integer::intValue).max().getAsInt();
        int smallestNum=inputNumLst.stream().sorted().skip(1).mapToInt(Integer::intValue).min().getAsInt();
        System.out.println("Kth Largest Number:" +largestNum);
        System.out.println("Kth Smallest Number:" +smallestNum);


    }
}
