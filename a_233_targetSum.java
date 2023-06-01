public class a_233_targetSum {

	// T.C = O(n*sum)
	public static boolean targetSumTab(int arr[], int sum){
		int n  = arr.length ; 
		boolean dp[][] = new boolean[n+1][sum+1] ;
        // i ---> items , j --> target sum 
		for(int i=0; i<n+1; i++){
			dp[i][0] = true ;        // initialization if target sum = 0 ;
		}

		for(int i=1; i<n+1; i++){
			for(int j=1; j<sum+1; j++){
				int v = arr[i-1] ;

				// include
				if(v <= j && dp[i-1][j-v] == true){
					dp[i][j] = true ;
				}
				//exclude
				else if(dp[i-1][j] == true ){
					dp[i][j] = true ;
				}

			}
		}

		return dp[n][sum] ;
	}

// the task is to count all subsets of the given array with a sum equal to a given sum. Example :
// Input: N = 6, arr[] = {2, 3, 5, 6, 8, 10} sum = 10
// Output: 3  // Explanation: {2, 3, 5}, {2, 8}, {10}
    public static int perfectSum(int arr[],int n, int sum) { 
	
	    int mod = (int)1e9+7 ;
	    int dp[][] = new int[n+1][sum+1] ;  // 1.creation of table
	    // i --> items or numbers  j --> target sum or subset sum

	    // 2. initializes or base case
		for(int i=0; i<n+1; i++){
			dp[i][0] = 1 ;   // if sum are 0 then count 1  subsets
		}

	    for(int i=1; i<n+1; i++){
		    for(int j=0; j<sum+1; j++){

		       // include
			    if(arr[i-1] <= j){  // values = arr[i-1]
			    	dp[i][j] = ( dp[i-1][j-arr[i-1]]%mod) + ( dp[i-1][j]%mod ) ;
			    }
			    else{ // exclude
				    dp[i][j] = dp[i-1][j] % mod ;
			    }
		    }
	    }
	
	return dp[n][sum] % mod ;
} 

	public static void main(String[] args) {
		int numbers[] = {4, 2, 7, 1, 3 } ;
		int target_sum = 100 ;

      System.out.println(targetSumTab(numbers, target_sum)); // True or false
	  System.out.println(perfectSum(numbers, 5, target_sum)); // count subsets

	}
}