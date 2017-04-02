/*
    Problem: Tutorial Intro
    
    Sample Challenge: 
    This is a simple challenge to get things started. Given a sorted array (ar) and a number (V), 
    can you print the index location of V in the array?

    The next section describes the input format. You can often skip it, if you are using included methods.

    Input Format: 
    There will be three lines of input:

     V    - the value that has to be searched.
     n    - the size of the array.
     ar-n -  numbers that make up the array.
    
    Output Format: 
        Output the index of V in the array.

    @Author Chris M. Perez
    @Date 4/2/2017
*/

package Sorting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class IntroTutorialChllenges {
    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int value = -1;
        int MAX;
        int element;
        
        value = console.nextInt();
        MAX = console.nextInt();
        
        for(int i=0;i<MAX;i++){
            element = console.nextInt();
            list.add(element);
        }
        System.out.println(search(list, value));     
    }
    
    public static int search(List<Integer> list,int value){
        int index = -1;
        index = Collections.binarySearch(list, value);
        
        return index;
    }
}