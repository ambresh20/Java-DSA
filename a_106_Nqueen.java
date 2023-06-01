public class a_106_Nqueen {
    public static boolean isSafe(char chess[][], int row, int col){
        // verticals up 
        for(int i = row-1 ; i>=0 ; i--){
            if(chess[i][col] == 'Q'){
                return false ;
            }
        }

        // left diagonal 
        for(int i=row-1, j=col-1 ; i>=0 && j>=0; i--, j--){
            if(chess[i][j] == 'Q'){
                return false;
            }
        }

        // right diagonal
        for(int i=row-1, j=col+1 ; i>=0 && j<chess.length; i--, j++){
            if(chess[i][j] == 'Q'){
                return false;
            }
    }
    return true ;
}
    public static void nQueen(char chess[][], int row){
        // base case
        if(row == chess.length) {
            // printchess(chess) ;
            count ++ ;
            return ;
        }
        
        // colums loop 
        for(int j=0; j<chess.length; j++){
            if(isSafe(chess,row,j) ){
                chess[row][j] = 'Q' ;        // queen sit on position  
                nQueen(chess, row+1);       // function calls 
                chess[row][j] = 'x' ;       // backtracking step 
            }
        }
   
    }

    public static void printchess(char chess[][]){
        System.out.println("------chess board------");
        
        for(int i=0; i<chess.length; i++){
            for(int j=0; j<chess.length ; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

    }

    static int count = 0 ;
    public static void main(String[] args) {
        int n = 3 ;
        char chess[][] = new char[n][n] ;

        // initialize
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                chess[i][j]  = 'x' ;
            }
        }

        nQueen(chess, 0);
        System.out.println("Total ways of = " + count );

    }
}
