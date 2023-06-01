public class a_42_digit_div_sum {

    // static int evenlyDivides(int N){
    //     int count = 0;
    // int temp = N;
    //     while(temp !=0){
    //         int rem = temp % 10 ;
    //         temp = temp/10;
    //         if(N%rem==0 && rem>0 ){
    //          count = count ++;
    //        }
    //     }
    //       return count; 
    //  }
   

    static int countDigit(int N){
		int temp = N;
        int count = 0;
		while (temp != 0) {
			int rem = temp % 10;
			temp /= 10;
			if (rem > 0 && N % rem == 0)
				count++;
		}
		return count;
	}

    public static void main(String[] args) {

        // Java program to count number of digits
       // that divides the number.
	
		int N = 23;
		System.out.println(countDigit(N));

    
 
    }
}
