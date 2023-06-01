import java.util.*;

public class a_69_twoDarray {

    static boolean search(int matrix[][] ,int keys){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){

                if(matrix[i][j] == keys){
                    System.out.println("key are found at index = (" + i +"," + j +")");
                    return true;
                }
            }
        }
        System.out.println("keya are not founds");
        return false;
    }

    static void largest(int matrix[][]){
        int larges = Integer.MIN_VALUE ;
        int smallest = Integer.MAX_VALUE ;

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(larges < matrix[i][j]){
                    larges = matrix[i][j];
                }

                if(smallest > matrix[i][j]){
                    smallest = matrix[i][j] ;
                }

            }
        }
        System.out.println("Largest values : "+ larges);
        System.out.println("Smallest values :"+ smallest);

    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length;      // n = 2;
        int m = matrix[0].length;  // m = 3; 

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){                  // for rows .
            for(int j=0; j<m; j++){              // for columns.
                matrix[i][j] = sc.nextInt() ;
            }
        }

        for(int i=0; i<n; i++){                  
            for(int j=0; j<m; j++){    
                System.out.print(matrix[i][j] +" ")   ;       
            }
            System.out.println();
        }

        // search(matrix, 11);
        largest(matrix );


        sc.close();
    }
}
