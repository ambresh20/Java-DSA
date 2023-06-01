public class a_39_decimal_binary {

    public static void dectobin(int N){
        int binNum = 0;
        int pow = 0;
        while(N>0){
             int rem = N % 2;
             N = N/2 ;
             binNum = binNum + rem * (int) Math.pow(10,pow) ;
             pow ++ ;

        }
        System.out.println(binNum);
    }
    public static void main(String[] args) {
        dectobin(16);
        
    }
}
