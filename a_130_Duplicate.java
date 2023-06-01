import java.util.Stack;

public class a_130_Duplicate {

    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>() ;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i) ;

            // closing bracates
        //     if(ch == ')' ) {
        //         int count = 0;
        //         while(s.peek() != '(' ) {
        //             s.pop() ;
        //             count++ ;
        //         }
        //         if(count < 1 ) {
        //             return true ;     // duplicates
        //         }
        //         else{
        //             s.pop() ;       //  opening pair
        //         }
        //     }
        //     else{
        //         // opening or operands or operators
        //         s.push(ch) ;
        //     }

        // closing bractracs 
        if(ch == ')' ) {
            if(s.peek() == '(' ) {
                return true; 
            }
            else{
                while(s.peek() != '(' ) {
                    s.pop() ;
                } 
                 s.pop() ;   // for opening 
            }
        }
        else{   // opening or operator or operands 
            s.push(ch)  ;
        }

    }


      return false ;
    }
    public static void main(String[] args) {
        // Valid string 
        String str = "((a+b))" ;    // true 
        String str2 = "(a+b)" ;     // false 

        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str2));


    }
}
