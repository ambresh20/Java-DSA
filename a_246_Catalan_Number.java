// import java.util.Arrays;

public class a_246_Catalan_Number{

	public static int catalanRec(int n){
		if(n == 0 || n == 1){  // C0 = 1, C1 = 1 
			return 1 ;
		}

		int ans = 0 ;  // Cn
		for(int i=0; i<n; i++){
			ans += catalanRec(i) * catalanRec(n-i-1) ;
		}

		return ans ;
	}

	public static int catalanMem(int n, int dp[]){
		if(n == 0 || n == 1){  // C0 = 1, C1 = 1 
			return 1 ;
		}

		if(dp[n] != -1){
			return dp[n] ;
		}

		int ans = 0 ;  // Cn
		for(int i=0; i<n; i++){
			ans += catalanMem(i, dp) * catalanMem(n-i-1, dp) ;
		}

		return dp[n] = ans % 1000000007 ;
	}

	public static int catalanTab(int n){
		int dp[] = new int[n+1] ;
		// dp[i] --> ith catalan's number

		// initilization or base case 
		dp[0] = 1 ; 
		dp[1] = 1 ;

		// fill bottom up 
		for(int i=2; i<n+1; i++){  // Ci
			for(int j=0; j<i; j++){  // j<=i-1
				dp[i] += dp[j] * dp[i-j-1] ;  // Ci = Cj * Ci-j-1
			}
		}

		return dp[n] ;
	}

	public static void main(String[] args) {
		// int n = 30 ;
        // System.out.println(catalanRec(n));

		// int dp[] = new int[n+1] ;
		// Arrays.fill(dp, -1) ;
		// System.out.println(catalanMem(n, dp));

		System.out.println(catalanTab(5));

	}
}