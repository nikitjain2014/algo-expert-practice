package com.nj.simple;
import java.util.*;
public class TransposeMatrixSolution1 {
    public static void main(String[] args){
        int[][] matrix={{1,2},{3,4}};
        //matrix= {{1,2},{3,4}};  [[1,2,3]] //1,3
        int[][] result=new int[matrix[0].length][matrix.length];
        result=transposeMatrix(matrix);
        System.out.println(Arrays.deepToString(transposeMatrix(matrix)));
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        if(matrix.length>0){
            int[][] result=new int[matrix[0].length][matrix.length];
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    result[j][i]=matrix[i][j];
                }
            }
            return result;}
        else{
            return new int[] []{};
        }
    }
}
