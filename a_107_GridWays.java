public class a_107_GridWays {

    public static int gridWays(int i, int j,int n, int m){
      // base case 
        if(i ==n-1 && j==m-1 ){  // condition for last index (target)
            return 1;
        }
        else if(i == n || j==m){
            return 0;
        }

        int w1 = gridWays(i+1, j, n, m) ;     // Down choices
        int w2 = gridWays(i, j+1, n, m);     // right choices 


      return w1 + w2 ;
    }

    public static int fact(int n){
      if(n==1){
        return 1; 
      }
      return n * fact(n-1) ;
    }

    public static int optimizeGridWays(int n, int m){
      int a = fact(n+m-2) ;
      int b = fact(n-1);
      int c = fact(m-1);

      return a/(b*c) ;
    }
    public static void main(String[] args) {
        int n = 3; 
        int m = 3; 

        // System.out.println(gridWays(0,0, n, m));
        System.out.println(optimizeGridWays(n, m));


    }
}
