// shortest common supersequence 
public class a_243_SuperSequence {

	public static int lcs(String str1, String str2){
		int n = str1.length(); 
		int m = str2.length() ;

		int dp[][] = new int[n+1][m+1] ;  // creation of table
		// i --> str1 length , j --> str2 length 
		//initialization
		for(int i=0; i<n+1; i++){
			for(int j=0; j<m+1; j++){
				if(i == 0 || j == 0){
					dp[i][j] = 0 ;
				}
			}
		}

		for(int i=1; i<n+1; i++){
			for(int j=1; j<m+1; j++){
				if(str1.charAt(i-1) == str2.charAt(j-1)){ // same last characters
					dp[i][j] = dp[i-1][j-1] + 1 ;
				}
				else{
					int ans1 = dp[i-1][j] ;
					int ans2 = dp[i][j-1] ;
					dp[i][j] = Math.max(ans1, ans2) ;
				}
			}
		}

		return dp[n][m] ;
	}

	public static void main(String[] args) {
		String str1 = "geek" ;
		String str2 = "eke" ;

		// length of shortest common supersequence
		// ans = n + m - lcs  = "geeke" length
		int ans = str1.length() + str2.length() - lcs(str1, str2) ;

		System.out.println( "Shortest common sepersequence = " + ans);
	}
}
