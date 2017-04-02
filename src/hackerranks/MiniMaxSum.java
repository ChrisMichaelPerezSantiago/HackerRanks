
/*
  Problem: Min-Max Sum
   
  Given five positive integers, find the minimum and maximum values that can be calculated 
  by summing exactly four of the five integers. Then print the respective minimum and maximum 
  values as a single line of two space-separated long integers.

  Input Format:
    A single line of five space-separated integers.

  Constraints:
    Each integer is in the inclusive range .

  Output Format:
    Print two space-separated long integers denoting the respective minimum and maximum values 
   that can be calculated by summing exactly four of the five integers. (The output can be greater than 32 bit integer.)


  @Author Chris M. Perez
  @Date   4/2/2017
*/
package hackerranks;

import java.util.Arrays;
import java.util.Scanner;


public class MiniMaxSum {
    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) {

        long elements[] = new long [1000000];
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE; 
        long sum = 0L;
        
        elements = Arrays.stream(console.nextLine().split(" "))
                         .mapToLong(Long::parseLong).toArray();
        
        for(int i=0;i<elements.length;i++){
            sum += elements[i];
            if(elements[i] < min) { min = elements[i]; }
            if(elements[i] > max) { max = elements[i]; }
        }
        System.out.println((sum - max) + " " + (sum - min));
    }
}
