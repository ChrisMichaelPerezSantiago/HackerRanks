import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
        Problem: A Very Big Sum

        You are given an array of integers of size . You need to print the sum of the elements in the array,
        keeping in mind that some of those integers may be quite large.

        Input Format:
            The first line of the input consists of an integer . The next line contains  space-separated integers contained in the array.

        Output Format:
            Print a single value equal to the sum of the elements in the array.

        Constraints:
            1 <= N <= 100
            0 <= A[i] <= 10 exp(10)

        Sample Input:

        5
        1000000001 1000000002 1000000003 1000000004 1000000005

        @Author Chris M. Perez
        @Date   4/1/2017
*/


public class AVeryBigSum {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        List<Long> list = new ArrayList<>();
        long elements;
        long max;

        max = console.nextLong();

        for(int i=0;i<max;i++){
            elements = console.nextLong();
            list.add(elements);
        }
        System.out.println(sum(list));
    }

    public static Long sum(List<Long> list){
        return list.stream().mapToLong(Long::longValue).sum();
    }
}
