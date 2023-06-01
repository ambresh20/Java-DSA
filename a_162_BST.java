// insert 
// search
// delete 
public class a_162_BST {

    static class Node{
        int data ;
        Node left;
        Node right ;

        Node(int data){
            this.data = data ;
        }
    }

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val) ;
          return root ;
        }

        if(root.data > val){
            // Left subtree 
            root.left = insert(root.left, val) ;
        }
        else{
            // Right subtree 
            root.right = insert(root.right, val)  ;
        }

      return root ;
    }

    public static void inOrder(Node root){
        if(root == null){
            return ;
        }

        inOrder(root.left);
        System.out.print(root.data +" ");
        inOrder(root.right);

    }

    public static boolean search(Node root , int key){
        if(root == null){
            return false ;
        }

        if(root.data == key){
            return true ;
        }

        if(root.data > key){
            return search(root.left, key) ;
        }
        else{
            return search(root.right, key) ;
        }

    }

    public static Node delete(Node root, int val){
        if(root == null){
            return root ;
        }

        if(root.data > val){
             root.left = delete(root.left, val) ;
        }
        else if(root.data < val){
            root.right = delete(root.right, val) ;
        }
        else{    // voila    (val find which are deleting)

            // Case : 1  Leaf Node (no child)
            if(root.left == null && root.right == null){
                return null ;
            }

            // Case : 2  single Child 
            if(root.left == null){
                return root.right  ;
            }
            else if(root.right == null){
                return root.left ;
            }

            // Case : 3  Two Children 
            // int IS = findInorderSuccessor(root.right) ;
            // root.data = IS ;
            // root.right = delete(root.right, IS) ;

            // int data = findInorderSuccessor(root.right, root.data);
            // root.data = data;
            // root.right = delete(root.right, data);
            // return root;

        }

        return root ;
    }

    public static Node findInorderSuccessor(Node root ){
        while(root.left != null){
            root = root.left  ;
        }

        return root ;
    }

    public static int inOrderSuccessor(Node root,int data){
        if(root.left == null){
           return root.data; 
        } 
        else {
            return inOrderSuccessor(root.left, data);
        }
    }
    
    public static Node deleteNode(Node root, int val) {
        if(root == null) {
            return null;
        }
        
        if(root.data == val){
            if(root.left == null && root.right == null){
                return null;
            }
            else if(root.left == null ){
                return root.right;
            }
            else if( root.right == null){
                return root.left;
            }
            else{
                int data = inOrderSuccessor(root.right, root.data);
                root.data = data;
                root.right = deleteNode(root.right, data);
                return root;
            }
            
        }
        else if(root.data > val){
            root.left = deleteNode(root.left,val);
        } 
        
        else if(root.data < val){
            root.right = deleteNode(root.right,val);
        }
        
       return root;
    }


    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11 , 14 } ;

        Node root = null ;
      for(int i=0; i<values.length ; i++){
          root = insert(root, values[i]) ;
       }

      inOrder(root) ;
      System.out.println();


    }
}
