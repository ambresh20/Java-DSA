public class a_234_unbounded_Knapsack {

	public static int unboundedKnapsack(int val[], int wt[], int W){
		int n = val.length ;
		int dp[][] = new int[n+1][W+1] ;
	
		for(int i=0; i<dp.length; i++){  // 0th col  = initialize or base case
			dp[i][0] = 0 ;
		}
	
		for(int j=0; j<dp[0].length; j++){  //0th row =  initialize or base case
			dp[0][j] = 0 ;
		}
	
		for(int i=1; i<n+1; i++){
			for(int j=1; j<W+1; j++){
				// int v = val[i-1] ;  // ith item values
				// int w = wt[i-1] ;   // ith item weight
	
				// if(w <= j){  // valid
				// 	int incProfit = v + dp[i][j-w] ;  // include
				// 	int excProfit = dp[i-1][j] ;       // exclude
				// 	dp[i][j] = Math.max(incProfit, excProfit) ;
				// }
				// else {   // invalid
				// 	int excProfit = dp[i-1][j] ;
				// 	dp[i][j] = excProfit ;
				// }

				if(wt[i-1] <= j){ // valid
					dp[i][j] = Math.max(val[i-1]+dp[i][j-wt[i-1]], dp[i-1][j] ) ;
				}
				else{
					dp[i][j] = dp[i-1][j] ;
				}
			}
		}
		print(dp);

		return dp[n][W] ;
   }
	
	public static void print(int dp[][]){
		for(int i=0; i<dp.length; i++){
			for(int j=0; j<dp[0].length; j++){
				System.out.print(dp[i][j] +" ");
			}
			System.out.println();
		}
		System.out.println();
	}

		public static void main(String[] args) {
			int val[] = { 15, 14, 10, 45, 30 } ;
			int wt[] = { 2, 5, 1, 3, 4 } ;
			int W = 7 ;  // total capacity

			System.out.println(unboundedKnapsack(val, wt, W));
		
	}
}
