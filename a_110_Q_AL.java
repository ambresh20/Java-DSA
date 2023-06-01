import java.util.ArrayList ;
import java.util.Collections;

public class a_110_Q_AL {
    public static void swap( ArrayList<Integer> list , int idx1, int idx2){  
        int temp = list.get(idx1) ;
        list.set(idx1, list.get(idx2) ) ;
        list.set(idx2, temp) ;

    }
    public static void main(String[] args) {
        ArrayList<Integer> list  = new ArrayList<>() ;
        list.add(2) ;
        list.add(5) ;
        list.add(9) ;
        list.add(6) ;
        list.add(8) ;
        list.add(1) ;

        // Print Reverse order of list 
        // for(int i = list.size()-1; i>=0 ; i--){
        //     System.out.print(list.get(i) + " ");
        // }
        // System.out.println();

        // Find maximum element 
        // int max = Integer.MIN_VALUE ;
        // for(int i=0; i<list.size() ; i++){
        //     // if(max < list.get(i) ){
        //     //     max = list.get(i) ;
        //     // }
        //     max = Math.max(max , list.get(i)) ;
        // }
        // System.out.println(max);

        // Swaping
    //   System.out.println(list);
    //   int idx1 = 1 ;
    //   int idx2 = 3 ;
    //   swap(list, idx1, idx2);
    //   System.out.println(list);


    System.out.println(list);
    // Sorting 
    Collections.sort(list) ;    // ascending order Sorting 
    System.out.println(list);

    // Descending order Sorting 
    Collections.sort(list,Collections.reverseOrder() ) ;
    System.out.println(list);


    }
}
