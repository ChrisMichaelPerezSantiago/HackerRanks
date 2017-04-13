package Strings;
import java.util.Scanner;

/*
    Problem: Beautiful Binary String 

    Input Format:
        The first line contains an integer, n (the length of binary string B). 
        The second line contains a single binary string,B, of length n.
    
    Output Format:
        Print the minimum number of steps needed to make the string beautiful.


    @Author  Chris M. Perez
    @Date    4/4/2017
*/

public class BeautifulBinaryString {
    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) {
        String binary;
        String convertToBeautiful;
        int minimumNumberSteep = 0;
        int N;
        
        N = console.nextInt();
        binary = console.next();
        
        convertToBeautiful = binary.replace("010", "b");
        minimumNumberSteep = convertToBeautiful.replaceAll("[01]","").length();
      
        System.out.println(minimumNumberSteep);
    }
}
