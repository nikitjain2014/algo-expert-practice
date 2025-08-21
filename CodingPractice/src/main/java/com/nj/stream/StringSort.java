package com.nj.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StringSort {
    public static void main(String[] args) {
        //Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.
        List<String> inputLst= Arrays.asList("Aman","Manoj","Naman","Jay","Yash","Vivek");
        List<String> outputLst= inputLst.stream().sorted().collect(Collectors.toList());
        System.out.println("Ascending Order Sorted String List:"+outputLst);

        List<String> outputDescLst= inputLst.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        List<String> outputDescLst2Way= inputLst.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
        System.out.println("Descending Order Sorted String List:"+outputDescLst);
        System.out.println("Descending Order Sorted String List 2nd Way:"+outputDescLst2Way);
    }
}
