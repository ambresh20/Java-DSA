
public class a_120_ZigZag {

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

    public void addFirst(int data){
        // step 1 : Create new Node 
        Node newNode = new Node(data) ;
        if(head == null){
            head = tail = newNode ;
            return ;
        }
        // step 2 : newNode next = head
        newNode.next = head ;  // link

        // step 3 : head = newNode
         head = newNode ;
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

    public  void zigZag(){
        // find mid
        Node slow = head ;
        Node fast = head.next ; 

        while(fast !=  null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
        }
        Node mid = slow ;

        // 2nd half reverse 
        Node curr = mid.next ; 
        mid.next = null ;
        Node prev = null ;
        Node next ;

        while(curr != null){
            next = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = next ;
        }

        Node leftH = head ;      // 1st half head 
        Node rightH = prev ;      // 2nd half head 
        Node nextL , nextR ;

        // alternative merge 
        while(leftH != null && rightH != null){
            // ZigZag merge
            nextL = leftH.next ;
            leftH.next = rightH ;
            nextR = rightH.next ;
            rightH.next = nextL ;

            // updations 
            leftH = nextL ;
            rightH = nextR ;

        }
       


    }
    public static void main(String[] args) {
        a_120_ZigZag ll = new a_120_ZigZag() ;

        // ll.addFirst(6) ;
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.print();
        ll.zigZag();
        ll.print();

     }
}
