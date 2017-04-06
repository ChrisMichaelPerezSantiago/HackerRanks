package GameTheory;
import java.util.Scanner;

/*  
    Problem: Game Of Stones
    
    Input Format:
        The first line contains an integer, T , denoting the number of test cases. 
        Each of the T subsequent lines contains a single integer, n , denoting the number
        of stones in a test case.
        
    Constraints:
        1 <= T <= 100
        1 <= n <= 100

    Output Format:
        On a new line for each test case, print First if the first player is the winner; 
        otherwise, print Second.
    

    @Author Chris M. Perez
    @Date   4/4/2017
*/


public class GamesOfStones {
    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) {
        int T;
        int N;
        
        T = console.nextInt();
        
        for(int i=0;i<T;i++){
            N = console.nextInt();
            theWinneriIs(N);
        }
    }
    
    public static void theWinneriIs(int N){
        if(N % 7 > 1){
            System.out.println("First");
        }else{ System.out.println("Second"); }
    }
}