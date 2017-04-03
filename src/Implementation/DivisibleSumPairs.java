package Implementation;
import java.util.Scanner;


/*
    Problem: Divisible Sum Pairs
    
    You are given an array of  integers, a0,a1,...,an-1, and a positive integer,k. 
    Find and print the number of (i,j) pairs where i<j and ai + aj is evenly divisible by k.
    
    Input Format:
        The first line contains 2 space-separated integers, n  and , k respectively. 
        The second line contains n space-separated integers describing the respective 
        values of a0,a1,...,an-1.

    Output Format:
        Print the number of  pairs where i<j and ai + aj is evenly divisible by k.
        
    @Author Chris M. Perez
    @Date   4/2/2017
*/

public class DivisibleSumPairs {
    static Scanner console = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        int n;
        int k;
        int pairs = 0;
        int array[];
        
        n = console.nextInt();
        k = console.nextInt();
        
        
        array = new int[n];
        
        for(int i=0;i<n;i++){
            array[i] = console.nextInt();
        }
        
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(isPair(array, i, j, k)){
                    pairs++;
                }
            }
        }
        System.out.println(pairs);
    }
    
    public static Boolean isPair(int array[],int i,int j,int k){
        return (array[i] + array[j]) % k == 0;
    }
}