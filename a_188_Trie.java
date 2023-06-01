// import java.util.* ;

public class a_188_Trie {

    static class Node{
        Node children[] = new Node[26]  ;   // at max children 26 ('a' - 'z')
        boolean eow = false ;

        public Node(){
            for(int i=0; i<26; i++){
                children[i] = null ;
            }
        }
    }

    public static Node root = new Node() ;

    public static void insert(String word ){  // O(L
        
        Node curr = root ;
        for(int level=0 ; level<word.length(); level++){
            int idx = word.charAt(level) - 'a' ;  // ch - 'a'
            if(curr.children[idx] == null){
                curr.children[idx] = new Node() ;
            }

            curr = curr.children[idx] ;
        }

        curr.eow = true ;
    }

    public static boolean search(String key){

        Node curr = root ;
        for(int level=0 ; level<key.length(); level++){
            int idx = key.charAt(level) - 'a' ;  // ch - 'a'
            if(curr.children[idx] == null){
                return false ;
            }

            curr = curr.children[idx] ;
        }

        return curr.eow == true ;
    }
 
    // Recursive function to delete a key from given Trie
    public static Node remove(Node root, String key, int depth){
        if (root == null)
            return null;
 
        // If last character of key is being processed
        if (depth == key.length()) {
 
            // This node is no more end of word after removal of given key
            if (root.eow)
                root.eow = false;
 
            // If given is not prefix of any other word
            if (isEmpty()) {
                root = null;
            }
 
            return root;
        }
 
        // If not last character, recur for the child obtained using ASCII value
        int index = key.charAt(depth) - 'a' ;
        root.children[index] = remove(root.children[index], key, depth + 1);
 
     // If root does not have any child (its only child got deleted), and it is not end of another word.
        if (isEmpty() && root.eow == false){
            root = null;
        }
 
      return root;
    }

    public static boolean isEmpty(){
        for (int i = 0; i < 26; i++)
            if (root.children[i] != null)
                return false;

        return true;
    }
 
    public static void main(String[] args) {
        String word[] = { "the", "a", "there", "their", "any", "thee" } ;
        for(int i=0; i<word.length ; i++){
            insert(word[i]) ;
        }

        System.out.println(search("the"));
        remove(root, "the", 0)  ;
        System.out.println(search("the"));

    }
}
