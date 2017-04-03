
package UprPracticeCompetition;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;


/*
    Problem: Game of Thrones - 1
    
    But, to lock the door he needs a key that is an anagram of a certain palindrome string.
    The king has a string composed of lowercase English letters. Help him figure out 
    whether any anagram of the string can be a palindrome or not.

    Input Format: 
        A single line which contains the input string.

    Constraints: 
        1<= length of string <= 10 exp(10)  
        Each character of the string is a lowercase English letter.

    Output Format: 
        A single line which contains YES or NO in uppercase.

    @Author Chris M. Perez
    @Date   4/3/2017
*/


public class GameOfThrones1 {
    static Scanner console = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        String input;
        
        input = console.next();
        input.toLowerCase();
        
        if(isPalindromePermutation(input)){ System.out.println("YES"); }
        else { System.out.println("NO"); }
        
        console.close();
    }
    
    public static Boolean isPalindromePermutation(String word){
        return word.chars()
                   .boxed()
                   .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                   .values()
                   .stream()
                   .filter(i -> i % 2 == 1)
                   .count() <= 1;
    }
}