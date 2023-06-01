public class a_118_Palidrome {
    
    public static class Node{
        int data ;
        Node next ;

        public Node(int data){
            this.data = data ;
            this.next = null ;
        }
    }

    public static Node head ;
    public static Node tail ;
    public static int size ; 


    public void addLast(int data){
        // step 1: create a node 
        Node newNode = new Node(data) ;
        size ++ ;
        if(head == null){
            head = tail = newNode ;
            return ;
        }
        // step 2: tail.next = newNode   
        tail.next = newNode ;  // link

        // step 3: tail = newNode 
          tail = newNode ;    
    }

    public void print(){
        if(head == null){
            System.out.println("Empty Linked List ");
            return ; 
        }

        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next ;
        }
        System.out.println("null");
    }

    public void reverse (){
        Node prev = null ;
        Node curr = tail = head ;
        Node next ;

        while(curr != null){
            next = curr.next ;
            curr.next = prev ;        // reverse steps
            prev = curr ;              // Updatation of  prev and curr variables 
            curr = next  ;
        }

        head = prev ;
    }

    public Node findMid (Node head){
        Node slow = head ;
        Node fast = head ;

        while(fast != null && fast.next != null){
            slow = slow.next ;          // +1
            fast = fast.next.next ;    // +2 
        }

        return slow ;   // slow is my mid point 
    }
    
    public boolean checkPalidrome() {
        if(head == null || head.next == null){   // base case 
            return true ;
        }

        // step 1 : find mid 
        Node mid = findMid(head) ;

        // step 2 : 2nd half reverse
        Node prev = null ;
        Node curr = mid ;
        Node next ;
        while(curr != null){
            next = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = next ;
        }

        Node right = prev ;    // right half head 
        Node left = head ;

        // step 3 : check left half & right half 
        while(right != null){
            if(left.data != right.data){
                return false ;
            }
            left = left.next;
            right = right.next ;
        }

        return true ;
    }

    public static boolean isCycle(){
        Node slow = head ;
        Node fast = head ;

        while(fast != null && fast.next != null){
            slow = slow.next ;   // +1 
            fast = fast.next.next ;   // +2 

            if(slow == fast ){
                return true ;      // Cycle exits 
            }
        }

        return false ;   // cycle does't exits
    }

    public static void removeCycle(){
        // detect cycle
        Node slow = head ;
        Node fast = head ;
        boolean cycle = false ;
        while(fast != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next ;

            if(slow == fast){
                cycle = true ;
                break ;
            }

        }
        if(cycle == false){
            return ;
        }

        // finding meeting point  
        slow = head ;
        Node prev = null ;
        while(slow != fast ){
            prev = fast ;
            slow = slow.next ;     // +1 
            fast = fast.next ;    // +1
        }

        //  remove cycle -> last.next = null 
        prev.next = null ;
    }
    public static void main(String[] args) {
        // a_118_Palidrome ll = new a_118_Palidrome() ;

        head = new Node(1);
        head.next = new Node(2);
        Node temp = new Node(3) ;
        head.next.next = temp ;
        head.next.next.next = new Node(4);
        head.next.next.next.next = temp ;

        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
       
        
 

    }
}

