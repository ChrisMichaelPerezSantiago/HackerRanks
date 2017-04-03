package DataStructures.Heap;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;


/*  
    Problem: QHEAP1
 
    This question is designed to help you get a better understanding of basic heap operations. 
    You will be given queries of 3 types:

        "1 v " - Add an element  to the heap.
        "2 v " - Delete the element  from the heap.
        "3 v " - Print the minimum of all the elements in the heap.
   
    Input Format:
        The first line contains the number of queries, Q. 
        Each of the next Q lines contains a single query of any one 
        of the 3 above mentioned types.

    @Author Chris M. Perez
    @Date   4/3/2017
*/

public class QHEAP1 {
    static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        int queries;
        int typeOfQuery = 0;
        int elementsToAdd = 0;
        
        queries = console.nextInt();
        qheap1(queue, queries, elementsToAdd, typeOfQuery);
       
    }
    
    public static void qheap1(Queue<Integer> queue,int queries,int elementsToAdd,int typeOfQuery){
        while(queries > 0){
            typeOfQuery = console.nextInt();
            
            switch(typeOfQuery){
                case 1:
                    elementsToAdd = console.nextInt();
                    queue.add(elementsToAdd);
                    break;
                case 2:
                    elementsToAdd = console.nextInt();
                    queue.remove(elementsToAdd);
                    break;
                case 3:
                    System.out.println(queue.peek());
                    break;
            }
            queries--;
        }
    }
}
