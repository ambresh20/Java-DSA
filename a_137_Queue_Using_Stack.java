import java.util.*;

public class a_137_Queue_Using_Stack {

    // First Methods add -> O(n)   peek or remove -> O(1)

    // static class Queue{
    //     static Stack<Integer> s1 = new Stack<>() ;
    //     static Stack<Integer> s2 = new Stack<>() ;

    //     public static boolean isEmpty(){
    //         return s1.isEmpty() ;
    //     }

    //     // add
    //     public static void add(int data ){
    //         while(!s1.isEmpty() ) {
    //             s2.push( s1.pop() ) ;
    //         }

    //         s1.push(data) ;

    //         while( !s2.isEmpty() ) {
    //             s1.push( s2.pop() ) ;
    //         }

    //     }

    //     // remove
    //     public static int remove(){
    //         if(isEmpty()){
    //             System.out.println("Queue is Empty");
    //           return -1 ;  
    //         }

    //         return s1.pop() ;
    //     }

    //     // peek
    //     public static int peek(){
    //         if(isEmpty()){
    //             System.out.println("Queue is Empty");
    //           return -1 ;  
    //         }

    //         return s1.peek() ;
    //     }


    // Second methods  remove or peek -> O(n)   add -> O(1)
    static class Queue{
        static Stack<Integer> s1 = new Stack<>() ;
        static Stack<Integer> s2 = new Stack<>() ;

        public static boolean isEmpty(){
            return s1.isEmpty() ;
        }

        // add
        public static void add(int data ){

            s1.push(data) ;
        }

        // remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
              return -1 ;  
            }

            while( !s1.isEmpty() ) {
                s2.push(s1.pop()) ;
            }

            int val = s2.pop() ;

            while(!s2.isEmpty()) {
                s1.push(s2.pop()) ;
            }

            return val ;
        }

        // peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
              return -1 ;  
            }

            while( !s1.isEmpty() ) {
                s2.push(s1.pop()) ;
            }

            int val = s2.peek() ;

            while(!s2.isEmpty()) {
                s1.push(s2.pop()) ;
            }

            return val ;
        }


    }
    public static void main(String[] args) {
        Queue q = new Queue() ;

        q.add(1);
        q.add(2);
        q.add(3);
        
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove() ;
        }

       
    
        
    }
}
