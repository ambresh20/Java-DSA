public class a_98_recursion_PS {
    public static void allOccurence(int arr[], int key , int i){
        if(i == arr.length){    // base case
            // System.out.println("-1");
            return ;
        }

        if( arr[i] == key ){
            System.out.print(i +" ");
        }

        allOccurence(arr, key, i+1);
    }


    
    static String str[] = { "zero", "one","two","three","four","five","six","seven","eight", "nine" } ;

    public static void printDigit(int num ){
        if(num == 0 ){
            return;
        }

        int lastDigit = num % 10; 
        printDigit( num/10 ); 
        System.out.print( str[lastDigit] +" ");

    }

    public static int stringLength(String str){

        if( str.length()==0 ){
            return 0;
        }

       int length = stringLength(str.substring(1) ) ;

        return length+1 ;
    }

    public static void main(String[] args) {
        // Question 1 : For a given integer array of size N.You have to find all the occurrences (indices) of a given element (Key) and print them .Use a recursive function to solve this problem ?

        // int arr[] = { 3,2,4,5,6,2,7,2,2 };
        // int key = 2;
        // allOccurence(arr , key, 0 ) ;
        // System.out.println();

        
        // Question 2 : You are given a number (eg -  2019), convert it into a String
        // printDigit(2019);


        // Question 3 : Write a program to find Length of a String using Recursion.
        String str = "ambresh" ;
        System.out.println( stringLength(str) ) ;


    }
}
