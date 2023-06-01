import java.util.Stack;

public class a_126_reverse {

    public static String reverseString(String str ){
        Stack<Character> s = new Stack<>() ;
        int idx = 0 ; 

        while(idx < str.length() ) {
            s.push(str.charAt(idx)) ;
            idx++ ;
        } 

        StringBuilder result = new StringBuilder("") ;
        while(! s.isEmpty() ){
            char curr = s.pop() ;
            result.append(curr) ;
        }

      return result.toString() ;
    }

    public static void pushAtBottom(Stack<Integer> s , int data){
        if( s.isEmpty() ){  // base case 
            s.push(data) ;
            return ;
        }

        int top = s.pop() ;
        pushAtBottom(s, data);     // recursion method 
        s.push(top) ;            // backtracks method 
        
    }

    public static void reverseStack (Stack<Integer> s ){
        if(s.isEmpty()){
            return ;
        }

        int top = s.pop() ;
        reverseStack(s);               // recursion call methode
        pushAtBottom(s, top);          // back steps ;
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>() ;
        s.push(1) ;
        s.push(2) ;
        s.push(3) ;
        s.push(4) ;
        s.push(5) ;
        
        System.out.println(s);
        reverseStack(s);
        System.out.println(s);
    }
}

