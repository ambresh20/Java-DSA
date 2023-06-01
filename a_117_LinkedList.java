public class a_117_LinkedList {

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

    public void deleteNthfromEnd(int n){
        // Calculating size 
        int sz = 0;
        Node temp = head ;
        while(temp != null){
            temp = temp.next ;
            sz++ ; 
        }

        if(sz == n){
            head = head.next ;   // remove first 
            return ;
        }

        // sz - n ;
        int i = 1; 
        int iToFind = sz - n ;         // Finding deletes index 
        Node prev = head  ;
        while(i < iToFind){
            prev = prev.next ;
            i++ ;
        }

        prev.next = prev.next.next ;
        return ;
    }
    public static void main(String[] args) {
        a_117_LinkedList ll = new a_117_LinkedList() ;
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.print();
        ll.deleteNthfromEnd(5);
        ll.print();
 

    }
}
