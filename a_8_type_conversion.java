public class a_8_type_conversion {
    public static void main(String[] args){

        // Type Conversion is two types of conversion:
        // 1. Widening.
        // This type conversion are automatically when higher data type covert to lower data types.
        // byte > short > int > float > long > double.
        
        // int a = 30;
        // long b = a;
        // System.out.println(b);



        // 2. Narrowing.
        // This type conversion are manually when lower data types convert to higher data types.
        // long a = 20;
        // int b = (int)a;
        // System.out.println(b);

        // float c = 4.44f;
        // int d = (int)c;
        // System.out.println(d);

        // char ch = 'a';
        // char ch2 = 'b';
        // int number1 = ch;
        // int number2 = ch2;
        // System.out.println(number1);
        // System.out.println(number2);

        // Type Promotion in Expressions 
        // 2 Rule are:
        // 1. byte , short, char operand to int when evaluation an expression.

        // char ch = 'a';
        // char ch2 = 'b';
        // int number1 = ch;
        // int number2 = ch2;
        // System.out.println(number1);
        // System.out.println(number2);
        // System.out.println(ch2-ch);
        // byte a = 10;
        // short b = 20 ;
        // char c = 'c';
        // byte bt = a + b + c ;    // show error lossy.
        // byte bt = (byte)(a + b + c);
        // System.out.println(bt);


        // 2. long , float, double whole expression is promoted to long, float or double respectively.
        // int d = 20;
        // float e = 10.5f;
        // double f = 45.4546;
        // long g = 3435;
        // double ans = d + e + f + g ;
        // System.out.println(ans);


        byte b = 25;
        // byte a = 5 * b ;       // this are count to integers
        byte a = (byte) (5 * b);
        System.out.println(a);



    }
    
}
