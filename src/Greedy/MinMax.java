package Greedy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


/*
    Problem: Min Max

    Input Format:
        The first line contains an integer N. 
        The second line contains an integer k. 
 l      ines follow. Each line contains an integer that belongs to the list N.

        Note: Integers in the list  may not be unique.
        
    Output Format: 
        An integer that denotes the minimum possible value of unfairness.
       
    Constraints:
        2<=N<=10 exp(5)
        2<=K<=N
        0<=integer in N <= 10 exp(9)

    @Author Chris M. Perez
    @Date   4/3/2017
*/


public class MinMax {
    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) {
        List<Integer> list;
        int n , k , min;
        
    
        n = console.nextInt();
        k = console.nextInt();
        list = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            list.add(console.nextInt());
        }
        
        
        min = Integer.MAX_VALUE;
        Collections.sort(list);
        min = list.get(k-1) - list.get(0);
        
        for(int i=0;i<n-k+1;i++){
            if(min(list, min, k, i)){
                min = list.get(i+k-1) - list.get(i);
            }
        }
        System.out.println(min);
    }
    
    public static Boolean min(List<Integer> list,int min,int k,int i){
        return list.get(i+k-1) - list.get(i) < min;
    }
}