public class a_73_search_in_sortedMatrix {
    static boolean stairSearch(int matrix[][], int key){
        
        int row =0 , col = matrix[0].length - 1 ; 
        while(row < matrix.length && col >=0){
            if(key == matrix[row][col]){
                System.out.println("Key are found at index = (" + row + "," + col +")" );
                return true;
            }
            else if(key < matrix[row][col]){
                col-- ;
            }
            else{
                row ++; 
            }
        }
        System.out.println("Key are not exit :)");
        return false ;
        

        // Second method of stair Search :
        // int row = matrix.length -1;
        // int col = 0 ;
        // while(row >= 0 && col < matrix[0].length ){
        //     if(key == matrix[row][col]){
        //         System.out.println("Key are found at index = (" + row +","+ col +")" );
        //        return true;
        //     }
        //     else if(key < matrix[row][col]){
        //         row -- ;
        //     }
        //     else{
        //         col ++ ;
        //     }
        // }
        // System.out.println("Key are not exit :)");
        // return false;

    }
    public static void main(String[] args) {
        int matrix[][] = { {10,20,30,40},{15,25,35,45}, {27,29,37,48},{32,33,39,50}};
        int key = 500;
        stairSearch(matrix , key);
    }
}
