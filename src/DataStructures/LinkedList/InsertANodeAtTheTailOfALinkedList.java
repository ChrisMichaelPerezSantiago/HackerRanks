
package DataStructures.LinkedList;

/*  
    Problem: Insert a Node at the Tail of a Linked List 

    Input Format: 
        You have to complete the Node* Insert(Node* head, int data) method. 
        It takes two arguments: the head of the linked list and the integer 
        to insert. You should not read any input from the stdin/console.

    Output Format 
        Insert the new node at the tail and just return the head of the updated 
        linked list. Do not print anything to stdout/console.

    
    @Author Chris M. Perez
    @Date   4/10/2017
*/

public class InsertANodeAtTheTailOfALinkedList {
    public static void main(String[] args) {
        
    }
    
    //This is a "method-only" submission. 
    public static Node Insert(Node head,int data) {
        Node node_one = new Node();
        node_one.data = data;
        node_one.next = null;

        if(head == null){
            head = node_one;
            return head;
        }else{
            Node node_two = head;
            
            while(node_two.next != null){
                node_two = node_two.next;
            }
            node_two.next = node_one;
            return head;
        }
    }
}


