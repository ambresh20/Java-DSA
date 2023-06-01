
public class a_119_MergeSortLL {

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


    private Node findMid (Node head){
        Node slow = head ;
        Node fast = head.next ;

        while(fast != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
        }

        return slow ;    // mid 
    }

    private Node merge (Node head1 , Node head2){
        Node mergedLL = new Node(-1) ;   // create a dummy Node 
        Node temp = mergedLL ;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1 ;
                head1 = head1.next ;
                temp = temp.next ;
            }
            else{
                temp.next = head2 ;
                head2 = head2.next ;
                temp = temp.next ;
            }
        }
        
        while(head1 != null){
            temp.next = head1 ;
            head1 = head1.next ;
            temp = temp.next ;
        }

        while(head2 != null){
            temp.next = head2 ;
            head2 = head2.next ;
            temp = temp.next ;
        }

        return mergedLL.next ;
    }

    public Node mergeSort(Node head){
        if(head == null || head.next == null){   // base case 
            return head ;
        }

        // find mid poinst 
        Node mid = findMid(head) ;

        // left & right part LL 
        Node rightHead = mid.next ;
        mid.next = null ;
        Node leftNode = mergeSort(head) ;
        Node rightNode = mergeSort(rightHead) ;

        // merge 
        return merge(leftNode, rightNode) ; 
    }
    public static void main(String[] args) {
        a_119_MergeSortLL ll = new a_119_MergeSortLL() ;
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);

        ll.print();
        // ll.head = ll.mergeSort(ll.head) ;
        ll.print();

    }
}
