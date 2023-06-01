public class a_74_ps {
    static int countNumber(int matrix[][] , int num){
        int count = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(num == matrix[i][j]){
                    count++;
                }
            }
        }
        System.out.println(count);
        return count ;
    }

    static int sumRow(int num[][]){
        int sum = 0;
        // 1st method
        // for(int i=1; i<=1; i++){
        //     for(int j=0; j<num[0].length ; j++){
        //         sum += num[i][j] ;
        //     }
        // }
        
        // ***** second method *****
        int row = 1;
        for(int j=0; j<num[0].length; j++){
            sum += num[row][j] ;
        }
        System.out.println(sum);
        return sum;
    }

    // static void transpose(int matrix[][]){
    //     for(int i=0 ; i<matrix.length; i++){
    //         for(int j=0; j<matrix[0].length; j++){
                
    //         }
    //     }
    // }
    static void print(int nums[][]){
        for(int i=0 ; i<nums.length; i++){
            for(int j=0; j<nums[0].length; j++){
               System.out.print(nums[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // int matrix[][] = { {4,7,8}, {8,8,7} } ;
        // int num = 7;
        // Question 1 :Print the number of 7’s that are inthe 2d array.
        // Example :Input - int[][] array = { {4,7,8},{8,8,7} };
        // Output - 2
        // countNumber(matrix, num);

        // Question 2 :Print out the sum of the numbers in the second row of the
        // Example :Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        // Output - 18
        // int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        // sumRow(nums);

        // Question 3 :Write a program to Find Transpose of a Matrix.

        int row =2, col =3;
        int nums[][] = { {1,4,9},{11,4,3} };
        print(nums);
        System.out.println();
        int transpose[][] = new int[col][row];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                transpose[j][i] = nums[i][j];
            }
        }

        print(transpose);



    }
}
