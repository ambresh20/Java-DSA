
public class a_209_numbers_of_islands {

     // Function to find the number of islands.
     public static int numIslands(char[][] grid) {
        int n = grid.length ;
        int m = grid[0].length ;
        boolean vist[][] = new boolean[n][m] ;
        
        int count = 0 ;
        
        for(int i=0; i<n ; i++){
            for(int j=0; j<m ; j++){
                if(grid[i][j] == '1' && vist[i][j] == false){
                    count ++ ;
                    dfs(grid, i, j, vist) ;
                }
            }
        }
        
      return count ;  
    }
    
    public static void dfs(char[][] grid, int i, int j, boolean vist[][]) {
        
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length ||
            grid[i][j] == '0' || vist[i][j] == true){
                return ;
            }
            
      vist[i][j] = true ;
      
      dfs(grid, i-1, j-1, vist) ;
      dfs(grid, i-1, j, vist) ;
      dfs(grid, i-1, j+1, vist) ;
      dfs(grid, i, j+1, vist) ;
      dfs(grid, i+1, j+1, vist) ;
      dfs(grid, i+1, j, vist) ;
      dfs(grid, i+1, j-1, vist) ;
      dfs(grid, i, j-1, vist) ;
      
        
    }

    public static void main(String[] args) {
        char grid[][] = {{0,1},{1,0},{1,1},{1,0}} ;

        System.out.println(numIslands(grid));

    }
}
