import java.util.* ;

public class a_175_Sliding_Window_Maximun {

    static class Pair implements Comparable<Pair> {
        int val ;
        int idx ;

        public Pair(int val, int idx ){
            this.val = val ;
            this.idx = idx ;
        }

        @Override
        public int compareTo(Pair p2){
            // ascending order 
            // return this.val - p2.val ;
             
            // descending order 
           return p2.val - this.val ;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 } ;
        int k = 3 ;   // Window size 
        int ans[] = new int[arr.length-k+1]  ;   // n-k+1 

        PriorityQueue<Pair> pq = new PriorityQueue<>() ;

        // First Window 
        for(int i=0; i<k ; i++){
            pq.add(new Pair(arr[i], i) )  ;
        }

        ans[0] = pq.peek().val ;

        for(int i=k ; i<arr.length ; i++){
            while(pq.size() > 0  &&  pq.peek().idx <= (i-k) ) {
                pq.remove() ;
            }

            pq.add(new Pair(arr[i], i) )  ;
            ans[i-k+1] = pq.peek().val ;
        }

        // print result or answer 
        for(int i=0; i<ans.length ; i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();

        
    }
}
