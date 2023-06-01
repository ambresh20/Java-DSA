import java.util.* ;

public class a_162_Range_Print {

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

    public static void pringInRange(Node root, int k1, int k2){
        if(root == null){
            return ;
        }

        if(root.data <= k2  && root.data >= k1){
            pringInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            pringInRange(root.right, k1, k2);
        }
        else if(root.data < k1){
            pringInRange(root.right, k1, k2);
        }
        else{
            pringInRange(root.left, k1, k2);
        }

    }

    public static void printPath(ArrayList<Integer> path){
        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i) + "->");
        }
        System.out.println("Null");
    }

    public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return ;
        }

        path.add(root.data) ;

        if(root.left == null && root.right == null){
            printPath( path ) ;
        }

        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path); 

        path.remove(path.size()-1) ;
    }

    public static void main(String[] args) {
        
       int values[] = {8, 5, 3, 6, 10, 11, 14 } ;
       
        Node root = null ;
      for(int i=0; i<values.length ; i++){
          root = insert(root, values[i]) ;
       }

      inOrder(root) ;
      System.out.println();

      printRoot2Leaf(root, new ArrayList<>() );



    }
}
