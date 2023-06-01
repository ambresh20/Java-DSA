// Iterative Traversal Pre-Order , In-Order , Post-Order .
import java.util.* ;

public class a_159_Iterative_Traversal {

    static class Node{
        int data ;
        Node left , right ;

        Node(int data ) {
            this.data = data ;
            this.left = null ;
            this.right = null ;
        }
    }

    public static void preOrder(Node root ){
        if(root == null){
            return ;
        }

        Stack<Node> s = new Stack<>() ;
        s.push(root) ;

        while(!s.isEmpty()) {
            Node curr = s.pop() ;
        
                System.out.print(curr.data + " ");

                if(curr.right != null){
                    s.push(curr.right) ;
                }

                if(curr.left != null){
                    s.push(curr.left) ;
                }

        }
    }

    public static void inOrder(Node root){
        if(root == null){
            return ;
        }

        Stack<Node> s = new Stack<>() ;
        Node curr = root ;

        while(true) {
            if(curr != null){
                s.push(curr) ;
                curr = curr.left ;
            }
            else{
                if(s.isEmpty()){
                    break ;
                }
                curr = s.pop() ;
                System.out.print(curr.data +" ");
                curr = curr.right ;
            }
        }

    }

    public static void postOrder(Node root){
        ArrayList<Integer> ans = new ArrayList<>() ;
        if(root == null){
            return ;
        }

        Stack<Node> s = new Stack<>() ;
        s.push(root);
    
    while(!s.isEmpty()){
        
        Node curr = s.pop();
        ans.add(0,curr.data);
        
        if(curr.left != null){
            s.push(curr.left);
        }
        
        if(curr.right != null){
            s.push(curr.right);
        }
    }

    for(int i=0; i<ans.size(); i++){
        System.out.print(ans.get(i) +" ");
    }

 }
    public static void main(String[] args) {
          /* 
                        1
                      /   \
                     2     3
                    / \   / \ 
                   4   5 6   7
         
         */

         Node root = new Node(1) ;
         root.left = new Node(2) ;
         root.right = new Node(3) ;
         root.left.left = new Node(4) ;
         root.left.right = new Node(5) ;
         root.right.left = new Node(6) ;
         root.right.right = new Node(7) ;

         postOrder(root);

    }
}
