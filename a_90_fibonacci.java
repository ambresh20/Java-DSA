public class a_90_fibonacci {
    public static int fib(int N){
        if(N == 0 || N == 1){
            return N ;
         }
        int fnm1 = fib(N-1) ;
        int fnm2 = fib(N-2) ;
        int fn = fnm1 + fnm2 ;

        return fn;
        
    }

    public static void main(String[] args) {
        System.out.println(fib(9));

    
   }

}
