package ThirtyDayOfCode;
import java.util.Scanner;

/*
    Problem: Day 7 => Arrays

    Input Format:
        The first line contains an integer, N (the size of our array). 
        The second line contains N space-separated integers describing array A's 
        elements.

    Constraints:
        1 <= N <= 1000
        1 <= Ai <= 10000, Where Ai, is the ith integer in the array

    Output Format:
        Print the elements of array  in reverse order as a single line of 
        space-separated numbers.
    
    
    @Author Chris M. Perez
    @Date   4/10/2017
*/

public class Day7 {
    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) {
        int array[];
        int N;
        
        N = console.nextInt();
        array = new int[N];
        
        for(int i=0;i<N;i++)
            array[i] = console.nextInt();
        for(int j=array.length-1;j>=0;j--)
            System.out.print(array[j]+" ");
    }
}