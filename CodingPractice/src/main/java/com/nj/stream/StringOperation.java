package com.nj.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;

public class StringOperation {
    public static void main(String[] args) {

        //Write a Java program to convert a list of strings to uppercase or lowercase using streams
        List<String> inputStrLst=Arrays.asList("Hello","Test","Hello","Java","Class");
        List<String> outputUpperLst=inputStrLst.stream().map(s -> s.toUpperCase(Locale.ROOT)).collect(Collectors.toList());
        List<String> outputLowerLst=inputStrLst.stream().map(s -> s.toLowerCase(Locale.ROOT)).collect(Collectors.toList());
        System.out.println("Output String in Upper Case:"+outputUpperLst);
        System.out.println("Output String in Lower Case:"+outputLowerLst);

        //Write a Java program to remove all duplicate elements from a list using streams.
        Set<String> outputSet= inputStrLst.stream().collect(Collectors.toSet());
        System.out.println("Removed Duplicate Set:"+outputSet);
        List<String> distinctLst=inputStrLst.stream().distinct().collect(Collectors.toList());
        System.out.println("Removed Duplicate Distinct List:"+distinctLst);

        //Write a Java program to count the number of strings in a list that start with a specific letter using streams.
        List<String> inputLst= Arrays.asList("Sachin","Hello","Sourabh","Aman");
        List<String> outputLst= inputLst.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
        long count=inputLst.stream().filter(s -> s.startsWith("S")).count();
        System.out.println("Stream Start with S:"+outputLst);
        System.out.println("Stream Start with S Count:"+count);

    }
}
