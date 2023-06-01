import java.util.*;

public class a_182_HashSet {
    public static void main(String[] args) {
        
        HashSet<Integer> set = new HashSet<>() ;

        set.add(100) ;
        set.add(3) ;
        set.add(5) ;
        set.add(1) ;
        set.add(2) ;
        // set.add(null) ;
        set.add(5) ;

        // System.out.println(set);
        // System.out.println(set.contains(3));
        // System.out.println(set.contains(4));

        // set.remove(1) ;
        // System.out.println(set.remove(2));
        // System.out.println(set.remove(1));


        HashSet<String> cities = new HashSet<>() ;
        cities.add("bhopal") ;
        cities.add("singrouli") ;
        cities.add("jabalpur") ;
        cities.add("indore") ;

        // Iterator it = cities.iterator() ;
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        for(String city : cities){
            System.out.println(city);
        }

    }
}
