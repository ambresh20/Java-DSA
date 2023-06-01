import java.util.* ;
public class a_136_Queue_JCF {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>() ;
        // Queue<Character> c = new ArrayDeque<>() ;
        // Queue<String> s = new PriorityQueue<>() ;  

        q.add(1); 
        q.add(2); 
        q.add(3);

        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
    

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove() ;
        }
    
         
        
    }
}
