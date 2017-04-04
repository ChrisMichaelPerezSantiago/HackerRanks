
package Strings;
import java.util.Scanner;


/*  
    Problem: Mars Exploration
    
        Letters in some of the SOS messages are altered by cosmic radiation during transmission.
        Given the signal received by Earth as a string, , determine how many letters of Sami's SOS 
        have been changed by radiation.

        Input Format:
            There is one line of input: a single string, .

        Note: As the original message is just SOS repeated n times, S's length will be a multiple of 3.
        
        Output Format:
        Print the number of letters in Sami's message that were altered by cosmic radiation.
   
    
    @Author Chris M. Perez
    @Date   4/4/2017
*/

public class MarsExploration {
    static Scanner console = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        String word;
        int count = 0;
        int result = 0;
        
        word = console.next().toUpperCase();
        
        for(int i=0;i<word.length();i+=3){
            result += check(word, i, count);
        }
        System.out.println(result);
    }
    
    public static int check(String word,int i,int counter){
        if(word.charAt(i)!='S')
            counter++;
        if(word.charAt(i+1)!='O')
            counter++;
        if(word.charAt(i+2)!='S')
            counter++;
        
        return counter;
    }
}
