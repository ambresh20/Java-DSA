import java.util.*;

public class a_158_KLevel {

    static class Node{
        int data ;
        Node left , right ;

        Node(int data ) {
            this.data = data ;
            this.left = null ;
            this.right = null ;
        }
    }

    // ********** Recursive method *********** 
    // public static void KLevel(Node root , int level, int K){
    //     if(root == null){
    //         return ;
    //     }

    //     if( level == K ) {
    //         System.out.print(root.data + " ");
    //       return ;
    //     }

    //     KLevel(root.left, level+1, K);
    //     KLevel(root.right, level+1, K);
    // }

    // ********** Iterative method *********   
//     public static int sumOfNodesAtNthLevel(Node root, int k){
//     if (root == null)
//         return 0;
 
//     Queue<Node> q = new LinkedList<>();
 
//     q.add(root);
//     int level = 0;
//     int sum = 0;
 
//     int flag = 0;
   
//     while (!q.isEmpty()){
//         int size = q.size();
 
//         while (size-- >0){
//             Node curr = q.remove();
 
//             if (level == k) {
//                 flag = 1;
//                 sum += curr.data;
//             }
//             else {
//                 if (curr.left != null)
//                     q.add(curr.left);
 
//                 if (curr.right != null)
//                     q.add(curr.right);
//             }
//         }
 
//         level++;
//         if (flag == 1)
//             break;
//     }

//     return sum;
// }
    
public static void sumOfNodesAtNthLevel(Node root, int k){
    if (root == null)
        return ;
 
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    int level = 1; 
    int flag = 0;
   
    while (!q.isEmpty()){
        int size = q.size();
 
        while (size-- >0){
            Node curr = q.remove();
 
            if (level == k) {
                flag = 1;
                System.out.print(curr.data + " ");
                // sum += curr.data;
            }
            else {
                if (curr.left != null)
                    q.add(curr.left);
 
                if (curr.right != null)
                    q.add(curr.right);
            }
        }
 
        level++;
        if (flag == 1)
            break;
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

        sumOfNodesAtNthLevel(root, 3);       

    }
}
