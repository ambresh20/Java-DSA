// Factorial.
// Natural number sum.
public class a_89_fac {
    public static int fact(int N){
        if(N == 0){  // Base case
            return 1;
        }

        int fnm1 = fact( N - 1 ) ;
        int fn = N * fnm1 ;
        return fn ;
    }

    public static int naturalSum(int N){
        if( N == 1 ){ // Base case
            return 1;
        }
        int snm1 = naturalSum(N-1);
        int sn = N + snm1;

        return sn ;
    }

    public static void main(String[] args) {

        System.out.println(fact(10));
        // System.out.println(naturalSum(10)) ;
        
    }
}
