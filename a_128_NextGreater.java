import java.util.* ;
public class a_128_NextGreater {
    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3 } ;
        int nextGreater[] = new int[arr.length] ;
        Stack<Integer> s = new Stack<>() ;

        // for(int i=arr.length-1 ; i>=0 ; i-- ){    // arr backword travers
            for(int i=0; i<arr.length; i++){  

            // 1: while
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop() ;
            }

            // 2: if-else
            if(s.isEmpty()){
                nextGreater[i] = -1 ;
            }
            else{
                nextGreater[i] = arr[s.peek()] ;
            }

            // 3: push in s
            s.push(i) ; 
        }

        
        for(int i=0; i<nextGreater.length ; i++){
            System.out.print(nextGreater[i] +" ");
        }
        System.out.println();
    }
}
