package DataStructures.LinkedList;

/*
    Problem: Print the Elements of a Linked List 
    
    Input Format:
        The void Print(Node* head) method takes the head node of a linked list as 
        a parameter.
        Each struct Node has a data field (which stores integer data) and a next
        field (which points to the next element in the list).
    
    Output Format:
        Print the integer data for each element of the linked list to stdout/console 
        (e.g.: using printf, cout, etc.). There should be one element per line.
    
    
    @Author Chris M. Perez
    @Date   4/10/2017
*/

public class PrintTheElementsOfALinkedList {
    public static void main(String[] args) {
        
    }
    
    //This is a "method-only" submission. 
    public static void Print(Node node){
        while(node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }
}

class Node{
    int data;
    Node next;
}
