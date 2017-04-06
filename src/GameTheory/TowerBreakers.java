package GameTheory;
import java.util.Scanner;


/*
    Problem: Tower Breakers
    
    Input Format:
        The first line contains a single integer,T, denoting the number of test cases. 
        Each of the T subsequent lines describes a test case in the form of 2 space-separated 
        integers describing the respective values for N and M.

    Constraints:
        1 <= T <= 100
        1 <= N,M <= 10 exp(6)

    Output Format:
        For each test case, print a single integer (i.e., either 1 or 2) denoting the 
        winner on a new line.
    
        
    @Author Chris M. Perez
    @Date   4/6/2017
*/

public class TowerBreakers {
    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) {
        int T;
        int n , m;
        
        T = console.nextInt();
        
        for(int i=0;i<T;i++){
            n = console.nextInt();
            m = console.nextInt();
            
            theWinnerIs(n, m);
        }
    }
    
    public static void theWinnerIs(int n,int m){
        if(m == 1) { System.out.println("2"); }
        else if(n % 2 == 0) { System.out.println("2"); }
        else { System.out.println("1"); }
    }
}