package com.nj.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Average {
    public static void main(String[] args) {

        // Write a Java program to calculate the average of a list of integers using streams.
        IntStream intStream=IntStream.of(10,20,30,40,50);
        OptionalDouble avg=intStream.skip(1).average();
        if(avg.isPresent()){
            System.out.println("Average Value:"+avg.getAsDouble());
        }

        // Write a Java program to calculate the average of a list of integers using streams.
        List<Integer> inputLst=Arrays.asList(1,2,3,4,5);
        Double avgResult=inputLst.stream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println("Average Value2:"+avgResult);



    }
}
