package com.nj.simple;

import java.util.ArrayList;

public class RunLengthEncodingSolution {
    public String runLengthEncoding(String string) {
        // Write your code here.
        return "";
    }
    public static void main(String[] args){
        String string="AAAAAAAAAAAAABBC";
        char[] charArray=string.toCharArray();
        ArrayList<String> outputList=new ArrayList<String>();

        for(int i=0;i<charArray.length;i++)
        {
            String temp=new String(String.valueOf(charArray[i]));
            int count=1;
            for (int j=i+1;j<charArray.length;j++){
                if(charArray[i]==charArray[j]){
                    count++;
                    i++;
                }
            }
            if(count>1)
            {
                if(count>10){
                    int tenMultipleCount=count/9;
                    for(int a=1;a<=tenMultipleCount;a++)
                    outputList.add(String.valueOf(9)+String.valueOf(temp));

                    outputList.add(String.valueOf(count%9)+String.valueOf(temp));
                }
                else{
                outputList.add(String.valueOf(count)+String.valueOf(temp));}
            }
            else
                outputList.add(String.valueOf(temp));
        }

        String output="";
        for(int p=0;p<outputList.size();p++)
        {
            output=output+(String)outputList.get(p);
        }


    }
}
