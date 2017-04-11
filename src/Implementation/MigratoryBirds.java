package Implementation;
import java.util.Scanner;

/*
    Problem: Migratory Birds
        
    Input Format:
        The first line contains an integer denoting (the number of birds).The 
        second line contains n space-separated integers describing the respective
        type numbers of each bird in the flock.
        
    Output Format:
        Print the type number of the most common bird; if two or more types of 
        birds are equally common, choose the type with the smallest ID number.

    @Author Chris M. Perez
    @Date 4/10/2017
*/

public class MigratoryBirds {
    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) {
        int array[];
        long index = 0L;
        long max = Long.MIN_VALUE;
        int N;
        
        N = console.nextInt();
        array = new int[6];
        
        for(int i=0;i<N;i++){
            array[console.nextInt()]++;
        }
        
        for(int j=1;j<=5;j++){
            if(array[j] > max){
               max = array[j];
               index = j;
            }
        }
        System.out.println(index);   
    } 
}