package com.nj.simple;

public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        boolean flag=true;
        if(str.length()==1) return flag;
        else{
            char[] strCharArr=str.toCharArray();
            for(int i=0, j=strCharArr.length-1;i< (strCharArr.length/2);i++,j--){
                if(strCharArr[i]!=strCharArr[j]){
                    flag=false;
                    return flag;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args){
        String str="abcrcba";
       System.out.println("Flag:"+isPalindrome(str));
    }
}
