public class a_193_Longest_Word_All_Prefix {

    static class Node{
        Node children[] = new Node[26]  ; // at max children 26 ('a' - 'z')
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

    public static String ans = "" ;
    public static void longestWord(Node root, StringBuilder temp){
        if(root == null){
            return ;
        }

        for(int i=0; i<26; i++){
            if(root.children[i] != null  &&  root.children[i].eow == true){
              char ch = (char)(i+'a')  ;
              temp.append(ch) ;
                if(temp.length() > ans.length() ){
                    ans = temp.toString() ;
                } 
                longestWord(root.children[i], temp) ;
                temp.deleteCharAt(temp.length()-1) ;    // Backtracking 
            }
        }
    }

    public static void main(String[] args) {
        // String word[] = {"a", "banana", "app", "appl", "ap", "apply", "apple" } ;
        String word[] = {"ju","k","ja","jp","jpp","u","jpa","ja","j","jps","p"}  ;

        for(int i=0; i<word.length; i++){
            insert(word[i]) ;
        }

        longestWord(root, new StringBuilder(""));
        System.out.println(ans);
        
    }
}
