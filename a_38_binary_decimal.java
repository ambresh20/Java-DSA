public class a_38_binary_decimal {

    public static void binaryToDecimal(int N){
        int myNum = N;
        int pow = 0 ;
        int decNum = 0;

        while(N>0){
            int lastDigit = N % 10 ;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            pow ++;
            N = N/10 ;
        }
        System.out.println("Decimal of " + myNum + " = " + decNum);
        
    }

    public static void main(String arms []){
        binaryToDecimal(1010101011);

    }
}
