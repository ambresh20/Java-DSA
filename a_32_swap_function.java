public class a_32_swap_function {

   public static void swap(int a, int b){
        int temp =0;
        temp = a;
        a = b;
        b = temp;
        // System.out.println(a);
        // System.out.println(b);
    }


    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        System.out.println("Before Swapping a = " + a + " and b = "+b);
        // swap(a,b);     // call by value
        int temp = a;
        a = b ;
        b = temp;
        System.out.println("After Swapping a = " + a + " and b = "+b);
    }
}
