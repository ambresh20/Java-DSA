public class a_108_sudoku2 {  

    public static boolean isSafe(int sudoku[][], int row , int col , int digit){
	       // column's
           for(int i=0; i<9; i++){
            if(sudoku[i][col] == digit){
                return false ;
            }
        }

        // row's
        for(int j=0; j<9; j++){
            if(sudoku[row][j] == digit){
                return false ;
            }
        }

        // Grid's
        int sr = (row/3) * 3 ;
        int sc = (col/3) * 3 ;
        // 3x3 grid 
        for(int i=sr ; i<sr+3 ; i++){
            for(int j=sc; j<sc+3; j++){
                if(sudoku[i][j] == digit){
                    return false ;
                }
            }
        }

        return true; 
    }

	public static boolean solveSudoku(int[][] board,  int n){
		int row = -1;
		int col = -1;
		boolean isEmpty = true;
		for (int i = 0; i < n; i++){
			for (int j = 0; j < n; j++){
				if (board[i][j] == 0){
					row = i;
					col = j;

					isEmpty = false;
					break;
				}
			}
			if (!isEmpty) {
				break;
			}
		}

		if (isEmpty){
			return true;
		}

		for (int digit = 1; digit <= n; digit++){
			if (isSafe(board, row, col, digit)){
				board[row][col] = digit;
				if (solveSudoku(board, n)){
					return true;
				}
				else{
					board[row][col] = 0;
				}
			}
		}
		return false;
	}

    public static void print(int sudoku[][] , int N){
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

	public static void main(String args[]){
		int[][] board = new int[][] {
			{ 3, 0, 6, 5, 0, 8, 4, 0, 0 },
			{ 5, 2, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 8, 7, 0, 0, 0, 0, 3, 1 },
			{ 0, 0, 3, 0, 1, 0, 0, 8, 0 },
			{ 9, 0, 0, 8, 6, 3, 0, 0, 5 },
			{ 0, 5, 0, 0, 9, 0, 6, 0, 0 },
			{ 1, 3, 0, 0, 0, 0, 2, 5, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 7, 4 },
			{ 0, 0, 5, 2, 0, 6, 3, 0, 0 }
		}  ;
		int N = board.length;

		if (solveSudoku(board, N)){
			print(board, N);
		}
		else {
			System.out.println("No solution");
		}
	}
}

