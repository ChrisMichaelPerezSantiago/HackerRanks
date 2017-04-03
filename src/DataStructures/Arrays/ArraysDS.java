
package DataStructures.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


/*
    Problem: Arrays - DS

    Input Format:
        The first line contains an integer, N (the number of integers in A). 
        The second line contains N space-separated integers describing A.
    
    Output Format:
        Print all  integers in  in reverse order as a single line of space-separated integers.    
   
    @Author Chris M. Perez
    @Date   4/2/2017
*/

public class ArraysDS {
    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int element;
        int MAX;
        
        MAX = console.nextInt();
      
        for(int i=0;i<MAX;i++){
            element = console.nextInt();
            list.add(element);
        }
        reverse(list);
        list.forEach(i -> System.out.print(i + " "));
    }
    
    public static List<Integer> reverse(List<Integer> list){
        Collections.reverse(list);
        return list;
    }
}
