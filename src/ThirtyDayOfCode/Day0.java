package ThirtyDayOfCode;
import java.util.Scanner;

/*
    Problem: Day 0: Hello,World
    Input Format:
        A single line of text denoting inputString (the variable whose contents must be printed).
    Output Format:
        Print Hello, World. on the first line, and the contents of inputString on the second line.
    @Author Chris M. Perez
    @Date  4/3/2017
*/

public class Day0{
    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) {
        String word;
        
        word = console.nextLine();
        System.out.println("Hello, World.");
        System.out.println(word);
    }
}