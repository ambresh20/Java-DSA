// Minimum numbers of operation required to convert String S1 to String S2 . 
public class a_241_Edit_distance{

	public static int editDistance(String str1, String str2){
		int n = str1.length() ;
		int m = str2.length() ;

		int dp[][] = new int[n+1][m+1] ; // variable n and m 

		// initialization
		for(int i=0; i<n+1; i++){  // str2 length = 0 
            dp[i][0] = i ;
		}
		for(int j=0; j<m+1; j++){ // str1 length = 0
			dp[0][j] = j ; 
		}

		// tabulation or bottom up
		for(int i=1; i<n+1; i++){
			for(int j=1; j<m+1; j++){
				if(str1.charAt(i-1) == str2.charAt(j-1)){ // char same 
					dp[i][j] = dp[i-1][j-1] ;           // no operation required
				}
				else{ // different 
					int add = dp[i][j-1] + 1 ;  // insertion 
					int del = dp[i-1][j] + 1 ;  // deletion
					int rep = dp[i-1][j-1] + 1 ;  // replace operation 
					dp[i][j] = Math.min(Math.min(add, del), rep) ; 
				}
			}
		}

		return dp[n][m] ;
	}

	public static void main(String[] args) {
		String str1 = "intention" ;
		String str2 = "execntion" ;
		
		System.out.println(editDistance(str1, str2));

	}
}