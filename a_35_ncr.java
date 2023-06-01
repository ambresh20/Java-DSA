public class a_35_ncr {

    // public static int factorial(int n){
    //     int f =1;
    //     for(int i=1; i<=n; i++){
    //         f = f*i;
    //     }
    //     return f;
    // }
    // public static int bicoeff(int n, int r){
    //     int fact_n = factorial(n);
    //     int fact_r = factorial(r);
    //     int fact_nmr = factorial(n-r);
    //     int bicoeff = fact_n/(fact_r * fact_nmr) ;
    //     return bicoeff;

    // }

    public static long factorial(int n){
        long f =1;
        for(int i=1; i<=n; i++){
            f = f*i;
        }
        return f;
    }
    public static int bicoeff(int n, int r){
        long fact_n = factorial(n);
        long fact_r = factorial(r);
        long fact_nmr = factorial(n-r);
        int bicoeff =  fact_n/(fact_r * fact_nmr) ;
        return bicoeff;

    }


    public static void main(String[] args) {
        System.out.println(bicoeff(15,3));
        
    }
    
}
