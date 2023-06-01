import java.util.*;
public class a_55_largest_arr {
    
    public static int largest(int numbers[]){
        int largest = Integer.MIN_VALUE ;   // - ifinite
        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static int smallest(int numbers[]){
        int smallest = Integer.MAX_VALUE ;
        for(int i=0 ; i<numbers.length; i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,6,3,5};
        System.out.println("Smallest value is : " + smallest(numbers));
        System.out.println("Largest value is : " + largest(numbers));
        
    }
}
