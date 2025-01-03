package com.nj.other;

import java.util.Scanner;

public class EightHouseCellProblemSolution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //input for cell
        int cell_size = in .nextInt();

        int[] cell = new int[cell_size];
        for (int idx = 0; idx < cell_size; idx++) {
            cell[idx] = in .nextInt();
        }

        int days = in .nextInt();

        int[] result = stateOfCells(cell, days);

        for (int idx = 0; idx < result.length; idx++) {
            System.out.print(result[idx] + " ");
        }

        // System.out.print(result[result.length-1]);

        //8
        // 1 0 0 0 0 1 0 0
        // 1

        // 0 1 0 0 1 0 1 0

    }
    public static int[] stateOfCells(int[] cell, int days) {
        int n = cell.length;
        int[] temp = new int[n];
        int[] answer = new int[100];

        for (int d = 0; d < days; d++) {
            temp[0] = cell[1] == 0 ? 0 : 1;
            temp[n - 1] = cell[n - 2] == 0 ? 0 : 1;

            for (int i = 1; i < n - 1; i++) {
                temp[i] = cell[i - 1] == cell[i + 1] ? 0 : 1;
            }
            System.arraycopy(temp, 0, cell, 0, n);
        }

        return cell;
    }
}