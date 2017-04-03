package UprPracticeCompetition;
import java.util.ArrayList;
import java.util.List;

/*
    Problem: FizzBuzz
    
    Consider the following problem:
        Write a short program that prints each number from 1 to 100 on a new line. 
        For each multiple of 3, print "Fizz" instead of the number. 
        For each multiple of 5, print "Buzz" instead of the number. 
        For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number.
        Write a solution (or reduce an existing one) so it has as few characters as possible.

    @Author Chris M. Perez
    @Date   4/3/2017
*/

public class FizzBuzz {
    public static void main(String[] args){
        int MAX = 100;
        
        for(int i=1;i<=MAX;i++){
            System.out.println(solver(i));
        }    
    }
    
    public static String solver(int n){
        if (n % 15 == 0) {
            return "FizzBuzz";
        } else if (n % 5 == 0) {
            return "Buzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(n);
    }
}
