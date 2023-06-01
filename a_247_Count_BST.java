public class a_247_Count_BST {

	public static int countBST(int n){
		int dp[] = new int[n+1] ;
		dp[0] = 1 ;    // null node 
		dp[1] = 1 ;    // root node 

		for(int i=2; i<n+1; i++){
			// Ci --> BST (i nodes) --> dp[i]
			for(int j=0; j<i; j++){
				int left = dp[j] ;
				int right = dp[i-j-1] ;
				dp[i] += left * right ;
			}
		}

       return dp[n] ;
	}

	public static void main(String[] args) {
		int n = 30 ;   // BST = ?
        
		System.out.println(countBST(n));

	}
}
