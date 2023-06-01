public class a_239_LCS_SubString { // Longest Common Substring

	// Tabulation 
	public static int longestCommonSubstring(String str1, String str2){
		int n = str1.length(); 
		int m = str2.length() ;

		int dp[][] = new int[n+1][m+1] ;  // creation of table
		// i --> str1 length , j --> str2 length  => lcs(substring) = ?

		int ans = 0 ;

		//initialization
		for(int i=0; i<n+1; i++){
			dp[i][0] = 0 ;
		}
		for(int j=0; j<m+1; j++){
			dp[0][j] = 0 ;
		}

		// Bottom up --> tabulation loop
		for(int i=1; i<n+1; i++){
			for(int j=1; j<m+1; j++){
				if(str1.charAt(i-1) == str2.charAt(j-1)){ // same last characters
					dp[i][j] = dp[i-1][j-1] + 1 ;
					ans = Math.max(ans, dp[i][j] ) ;
				}
				else{   // Continius characters are break so length is Reset = 0
					dp[i][j] = 0 ;   
				}
			}
		}

		return ans ;
	}

	public static void main(String[] args) {
		String str1 = "abcde" ;
		String str2 = "abcfg" ; 

		System.out.println(longestCommonSubstring(str1, str2));

	}
}