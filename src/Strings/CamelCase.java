package Strings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

/*
    Problem: CamelCase
    
        Alice wrote a sequence of words in CamelCase as a string of letters, s, 
        having the following properties:

        It is a concatenation of one or more words consisting of English letters.
        All letters in the first word are lowercase.
        For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
        Given s, print the number of words in s on a new line.

        Input Format:
            A single line containing string s.
        
        Output Input:
            Print the number of words in string s.
        
    @Author Chris M. Perez
    @Date   4/4/2017
*/


public class CamelCase {
    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) {
        String characters[];
        String input;
        List<String> list = new ArrayList<>();
        
        input = console.nextLine();
        characters = input.split("(?=\\p{Upper})");
        
        list = Arrays.asList(characters);
        System.out.println(list.size());
    }
}