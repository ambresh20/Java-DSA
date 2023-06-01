import java.util.*;

public class a_194_Group_Anagram {

    // method 1 using hashmap
    public static ArrayList<ArrayList<String>> groupAnagram(String arr[]) {

        HashMap<String, ArrayList<String>> map = new HashMap<>() ;
        for(String str : arr ){
            char ch[] = str.toCharArray()  ;
            Arrays.sort(ch) ;
            String key = String.valueOf(ch)  ;

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>() ) ;
            }
             map.get(key).add(str) ;
        }

        return new ArrayList<>(map.values()) ;
    }



    public static void main(String[] args) {
        String arr[] = {"eat", "tea", "tan", "ate", "nat", "bat", "ambresh" } ;

        
        
    }
}
