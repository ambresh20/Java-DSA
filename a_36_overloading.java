public class a_36_overloading {
 
    // overloading using parameter
    // public static int sum(int a, int b){
    //     return a+b;
    // }
    // public static int sum(int a, int b,int c){
    //     return a+b+c;
    // }

    // overloading using data type
    public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float a, float b){
        return a+b;
    }

    public static void main(String[] args) {
        // function overloading 
        // overloading using parameter.
        // overloading using data types.

        System.out.println(sum(4,6));
        System.out.println(sum(1.2f,3.6f));


    }
}
