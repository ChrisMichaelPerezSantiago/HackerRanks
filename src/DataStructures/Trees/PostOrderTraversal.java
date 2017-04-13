package DataStructures.Trees;

/*
    Problem: Postorder Traversal

    Complete the postOrder  function in your editor below, which has 1 parameter: 
    a pointer to the root of a binary tree. It must print the values in the tree's 
    preorder traversal as a single line of space-separated values.

    Input Format:
        Our hidden tester code passes the root node of a binary tree to your 
        postOrder function.

    Output Format:
        Print the tree's preorder traversal as a single line of space-separated values.

    @Author Chris M. Perez
    @Date   4/13/2017
*/

public class PostOrderTraversal {
    public static void main(String[] args) {
        
    }
    
    //This is a "method-only" submission. 
    public static void postOrder(Node node){
        while(node != null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data + " ");
            return;
        }
    }
}

class Node{
    int data;
    Node left;
    Node right;
}
