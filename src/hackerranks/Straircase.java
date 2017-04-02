/*
    Problem: Straircase

    Consider a staircase of size :

       #
      ##
     ###
    ####

    Observe that its base and height are both equal to , and the image is drawn using
    # symbols and spaces. The last line is not preceded by any spaces.

    Write a program that prints a staircase of size .

    Input Format:
        A single integer, , denoting the size of the staircase.

    Output Format:
        Print a staircase of size  using # symbols and spaces.

    Note: The last line must have  spaces in it.


    @Author Chris M. Perez
    @Date   4/2/2017

*/


package hackerranks;
import java.util.Scanner;

public class Straircase {
    static Scanner console = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        final int MAX;
        
        MAX = console.nextInt();
        generateTriangle(MAX);
    }
    
    public static void generateTriangle(int MAX){
        for(int i=1;i<=MAX;i++){
            for(int j=MAX;j>0;j--){
                if(i<j){
                    System.out.print(" ");
                }else{
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}