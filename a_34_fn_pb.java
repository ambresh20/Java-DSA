public class a_34_fn_pb {

    public static int multiply(int a, int b){
        int product = a * b; 
        return product;
    }

    public static int factorial(int n){
        int fac = 1; 
        for(int i=1; i<=n; i++){
            fac = fac*i;
        }
        return fac;
    }
    public static void main(String[] args) {
    //   int prod = multiply(5,6);
    //   System.out.println("a * b = "+prod);
    //    prod = multiply(10,2);
    //   System.out.println("a * b = "+prod);


    System.out.println(factorial(10));
        
    }
}
