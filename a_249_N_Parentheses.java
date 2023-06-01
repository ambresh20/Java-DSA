public class a_249_N_Parentheses {

	// n pairs of brackets --> no of ways = ?
	public static int countWays(int n){
		int dp[] = new int[n+1] ; 
		dp[0] = 1 ;  // ' '
		dp[1] = 1 ; //  ()

		for(int i=2; i<n+1; i++){
			// i pairs -->count ways --> Ci
			for(int j=0; j<i; j++){
				int inside = dp[j] ;
				int outside = dp[i-j-1] ;
				dp[i] += inside * outside ;  // Ci += Cj * Ci-j-1

			}
		}

		return dp[n] ;
	}

	// Second method
	public static int parentheses(int n){
		int dp[] = new int[n+1] ;
		dp[0] = 1 ;
		dp[1] = 1 ;

		for(int i=2; i<n+1; i++){
			int inside = 0 ;
			int outside = i-1  ;

			while(outside >= 0){
				dp[i] += dp[inside] * dp[outside] ;
				
				inside ++ ;
				outside -- ;
			}

		}

		return dp[n] ;
	}

	public static void main(String[] args) {
		System.out.println(countWays(15));
		System.out.println(parentheses(15));

	}
}
