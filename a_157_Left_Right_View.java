import java.util.* ;

public class a_157_Left_Right_View {

    static class Node{
        int data ;
        Node left , right ;

        Node(int data ) {
            this.data = data ;
            this.left = null ;
            this.right = null ;
        }
    }

    // Iterative methods 
    // public static void rightView(Node root) {
    //     // Level Order Traversal 
    //     if(root == null){
    //         return ;
    //     }

    //     Queue<Node> q = new LinkedList<>() ;
    //     q.add(root) ;

    //     while(!q.isEmpty()) {
    //         int n = q.size() ;

    //         for(int i=0; i<n ; i++ ) {
    //             Node curr = q.remove() ;

    //             if(i == n-1){
    //                 System.out.print(curr.data + " ");
    //             }

    //             if(curr.left != null){
    //                 q.add(curr.left) ;
    //             }

    //             if(curr.right != null){
    //                 q.add(curr.right) ;
    //             }
    //         }
    //     }

    // }

    // public static void leftView(Node root) {
    //     // Level Order Traversal 
    //     if(root == null){
    //         return ;
    //     }

    //     Queue<Node> q = new LinkedList<>() ;
    //     q.add(root) ;

    //     while(!q.isEmpty()) {
    //         int n = q.size() ;

    //         for(int i=0; i<n ; i++ ) {
    //             Node curr = q.remove() ;

    //             if(i == 0){
    //                 System.out.print(curr.data + " ");
    //             }

    //             if(curr.left != null){
    //                 q.add(curr.left) ;
    //             }

    //             if(curr.right != null){
    //                 q.add(curr.right) ;
    //             }
    //         }
    //     }

    // }


    // Recursive Methods 
    public static ArrayList<Integer> rightSideView(Node root){
        ArrayList<Integer> ans = new ArrayList<>() ;
        rightView(root , ans , 0) ;

        // pre-order traversal 
        // 1. root  , 2.left , 3.right 

       return ans ;
    }

    public static void rightView(Node root , ArrayList<Integer> ans , int level){
        if(root == null){
            return ;
        }

        if(level == ans.size()){
            ans.add(root.data) ;
        }

        rightView(root.right, ans, level+1) ;
        rightView(root.left, ans, level+1) ;

    }


    public static ArrayList<Integer> leftSideView(Node root){
        ArrayList<Integer> ans = new ArrayList<>() ;
        leftView(root , ans , 0) ;

        // pre-order traversal 
        // 1. root  , 2.left , 3.right 

       return ans ;
    }

    public static void leftView(Node root , ArrayList<Integer> ans , int level){
        if(root == null){
            return ;
        }

        if(level == ans.size()){
            ans.add(root.data) ;
        }

        leftView(root.left, ans, level+1) ;
        leftView(root.right, ans, level+1) ;

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

        System.out.println(leftSideView(root))  ;
        
    }
}
