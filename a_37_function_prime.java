public class a_37_function_prime {

   
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
            for(int i=2; i<=Math.sqrt(n); i++){    // optimizations method.
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    // for in range prime numbers printing .
    // public static void primeInRange(int n){
    //     for(int i=2; i<=n; i++){
    //         if(isPrime(i)){
    //             System.out.print(i +" ");
    //         }
    //     }
    // }

    public static int primeInRange(int n){
        int sum = 0;
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                sum = sum + i;

            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(primeInRange(100));
        
        
    }
}
