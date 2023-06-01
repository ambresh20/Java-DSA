public class a_72_diagonal_sum {
    public static int diagonalSum(int matrix[][]){
        int sum = 0 ;
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         if(i == j){   // primary diagonal 
        //             sum += matrix[i][j] ;
        //         }
        //         else if(i+j == matrix.length -1){ // secondary diagonal 
        //             sum += matrix[i][j];
        //         }
        //     }
        // }

        for(int i=0; i<matrix.length; i++){
            // pd
            sum += matrix[i][i];
            // sd
            if(i != matrix.length -1 -i)
            sum += matrix[i][matrix.length-1-i];
            
        }

        return sum ;
    }


    static void unit(int arr[]){
        for(int i=0; i<arr.length ; i++){
            for(int j=i+1; j<arr.length -1; j++){
                if(arr[i] != arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
   
    }
    public static void main(String[] args) {
        // int matrix[][] = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        // int matrix[][] = { {1,1,1},{1,1,1 },{1,1,1}} ;
        // int sumOfDiagonal = diagonalSum(matrix);
        // System.out.println(sumOfDiagonal);

        int arr[] = {2,4,6,4,2};
        unit(arr);
        
    }
}
