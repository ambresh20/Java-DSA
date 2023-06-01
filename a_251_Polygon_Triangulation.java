public class a_251_Polygon_Triangulation {

	public static int waysOfTriangulation(int n){ // here n is no of slide

		n = n-2 ;    // n-2 slide are equal to Cnth (catalan's number)
		int dp[] = new int[n+1] ; 
		dp[0] = 1 ;  
		dp[1] = 1 ; 

		for(int i=2; i<n+1; i++){
			for(int j=0; j<i; j++){
				int inside = dp[j] ;
				int outside = dp[i-j-1] ;
				dp[i] += inside * outside ;  // Ci += Cj * Ci-j-1

			}
		}

		return dp[n] ;
	}

	// method 2 using while loop 

	public static void main(String[] args) {
		System.out.println(waysOfTriangulation(6));

	}
}
