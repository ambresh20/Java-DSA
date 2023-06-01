import java.util.* ;

public class a_231_climbing_stair {

	// Using Recursion --> O(2^n)
	// public static int countWays(int n){  
	// 	if(n == 0){
	// 		return 1 ;
	// 	}
	// 	if(n < 0){
	// 		return 0 ;
	// 	}

	//    return countWays(n-1) + countWays(n-2) ; // 1 step + 2 step
	// }

	// Using Memoization --> O(n)
	public static int countWays(int n, int ways[]){  
		if(n == 0){
			return 1 ;
		}
		if(n < 0){
			return 0 ;
		}

		if(ways[n] != -1){
			return ways[n] ;
		}

	//    ways[n] = countWays(n-1, ways) + countWays(n-2 , ways) ;
	   ways[n] = ( countWays(n-1, ways) + countWays(n-2 , ways))%1000000007 ;
	   return ways[n] ; 
	}

	// Using Tabulation method
	public static int countWaysTab(int n){
		int dp[] = new int[n+1] ;
		dp[0] = 1 ;

		// tabulation loop
		for(int i=1; i<=n; i++){
			if(i == 1){
				dp[i] = dp[i-1] + 0 ;
			} else{
				dp[i] = dp[i-1] + dp[i-2] ;
			}
		}

		return dp[n] ;
	}

	public static void main(String[] args) {
		int N = 10 ;
		int ways[] = new int[N+1] ;
		Arrays.fill(ways, -1) ;
		System.out.println(countWays(N, ways));
		System.out.println(countWaysTab(N));

	}
}
