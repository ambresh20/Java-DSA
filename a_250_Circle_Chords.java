public class a_250_Circle_Chords{

	public static int numberOfChords(int n){ // here n is no of points

		int Cn = n/2 ;    // n/2 points are equal to Cn
		int dp[] = new int[Cn+1] ; 
		dp[0] = 1 ;  
		dp[1] = 1 ; 

		for(int i=2; i<Cn+1; i++){
			// i pairs -->count ways --> Ci
			for(int j=0; j<i; j++){
				int inside = dp[j] ;
				int outside = dp[i-j-1] ;
				dp[i] += inside * outside ;  // Ci += Cj * Ci-j-1

			}
		}

		return dp[Cn] ;
	}

	public static void main(String[] args) {
		int N = 10 ;
		System.out.println(numberOfChords(N));

	}
}
