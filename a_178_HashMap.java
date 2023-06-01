import java.util.*; 

public class a_178_HashMap {
    public static void main(String[] args) {
        // Create 
        HashMap<String, Integer> map = new HashMap<>() ;

        // Insert - O(1)
        // map.put("India", 100) ;
        // map.put("China", 150) ;
        // map.put("USA", 50) ;
        // map.put("Nepal", 5) ;

        // Get - O(1) 
        // map.get("India") ;
        // System.out.println(map.get("USA"));
        
        // ContainsKey - O(1)
        // System.out.println(map.containsKey("India"));
        // System.out.println(map.containsKey("Singrouli"));

        // Remove - O(1) 
        // System.out.println(map.remove("China"));
        // System.out.println(map);

        // Size 
        // System.out.println(map.size());

        // // Clear
        // map.clear() ;

        // // Empty
        // System.out.println(map.isEmpty());

        
        map.put("India", 100) ;
        map.put("China", 150) ;
        map.put("USA", 50) ;
        map.put("Nepal", 5) ;

        // Iterative 
        Set<String> keys = map.keySet() ;
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key = "+k +",  value = "+ map.get(k));
        }

    }
}
