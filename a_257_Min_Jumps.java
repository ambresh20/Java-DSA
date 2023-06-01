import java.util.* ;

public class a_257_Min_Jumps {

	public static int minJumps(int nums[]){
		int n = nums.length ;

		int dp[] = new int[n] ;    // variable is starting point
		// dp[i] = ith to reach n-1 ==> min jumps 
		Arrays.fill(dp, -1) ;

		dp[n-1] = 0  ;    // n-1 to reach n-1  => min jumps 0

		// bottom up (small problem to large problem)
		for(int i=n-2 ; i>=0 ; i--){   // starting point
			int steps = nums[i] ;
			int ans = Integer.MAX_VALUE ;
			for(int j=i+1 ; j<=i+steps && j<n ; j++){
				if(dp[j] != -1){
					ans = Math.min(ans, dp[j]+1) ;
				}
			}

			if(ans != Integer.MAX_VALUE){
				dp[i] = ans ;
			}
		}
 
		print(dp); 
		return dp[0] ;   // 0 to n-1 ==> min jumps
	}

	public static void print(int dp[]){
		for(int i=0; i<dp.length ; i++){
			System.out.print(dp[i] + " ");
		}
		System.out.println();
	}

	public static int minJump(int arr[]){ // min jumps using Greedy
		
		if (arr.length <= 1)
		return 0 ;
   
    //If value of first index guarantees only 1 jump is needed
	    if (arr[0] >= arr.length-1)
		return 1 ;

    // -1 if not possible to jump
	    if (arr[0] == 0)
		    return -1;

	    int maxReach = arr[0] ;
	    int step = arr[0] ;
	    int jump = 1 ;

	    for (int i=1; i<arr.length; i++) {
		// if we have reached the end of the array
		    if (i == arr.length - 1)
			    return jump ;
	   
	  //if value at current index guarantees jump to end
		    if (arr[i] >= (arr.length-1) - i)
			    return jump + 1;

		// updating maxReach
		    maxReach = Math.max(maxReach, i + arr[i]);

		// we use a step to get to the current index
		    step-- ;

		// If no further steps left
		    if (step == 0) {
			// we must have used a jump
			jump++;

//if the current index/position or lesser index is the maximum reach point from the previous indexes
			if (i >= maxReach)
				return -1 ;

// re-initialize the steps to the amount of steps to reach maxReach from position i.
			step = maxReach - i ;
		    }
	    }

	    return -1;
	}
	

	public static void main(String[] args) {
		int nums[] = {2, 3, 1, 1, 4 } ;

		System.out.println(minJump(nums)) ;
		
	}
}
