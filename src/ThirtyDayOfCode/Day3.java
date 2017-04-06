
package ThirtyDayOfCode;
import java.util.Scanner;


/*
    Problem: Day 3 => Intro To Conditional Statement
    
    @Author Chris M. Perez
    @Date   4/6/2017
*/

public class Day3 {
    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n;
        
        n = console.nextInt(); 
    }
    
    public static void isEven(int n){
        if(n % 2 == 0){
            if(n < 6){
                System.out.println("Not Weird");
            }else if(n < 21){
                System.out.println("Weird");
            }else{
                System.out.println("Not Weird");
            }
        }else{
            System.out.println("Weird");
        }
    }
}
