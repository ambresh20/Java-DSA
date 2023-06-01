// import java.util.*;
// import java.util.Arrays;
// import java.util.Collections;

public class a_67_inbuildSorting {
    static void print(Integer arr[]) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Integer arr[] = {5,4,1,3,2} ;
        
            // System.out.println("Before sorting : ");
            // print(arr);
            // System.out.println("After sorting : ");
            // Inbuild sorting functions 
            // Arrays.sort(arr);
            // Arrays.sort(arr,0,4);

            // For Descending orders
            //  Arrays.sort(arr,Collections.reverseOrder());
            // Arrays.sort(arr,0,4,Collections.reverseOrder());

            // print(arr);

            int arr[] = {-11,-3,-5,-7,-9};
            int max = Integer.MIN_VALUE ;
            for(int i=0; i<arr.length; i++){
                if(max < arr[i] ){
                    max = arr[i];
                }
            }
            System.out.println(max);



    }
}
