


/*

Problem: Birthday Cake Candles

Colleen is turning n years old! She has b candles of various heights on her cake, 
and candle i has height height sub(i). Because the taller candles tower over the shorter ones,
Colleen can only blow out the tallest candles.

Given the height sub(i) for each individual candle, find and print the number of candles she can successfully blow out.

Input Format:
    The first line contains a single integer, , denoting the number of candles on the cake. 
    The second line contains n space-separated integers, where each integer i describes the height of candle .

@Author Chris M. Perez
@Date   4/2/2017

*/

package hackerranks;
import java.util.Arrays;
import java.util.Scanner;

public class BirthdayCakeCandles {
    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) {
       int array[] = new int[100000];
       int max;
       int Max;
       int max_equal = 0;
               
       Max = console.nextInt();
       
       for(int i=0;i<Max;i++){
           array[i] = console.nextInt();
       }
       
       max = Arrays.stream(array).max().getAsInt();
       max_equal = equals(array, max);
       
       System.out.println(max_equal);
    }
    
    public static int equals(int array[],int max){
        return (int)Arrays.stream(array).filter(i -> i == max).count();
    }
}
