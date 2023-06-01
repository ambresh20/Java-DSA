// Minumum time required to rot all oranges.
// Resources -> https://takeuforward.org/data-structure/rotten-oranges/

import java.util.* ;

public class a_210_rotten_oranges {

    static class Pair {
        int row;
        int col;
        int tm;
        Pair(int _row, int _col, int _tm) {
          this.row = _row;
          this.col = _col;
          this.tm = _tm;
        }
      }

    public static int orangesRotting(int[][] grid) {
        int n = grid.length ;
        int m = grid[0].length ;

        Queue<Pair> q = new LinkedList<>() ;
        int[][] vist = new int[n][m] ;
        int cntFresh = 0;
    
        for (int i=0; i<n; i++) {
          for (int j=0; j<m; j++) {
            // if cell contains rotten orange
            if (grid[i][j] == 2) {
              q.add(new Pair(i, j, 0));
              // mark as visited (rotten) in visited array
              vist[i][j] = 2;
            }
            // if not rotten
            else {
              vist[i][j] = 0;
            }
    
            // count fresh oranges
            if (grid[i][j] == 1) cntFresh++;
          }
        }
    
        int tm = 0;
        // delta row and delta column
        int drow[] = {-1, 0, +1, 0};
        int dcol[] = {0, 1, 0, -1}; 
        int cnt = 0;
    
        // until the queue becomes empty
        while (!q.isEmpty()) {
          int r = q.peek().row;
          int c = q.peek().col;
          int t = q.peek().tm;
          tm = Math.max(tm, t);
          q.remove();
          // exactly 4 neighbours
          for (int i = 0; i < 4; i++) {
            int nrow = r + drow[i];
            int ncol = c + dcol[i];
            // check for valid coordinates and 
            // then for unvisited fresh orange
            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m &&
              vist[nrow][ncol] == 0 && grid[nrow][ncol] == 1) {
              // push in queue with timer increased
              q.add(new Pair(nrow, ncol, t + 1));
              // mark as rotten
              vist[nrow][ncol] = 2;
              cnt++;
            }
          }
        }
    
        // if all oranges are not rotten
        if (cnt != cntFresh) return -1;

        return tm;
      }

      //*****/ 2nd appoaches *****
public static int orangesRotting2(int[][] grid) {
      Queue<Pair> queue = new LinkedList<>();
       
      int n = grid.length;
      int m = grid[0].length;
      
      int vis[][] = new int[n][m];
      
      for(int i = 0; i<n; i++){
          for(int j = 0; j<m; j++){
              if(grid[i][j] == 2){
                  queue.add(new Pair(i,j,0));
                  vis[i][j] = 2;
              }
              else{
                  vis[i][j] = 0;
              }
          }
      }
      int t = 0;
      int delRow [] = {-1,+0,+1,+0};
      int delCol [] = {+0,+1,+0,-1};
      
      while(!queue.isEmpty()){
          int ro = queue.peek().row;
          int co = queue.peek().col;
          int tm = queue.peek().tm;
          queue.remove();
          t = Math.max(tm,t);

          for(int i = 0; i<4; i++){
              int nRow = ro + delRow[i];
              int nCol = co + delCol[i];
              
            if(nRow >= 0 && nRow < n && nCol >= 0 && nCol < m && 
              vis[nRow][nCol] != 2 && grid[nRow][nCol] == 1){
                  vis[nRow][nCol] = 2;
                  queue.add(new Pair(nRow,nCol,tm+1));
              }
          }    
          
      }
      
      for(int i = 0; i<n; i++){
          for(int j = 0; j<m; j++){
              if (grid[i][j] == 1 && vis[i][j] != 2){
                  return -1;
              }
          }
      }
      
      return t;
    }

    public static void main(String[] args) {

        int[][] grid =  {{0,1,2},{0,1,2},{2,1,1}};

        System.out.println(orangesRotting(grid));
  

    }
}
