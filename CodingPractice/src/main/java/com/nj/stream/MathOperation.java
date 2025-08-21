package com.nj.stream;

import java.util.Arrays;
import java.util.List;

public class MathOperation {
    public static void main(String[] args) {
        List<Integer> inputLst = Arrays.asList(1, 4, 6, 3, 2, 6);

        int evenNumberSum = inputLst.stream()
                .mapToInt
                        (a -> {
                            if (a % 2 == 0) {
                                return a;
                            } else {
                                return 0;
                            }
                        }).sum();

        int oddNumberSum = inputLst.stream()
                .mapToInt
                        (a ->
                                {
                                    if (a % 2 != 0) {
                                        return a;
                                    } else {
                                        return 0;
                                    }
                                }
                        ).sum();

        // Write a Java program to find the maximum and minimum values in a list of integers using streams.
        int max = inputLst.stream().mapToInt(Integer::intValue).max().getAsInt();
        int min = inputLst.stream().mapToInt(Integer::intValue).min().getAsInt();
        System.out.println("Even Number Sum:" + evenNumberSum);
        System.out.println("Odd Number Sum:" + oddNumberSum);

        System.out.println("Max Number:" + max);
        System.out.println("Min Number:" + min);
    }
}
