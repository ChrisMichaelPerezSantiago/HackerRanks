package Strings;
import java.util.Scanner;


/*
    Problem: Pangrams

    Roy quiere mejorar su velocidad de escritura en máquina para concursos de programación.
    Su amigo le dijo que escribiera la oración "The quick brown fox jumps over the lazy dog" 
    repetidamente porque es un pangrama. (pangramas son oraciones construidas usando todas las 
    letras del alfabeto, por lo menos una vez.)Después de escribir la oración muchas veces, Roy 
    se aburrió. Entonces comenzó a buscar otros pangramas.Dada una oración s, dile a Roy si es un pangrama o no.

    Formato de Entrada:
        La Entrada consiste en una linea que contiene.

    Formato de Salida:
        Imprime una línea que contiene pangram si s es un pangrama, sino imprime not pangram.

    @Author Chris M. Perez
    @Date   4/8/2017
*/


public class Pangrams {
    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) {
        String sentence;
        
        sentence = console.nextLine();
        
        if(isPangrams(sentence)){
            System.out.println("pangram");
        }else{
            System.out.println("not pangram");
        }
    }
    
    public static Boolean isPangrams(String sentence){
        sentence = sentence.toUpperCase();
        int letters = 0;
        
        for(char i='A';i<='Z';i++){
            if(sentence.indexOf(i) >= 0){
                letters++;
            }
        }
        
        if(hasAllLetters(letters)){
            return true;
        }else return false;
    }
    
    public static Boolean hasAllLetters(int counter){
        return counter == 26;
    }
}
