// import java.util.Arrays;

public class a_252_MCM { // Matrix Chain Multiplications

	// Using Recursion
	public static int mcm(int arr[], int i, int j){
		if(i == j){
			return 0 ;  // Single matrix case  --> cost = 0
		}

		int ans = Integer.MAX_VALUE ;  // minimum cost 
		for(int k=i; k<=j-1; k++){
			int cost1 = mcm(arr, i, k) ;  //Ai...Ak => arr[i-1] x arr[k]
			int cost2 = mcm(arr, k+1, j) ; //Ak+1...Aj => arr[k] x arr[j]
			int cost3 = arr[i-1] * arr[k] * arr[j] ;

			int finalCost = cost1 + cost2 + cost3 ;
			ans = Math.min(ans, finalCost) ;
		}

		return ans ;  // minCost
	}

	// Using Memoization
	public static int mcmMem(int arr[], int i, int j, int dp[][]){
		if(i == j){
			return 0 ;  // Single matrix case  --> cost = 0
		}

		if(dp[i][j] != -1){
			return dp[i][j] ;
		}

		int ans = Integer.MAX_VALUE ;  // minimum cost 
		for(int k=i; k<=j-1; k++){
			int cost1 = mcmMem(arr, i, k, dp) ;  //Ai...Ak => arr[i-1] x arr[k]
			int cost2 = mcmMem(arr, k+1, j, dp) ; //Ak+1...Aj => arr[k] x arr[j]
			int cost3 = arr[i-1] * arr[k] * arr[j] ;

			int finalCost = cost1 + cost2 + cost3 ;
			ans = Math.min(ans, finalCost) ;
		}

		return dp[i][j] = ans ;  // minCost
	}

	// Using Tabulation
	public static int mcmTab(int arr[]){
		// create a table 
		int n = arr.length ;
		int dp[][] = new int[n][n] ;
		// (i,j) --> Ai...Aj ka multiplications = (Ai to Aj)

		// initialazation
		for(int i=0; i<n; i++){
			dp[i][i] = 0 ;
		}

		// Bottom up 
		for(int len=2; len<=n-1; len++){
			for(int i=1; i<=n-len; i++){
				int j = i + len - 1 ;  // col
				dp[i][j] = Integer.MAX_VALUE ;

				// cuts
				for(int k=i; k<=j-1; k++){
					int cost1 = dp[i][k] ;  // (i, k)
					int cost2 = dp[k+1][j] ;  // (k+1, j)
					int cost3 = arr[i-1] * arr[k] * arr[j] ;
					dp[i][j] = Math.min(dp[i][j], cost1+cost2+cost3 ) ; // min(ans, finalCost)
				}
			}
		}

		print(dp) ;
		return dp[1][n-1] ;
	}

	public static void print(int dp[][]){
		for(int i=0; i<dp.length; i++){
			for(int j=0; j<dp[0].length ; j++){
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// int arr[] = {1, 2, 3, 4, 3 } ;
		// int n = arr.length ;

		// int dp[][] = new int[n][n] ;
		// for(int i=0; i<n; i++){
		// 	Arrays.fill(dp[i], -1) ;  // row wise fill
		// }

		// System.out.println(mcmMem(arr, 1, n-1, dp));

		int arr[] = {1, 2, 3, 4, 3 } ;
		System.out.println(mcmTab(arr)) ;


	}
}
