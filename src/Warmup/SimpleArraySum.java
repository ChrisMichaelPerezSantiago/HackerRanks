package Warmup;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**

 Problem: Simple Array Sum


 Given an array of N integers, can you find the sum of its elements?

   Input Format:

        The first line contains an integer, N , denoting the size of the array.
        The second line contains N space-separated integers representing the array's elements.

   Output Format
        print the sum of the array's elements as a single integer.


  @Author Chris M. Perez on
  @Date   4/1/2017.

 */



public class SimpleArraySum {
    static Scanner console = new Scanner(System.in);


    public static void main(String[] args) {
        int elements = 0;
        int max;
        List<Integer> list = new ArrayList<>();

        max = console.nextInt();

        for(int i=0;i<max;i++){
            elements = console.nextInt();
            list.add(elements);
        }
        System.out.println(sum(list));
    }

    public static Integer sum(List<Integer> list){
        return list.stream().mapToInt(Integer::intValue).sum();
    }
}

