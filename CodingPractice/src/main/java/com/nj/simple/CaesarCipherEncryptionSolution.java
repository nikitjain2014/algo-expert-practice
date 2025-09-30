package com.nj.simple;

public class CaesarCipherEncryptionSolution {
    public static String caesarCypherEncryptor(String str, int key) {
        //convert input into char array
        char[] strCharArr=str.toCharArray();

        //output char array to hold encrypted chars
        char[] outputArr=new char[strCharArr.length];
        if(key>26)
        {
            key=(int)key%26;
        }
        for(int i=0;i<strCharArr.length;i++){
        //Ascii value for each char with added key
             int asciiVal=strCharArr[i]+key;
            if(asciiVal>((int)'z')){
                    asciiVal=asciiVal-26;
                }

            outputArr[i]=(char)asciiVal;
        }
        String output=new String(outputArr);
        return output;
    }
    public static void main(String[] args){
        String str="xyz";
        int key=52;
        System.out.println("Output String after encryption:"+caesarCypherEncryptor(str,key));

    }
}
