
/*
    Problem: Plus Minus

            Given an array of integers, calculate which fraction of its elements are positive, which fraction of its elements are negative,
            and which fraction of its elements are zeroes, respectively. Print the decimal value of each fraction on a new line.

            Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers
                  with absolute error of up to  are acceptable.

            @Author Chris M. Perez
            @Date 2/4/2017
*/

import java.util.Scanner;


public class PlusMinus {
    static Scanner console = new Scanner(System.in);


    public static void main(String[] args) {
        final int N;
        int array[];

        N = console.nextInt();

        array = new int[N];

        for(int i=0;i<N;i++){
            array[i] = console.nextInt();
        }

        plusMinus(array);
    }

    public static void plusMinus(int array[]){
        int positiveCounter = 0;
        int negativeCounter = 0;
        int zeroCounter = 0;
        double pos = 0.0,neg = 0.0,zero = 0.0;
        double size = array.length;


        for(int i=0;i<size;i++){
            if(array[i] > 0){
                positiveCounter ++;
            }else if(array[i] < 0){
                negativeCounter ++;
            }else{
                zeroCounter ++;
            }
        }

        pos = positiveCounter / size;
        neg = negativeCounter / size;
        zero = zeroCounter / size;

        System.out.printf("%.6f\n%.6f\n%.6f",pos,neg,zero);
    }
}
