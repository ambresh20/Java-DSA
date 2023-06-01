import java.util.* ;

public class a_165_BST_Balanced_BST {

    static class Node{
        int data ;
        Node left;
        Node right ;

        Node(int data){
            this.data = data ;
            this.left = this.right = null ;
        }
    }

    public static void preOrder(Node root){
        if(root == null){
            return  ;
        }

        System.out.print(root.data +" ");
        preOrder(root.left); 
        preOrder(root.right); 
    }

    public static void getInorder(ArrayList<Integer> inorder, Node root){
        if(root == null){
            return  ;
        }

        getInorder(inorder, root.left);
        inorder.add(root.data) ;
        getInorder(inorder, root.right);

    }

    public static Node createBST(ArrayList<Integer> inorder, int si, int end){
        if(si > end ){
            return null ;
        }

        int mid = (si+end)/2  ;

        Node root = new Node(inorder.get(mid)) ;
        root.left = createBST(inorder, si, mid-1) ;
        root.right = createBST(inorder, mid+1, end) ;

      return root ;
    }

    public static Node balanceBST(Node root){
        // inorder sequence
        ArrayList<Integer> inorder = new ArrayList<>() ;
        getInorder(inorder, root) ;

        // sorted inorder -> balance BST 
        root = createBST(inorder, 0, inorder.size()-1) ; 

        return root ;
    }

    public static void main(String[] args) {

        Node root = new Node(8)  ;
        root.left = new Node(6) ;
        root.left.left = new Node(5) ;
        root.left.left.left = new Node(3) ;

        root.right = new Node(10)  ;
        root.right.right = new Node(11) ;
        root.right.right.right = new Node(12) ;

        root = balanceBST(root) ;
        preOrder(root) ;
    }
}
