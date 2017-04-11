package Implementation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


/*
    Problem: Sock Merchant
    
    John's clothing store has a pile of n loose socks where each sock i is labeled with 
    an integer,ci, denoting its color. He wants to sell as many socks as possible, but 
    his customers will only buy them in matching pairs. Two socks, i and , j are a single 
    matching pair if ci = cj.
    
    Given n and the color of each sock, how many pairs of socks can John sell?

    Input Format:
        The first line contains an integer, n , denoting the number of socks. 
        The second line contains  space-separated integers describing the 
        respective values of c0 , c1 , c2 , ... , cn-1 .

    Constraints:
        1 <= n <= 100
        1 <= ci <= 100
    
    Output Format:
        Print the total number of matching pairs of socks that John can sell.
        
    @Author Chris M. Perez
    @Date   4/10/2017
*/


public class SockMerchant {
    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int element;
        int N;
        int pairs = 0;
        
        N = console.nextInt();
        
        for(int i=0;i<N;i++){
            element = console.nextInt();
            list.add(element);
        }
        
        sort(list);
        
        for(int j=0;j<list.size()-1;j++){
            if(Pairs(list, j)){
                pairs++;
                j++;
            } 
        }
        System.out.println(pairs);
    }
    
    public static Boolean Pairs(List<Integer> list,int i){
        return list.get(i).equals(list.get(i+1));
    }
    
    public static List<Integer> sort(List<Integer> list){
        Collections.sort(list);
        return list;
    }
}
