public class a_256_Minimum_Partition {

	public static int minPartition(int arr[]){
		int n = arr.length ;
		int sum = 0 ;
		for(int i=0; i<n; i++){
			sum += arr[i] ;
		}

		int W = sum/2 ;   // capacity

		int dp[][] = new int[n+1][W+1] ;

		// initialization
		for(int i=0; i<n+1; i++){  // if val[] = arr[] => 0
			dp[i][0] = 0 ;
		}
		for(int j=0; j<W+1; j++){   // if capacity = 0 
			dp[0][j] = 0 ;
		}

		// bottom up (tabulation)
		for(int i=1; i<n+1; i++){
			for(int j=1; j<W+1; j++){
				if(arr[i-1] <= j){ // valid --> include or exclude
					dp[i][j] = Math.max(arr[i-1] + dp[i-1][j-arr[i-1]], dp[i-1][j]) ;
				}
				else{ // invalid --> exclude
					dp[i][j] = dp[i-1][j] ;
				}
			}
		}

		int sum1 = dp[n][W] ;
		int sum2 = sum - sum1 ;

		return Math.abs(sum1 - sum2) ;
	}

	public static void main(String[] args) {
		int arr[] = {1, 6, 11, 5 } ;
		System.out.println(minPartition(arr));

	}
}
