
public class a_116_LinkedList {

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

    // Methods
    public void addFirst(int data){
        // step 1 : Create new Node 
        Node newNode = new Node(data) ;
        size++ ;
        if(head == null){
            head = tail = newNode ;
            return ;
        }
        // step 2 : newNode next = head
        newNode.next = head ;  // link

        // step 3 : head = newNode
         head = newNode ;
    }

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

    public void addMiddle(int idx , int data){
        if(idx == 0){
            addFirst(data);
            return ;
        }
        Node newNode = new Node(data) ;  // Creations
        size++ ;
        Node temp = head ;
        int i=0; 
        while(i < idx-1){
            temp = temp.next ;
            i++ ;
        }

        // i = idx -1 ; and temp -> prev
        newNode.next = temp.next ;   // Links creations
        temp.next = newNode ;
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE ;
        }
        else if(size == 1){
            int val = head.data ;
            head = tail = null ;
            size = 0 ;
            return val ;
        }
        int val = head.data ;
        head = head.next ;
        size -- ;

      return val ;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE ;
        }
        else if(size == 1){
            int val = head.data ;
            head = tail = null ;
            size = 0;
            return val ;
        }
        
        // Prev : i = size - 2  ;
        Node prev = head ;
        for(int i=0; i<size-2 ; i++){
            prev = prev.next ;
        }

        int val = prev.next.data ;   // tail.data 
        prev.next = null ;
        tail = prev ;
        size -- ;
        
        return val ;
    }

    public int itrSearch(int key){ 
        Node temp = head ;
        int i=0;

        while(temp != null){
            if(temp.data == key){   // Key are founds
                return i ;
            }

            i++ ;
            temp = temp.next ;
        }
        
        return -1 ;       // key are not founds
    }

    public int helper(Node head , int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key) ;
        if(idx == -1){
            return -1 ;
        }
       
        return idx+1 ;
    }

    public int recSearch(int key){
        return helper(head ,key) ;
    }
    
    public static void main(String[] args) {
        a_116_LinkedList ll = new a_116_LinkedList() ;
        ll.addFirst(2);; 
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5) ;
        ll.addMiddle(2, 3);

        System.out.println(ll.recSearch(4));
        System.out.println(ll.recSearch(10));
        
        
    }
}
