import java.util.* ;

public class a_125_AddBottom {
    public static void pushAtBottom(Stack<Integer> s , int data){
        if( s.isEmpty() ){  // base case 
            s.push(data) ;
            return ;
        }

        int top = s.pop() ;
        pushAtBottom(s, data);     // recursion method 
        s.push(top) ;            // backtracks method 
        
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>() ;
        s.push(1) ;
        s.push(2) ;
        s.push(3);

        pushAtBottom(s, 4) ;
        while( !s.isEmpty()){
            System.out.println(s.pop());
        }

    }
}
