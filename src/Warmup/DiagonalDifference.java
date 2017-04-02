package Warmup;

/*
        Problem: Diagonal Difference

        Given a square matrix of size , calculate the absolute difference between the sums of its diagonals.

            Input Format:
                The first line contains a single integer, . The next  lines denote the matrix's rows,
                with each line containing space-separated integers describing the columns.

            Output Format:
                Print the absolute difference between the two sums of the matrix's diagonals as a single integer.

        @Author Chris M. Perez
        @Date   4/1/2017
*/


import java.util.Scanner;

public class DiagonalDifference {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        int N;
        int array[][];

        N = console.nextInt();

        array = new int[N][N];

        System.out.println(sumMatrixDiagonal(array));
    }

    public static Integer sumMatrixDiagonal(int array[][]){
        int primaryDiagonal = 0;
        int secundaryDiagonal = 0;
        int diference;

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++) {
                array[i][j] = console.nextInt();

            }
        }

        for(int i=0;i<array.length;i++){
            primaryDiagonal += array[i][i];
        }

        for(int i=0;i<array.length;i++){
            secundaryDiagonal += array[i][array.length-i-1];
        }

        diference = Math.abs(primaryDiagonal - secundaryDiagonal);
        return diference;
    }
}
