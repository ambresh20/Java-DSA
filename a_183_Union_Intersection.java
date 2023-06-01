import java.util.*;

public class a_183_Union_Intersection {
    public static void main(String[] args) {
 
        // count distinct element 
        // int arr[] = {4,3, 2, 5, 6, 7, 3, 4, 2, 1 } ;
        // HashSet<Integer> set = new HashSet<>() ;
        // for(int i=0; i<arr.length ; i++){
        //     set.add(arr[i]) ;
        // }
        // System.out.println("Ans = " +  set.size()  );

        int arr1[] = {7, 3, 9 } ;
        int arr2[] = {6, 3, 9,2,9,4} ;
        HashSet<Integer> set = new HashSet<>() ;

        // Union 
        for(int i=0; i<arr1.length ; i++){
            set.add(arr1[i]) ;
        }
        for(int i=0; i<arr2.length ; i++){
            set.add(arr2[i]) ;
        }

        System.out.println("union = " + set.size());
        for(Integer key : set){
            System.out.print(key + " ");
        }
        System.out.println();
        System.out.println();


        // Intersection of set 
        set.clear(); 

        for(int i=0; i<arr1.length ; i++){
            set.add(arr1[i]) ;
        }

        int count = 0 ;
        for(int i=0; i<arr2.length; i++){
            if(set.contains(arr2[i])){
                count++ ;
                set.remove(arr2[i]) ;
                System.out.print(arr2[i] +" ");

            }
        }

        System.out.println();
        System.out.println("Intersection = " + count);



    }
}
