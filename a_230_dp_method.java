// ways of dynamic programming 
// 1. Memoization(Top Down) -> store values for Reuse.
// 2. Tabulation(Battom up) -> Iteration 
public class a_230_dp_method {

	public static int fib(int n){  // recursion method 
		if(n==0 || n==1){
			return n ;
		}

		return fib(n-1)+fib(n-2) ;
	}

	public static int fibMemoiz(int n, int f[]){  // memoization method 
		if(n==0 || n==1){
			return n ;
		}

		if(f[n] != 0){
			return f[n] ;
		}

		f[n] = fib(n-1)+fib(n-2) ;
       return f[n] ;
	}

	public static int fibTabula(int n){ // tobulation method
		int dp[] = new int[n+1] ;
		dp[0] = 0 ;
		dp[1] = 1 ;

		for(int i=2; i<=n ; i++){
			dp[i] = dp[i-1] + dp[i-2] ;
		}

		return dp[n] ;
	}

	public static void main(String[] args) {
		int n = 6 ;
		int f[] = new int[n+1] ;

		System.out.println(fib(n));
		System.out.println(fibMemoiz(n, f) );
		System.out.println(fibTabula(n ) );
		 
	}
}
