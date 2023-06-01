public class a_86_fastExponential {
    public static int fasExp(int a , int n){
        int ans = 1; 
        
        while(n>0){
            if((n & 1) != 0){  // check LSB.
                ans = ans * a ;
            }
          a = a * a ;
          n = n >> 1;
        }
      return ans ;
    }
    public static void main(String[] args) {
        System.out.println(fasExp(3,5));
        
    }
}
