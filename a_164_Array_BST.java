
public class a_164_Array_BST {

    static class Node{
        int data ;
        Node left;
        Node right ;

        Node(int data){
            this.data = data ;
            this.left = this.right = null ;
        }
    }

    public static void preorder(Node root){
        if(root == null){
            return  ;
        }

        System.out.print(root.data +" ");
        preorder(root.left); 
        preorder(root.right); 
    }

    public static Node createBST(int arr[], int si, int end){
        if(si > end ){
            return null ;
        }

        int mid = (si+end )/2 ;
        Node root = new Node(arr[mid])  ;
        root.left = createBST(arr, si, mid-1) ;
        root.right = createBST(arr, mid+1, end)  ;

        return root ;
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 6, 8, 10, 11, 12} ;
        /*
         *                    8
         *                  /   \
         *                 5     11
         *               /  \   /  \
         *              3    6 10   12
         *             Expected BST
         */

         Node root = createBST(arr, 0, arr.length-1)  ;
         preorder(root);
        
    }
}
