public class a_236_minNum_coins {

	public static int minCoins(int coins[], int N, int sum) { 
	 
        int dp[][] = new int[N+1][sum+1] ;  // 1. create table
        // i --> no of coins ,  j--> sum
        
      // first row and column initialized
        for(int i=1; i<N+1; i++){  // if sum = 0 , min coin is 0
            dp[i][0] = 0 ;
        }
        for(int j=0; j<sum+1; j++){
            dp[0][j] = Integer.MAX_VALUE-1 ;   // inifinits
        }
        dp[0][0] = 0 ;
        
      //second row initilization
        for(int j=1; j<sum+1; j++){
            if(j%coins[0] == 0){
                dp[1][j] = j/coins[0] ;
            }
            else{
                dp[1][j] = Integer.MAX_VALUE-1 ;
            }
        }
        
        // Main code for other blocks or tabulation code
        for(int i=2; i<N+1; i++){
            for(int j=1; j<sum+1; j++){
                if(coins[i-1] <= j){ // valid
                    dp[i][j] = Math.min( dp[i][j-coins[i-1]] + 1 , dp[i-1][j] ) ;
                } 
                else{  // invalid
                    dp[i][j] = dp[i-1][j] ;
                }
            }
        }
        
        if(dp[N][sum] == Integer.MAX_VALUE-1){
            return -1 ;
        }
      
       return dp[N][sum] ; 
	} 

	public static void main(String[] args) {
		int coins[] = {25, 10, 5} ;
		int N = 3 ;
		int sum = 30 ;
		System.out.println(minCoins(coins, N, sum));

	}
}
