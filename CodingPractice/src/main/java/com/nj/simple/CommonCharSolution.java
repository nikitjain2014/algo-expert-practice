package com.nj.simple;

import java.util.*;
import java.util.stream.Collectors;

public class CommonCharSolution {

    public String[] commonCharacters(String[] strings) {
        // Write your code here.
        return new String[] {};
    }
    public static void main(String[] args) {
String[] input=new String[]{"abc","bcd","cbaccd"};

Map<String,Integer> charactorsCount=new HashMap<String,Integer>();

for(String str:input){
    //Set to store unique character in string
    Set<Character> uniqueCharInStr=new HashSet<Character>();
    for(int j=0;j<str.length();j++){
        if(!uniqueCharInStr.contains(str.charAt(j))){
            uniqueCharInStr.add(str.charAt(j));
            charactorsCount.put(Character.toString(str.charAt(j)),
                    charactorsCount.getOrDefault(Character.toString(str.charAt(j)),0)+1);
        }
    }
}

        HashSet<String> outputSet=new HashSet<String>();
        for(String key:charactorsCount.keySet()){
            if(charactorsCount.get(key)==input.length)
                outputSet.add(key);
        }

        String[] result=outputSet.toArray(new String[0]);

        for(String s:result)
        System.out.print("Result: "+s+",");
    }
}
