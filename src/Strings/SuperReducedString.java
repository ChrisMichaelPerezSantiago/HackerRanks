package Strings;
import java.util.Scanner;


/*
    Problem: Super Reduced String

        Steve has a string,s, consisting of n lowercase English alphabetic letters. 
        In one operation, he can delete any pair of adjacent letters with same value. 
        For example, string "aabcc" would become either "aab" or "bcc" after operation 1.

        Steve wants to reduce s as much as possible. To do this, he will repeat the above 
        operation as many times as it can be performed. Help Steve out by finding and printing
        s 's non-reducible form!
        
        Note: If the final string is empty, print Empty String .

        Input Format:
            A single string, s.
       
        Output Format:
            If the final string is empty, print Empty String; otherwise, print the final 
            non-reducible string.
        
    @Author Chris M. Perez
    @Date   4/4/2017
*/


public class SuperReducedString {
    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) {
        StringBuilder characters = new StringBuilder(console.nextLine());
        
        
        for(int i=0;i<characters.length()-1;i++){
            if(characters.charAt(i) == characters.charAt(i+1)){
                characters.delete(i,(i+2));
                i=-1;
            }
        }
        if(characters.length() == 0){
            System.out.println("Empty String");
        }else{
            System.out.println(characters);
        }
    }
}