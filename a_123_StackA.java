// Stack implementation using ArrayList ;
import java.util.ArrayList ;

public class a_123_StackA {
    static class Stack {
    //    static ArrayList<Integer> list = new ArrayList<>() ;

    //     public static boolean isEmpty (){
    //         return list.size() == 0 ;
    //     }

    //    // PUSH 
    //    public static void push(int data){
    //         list.add(data) ;
    //    } 

    //    // POP
    //    public static int pop(){
    //     if(isEmpty()){
    //         return -1 ;
    //     }
       
    //     int top = list.get(list.size()-1) ;
    //     list.remove(list.size()-1 ) ;
    //     return top ;
    //    }

    //    // PEEK 
    //    public static int peek(){
    //     if(isEmpty()){
    //         return -1 ;
    //     }
    //     return list.get(list.size()-1) ;
    //    }


    // ***** Array Implementations ****** 
    static int arr[] = new int[1000] ;
       static int top = -1 ;

        public static boolean isEmpty (){
            return top < 0 ;
        }

       // PUSH 
       public static void push(int data){
        if(top == arr.length-1){
            return ;
        }
           top ++ ;
            arr[top] = data ;
       } 

       // POP
       public static int pop(){
        if(isEmpty()){
            return -1 ;
        }
       
        int val = arr[top] ;
        top-- ;
        return val ;
       }

    //    // PEEK 
       public static int peek(){
        if(isEmpty()){
            return -1 ;
        }
        return arr[top] ;
       }

    }
    public static void main(String[] args) {
        Stack s = new Stack() ;
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop() ;
        }

        
    }
}
