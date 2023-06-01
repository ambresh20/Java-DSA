// library of ArrayList --->
import java.util.ArrayList ;
public class a_109_ArrayList {
    public static void main(String[] args) {

        // Java Collection Framework 
        // ClassName objectName = new ClassName() ;
        ArrayList<Integer> list =  new ArrayList<>() ;
        // ArrayList<String> list2 = new ArrayList<>() ;    
      
        // Operation of ArrayList 
        // Add Operation 
        list.add(5);   // --> O(1)
        list.add(6) ;
        list.add(7);
        list.add(8) ;
        list.add(9) ;
        list.add(10) ;
        System.out.println(list);

        // list.add(1,100) ;  // O(n)
        // System.out.println(list);

        // Get Operation   // --> O(1)
        // int element = list.get(4);
        // System.out.println(element);

        // Delete or remove Operation 
        // list.remove(3) ;
        // System.out.println(list);

        // Set Operation 
        // list.set(1,100) ;
        // System.out.println(list);

        //  Contain Operation 
        // System.out.println(list.contains(88));
        // System.out.println(list.contains(7));

        System.out.println(list.size() );

        // Prints ArrayList 
        for(int i=0; i<list.size() ; i++){
            System.out.print( list.get(i) +" ");
        }
    }
}
