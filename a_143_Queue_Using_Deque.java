import java.util.* ;
public class a_143_Queue_Using_Deque {

    static class Queue {
        Deque<Integer> dq = new LinkedList<>() ;

        public void add(int data) {
            dq.addLast(data);
        }

        public int remove() {
           return dq.removeFirst() ;
        }

        public int peek(){
            return dq.getFirst() ;
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue() ;
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("Peek = "+ q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
       

    }
    
}
