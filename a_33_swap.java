public class a_33_swap {
    public static void main(String[] args) {
        int a =5 ; 
        int b = 9 ;
        System.out.println("Before Swapping a=" + a + " and b="+b);

        // Swapping using third variable.
        // int temp = a;
        // a = b;
        // b = temp;
        // System.out.println("After Swapping a=" + a + " and b="+b);
        

        // Swapping without using third variable.
        a = a + b ;
        b = a - b;
        a = a - b ;

        System.out.println("After Swapping a=" + a + " and b="+b);
    
    
    }
}
