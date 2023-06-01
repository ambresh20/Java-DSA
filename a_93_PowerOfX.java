public class a_93_PowerOfX {
    public static int power(int x, int n){

        if(n == 0){   // base case 
            return 1;
        }

        // int xnm1 = power(x,n-1);
        // int xn = x * xnm1;
        // return xn ;

        return x * power(x, n-1) ;
    }

    public static int optimizPower(int x, int n){
        if(n == 0){                         //base case.
            return 1;
        }

        // int powerhalf = optimizPower(x, n/2) * optimizPower(x, n/2) ;    TC--> O(n)
        int powerhalf = optimizPower(x, n/2) ;         // TC --> O(logn).
        int power  = powerhalf * powerhalf ;

        if(n % 2 != 0){             // if n--> are odd numbers.
            power = x * power ;
        }

        return power ;
    }


    public static void main(String[] args) {
        // System.out.println(power(2, 10));
        System.out.println(optimizPower(2,10));
        
    }
}
