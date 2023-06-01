public class a_83_bit_operator {
    public static void oddOrEven(int n){
        int bitMask = 1;
        if( (n & bitMask) == 0 ){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args) {
        // Bitwise operator
        // 1. AND operator (&)
        // System.out.println(5&6);

        // 2.OR operator (|)
        // System.out.println(5|6);

        // 3. XOR (^)
        // System.out.println(5^6);

        // 4. One's complement (~)
        // System.out.println(~5);

        // 5. Left shift (<<)
        // System.out.println(5<<2);

        // 6. Right shift (>>)
        // System.out.println(5>>1);
        // System.out.println(-5>>1);
        
        // oddOrEven(3);
        // oddOrEven(6);
        // oddOrEven(11);
        // oddOrEven(20);

        for(char ch='A';ch<='Z';ch++){
            System.out.print((char)(ch | ' ') +" ");
            // prints abcdefghijklmnopqrstuvwxyz
        }
       
    }
}
