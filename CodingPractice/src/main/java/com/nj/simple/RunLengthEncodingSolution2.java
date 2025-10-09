package com.nj.simple;

public class RunLengthEncodingSolution2 {
    public String runLengthEncoding(String string) {
        // Write your code here.
        return "";
    }

    public static void main(String[] args) {
        String string="AAAABBCCDD";
        char[] charArray=string.toCharArray();
        //  String output="";
        StringBuffer output=new StringBuffer();
        int lengthCount=1;
        for(int i=1;i<charArray.length;i++ ){
            char previousChar=charArray[i-1];
            char currentChar=charArray[i];

            if(currentChar!=previousChar || lengthCount==9){
                output.append(lengthCount);
                output.append(previousChar);
                lengthCount=0;
            }
            lengthCount++;
        }
        output.append(lengthCount);
        output.append(charArray[charArray.length-1]);
        String encodingResult= output.toString();
        System.out.println("Encoding result"+encodingResult);
    }
}
