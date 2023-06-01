import java.util.* ;
public class a_144_PS {

    static void generatePrintBinary(int n){
        Queue<String> q = new LinkedList<String>();
         q.add("1");
         
        while (n-- > 0) {
            String s1 = q.peek();
            q.remove();
            System.out.print(s1 +"  ");
            String s2 = s1;
            q.add(s1 + "0");
            q.add(s2 + "1");
        }

    }

    public static int minCost(int arr[], int n){

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.add(arr[i]) ;
        }

        int result = 0 ;
        while (pq.size() > 1) {      
            int first = pq.poll();
            int second = pq.poll();
            result += first + second;
            pq.add(first + second);
        }

       return result;
    }
    
    public static void reverse(Queue<Integer> q , int k) {
        Stack<Integer> s = new Stack<>() ;
        int n = q.size() ;

        for(int i=0; i<k; i++){
            s.push(q.remove()) ;
        }

        while(!s.isEmpty()) {
            q.add(s.pop()) ;
        }

        for(int i=k; i<n; i++){
            q.add(q.remove()) ;
        }

    }

    public static void printMax(int arr[], int n, int k){
        Deque<Integer> Qq = new LinkedList<Integer>();
        int i;

        for ( i = 0; i < k; ++i) {
            while (!Qq.isEmpty() && arr[i] >= arr[Qq.peekLast()])
            Qq.removeLast();
            Qq.addLast(i);
        }

        for (; i < n; ++i) {
            System.out.print(arr[Qq.peek()] + " ");
            while ((!Qq.isEmpty()) && Qq.peek() <=i - k)
            Qq.removeFirst();
            while ((!Qq.isEmpty()) && arr[i] >= arr[Qq.peekLast()])
            Qq.removeLast();
            Qq.addLast(i);
        }

        System.out.print(arr[Qq.peek()]);
    }

    
    
    public static void main(String[] args){
        // Q.1 print binary number 
        // int n = 10;
        // generatePrintBinary(n);

        // Q.2 minimum cost of ropes
        // int len[] = { 4, 3, 2, 6 };
        // int size = len.length;
        // System.out.println("Total cost for connecting"+ " ropes is "+ minCost(len,size));

        // Q.4 Reversing the first K elements of a Queue
        // Queue<Integer> q = new LinkedList<>() ;
        // q.add(10) ; q.add(20) ;  q.add(30) ;  q.add(40) ;  q.add(50) ;  q.add(60) ; q.add(70) ; q.add(80) ; q.add(90) ; q.add(100) ;

        // Q.5 Maximum of all subarrays of size k
        int arr[] = {1, 2, 3, 1, 4 , 5, 2, 3 , 6 } ;
        int N = arr.length ;
        int k = 3 ;
        printMax(arr, N, k);




    }
}
   
        
        

    

