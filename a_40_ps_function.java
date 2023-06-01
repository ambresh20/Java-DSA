public class a_40_ps_function {

    // public static float avg(float a, float b, float c){
    //     float sum = a + b + c ;
    //     float avg = sum/3;
    //     return avg;
    // }

    // public static String isEven(int N){
    //    return (N%2==0)?"true":"false";
    // }

    public static int sumDigit(int N){
        // int myNum = N;
        int sum = 0;
        while(N>0){
            int lastDigit = N %10;
            sum = sum + lastDigit ;
            N = N/10;

        }
        return sum;
    }

    public static void main(String[] args) {
        //Q.1- Write a Java method/function to compute the average of three numbers.
        // System.out.println("Average of 3 numbers :" +avg(3,5,8));

        // Q.2-Write a method named isEven that accepts an int argument.The method should return true if the argument is even,or false otherwise.Also write a program to test your method.

        // System.out.println(isEven(50));

        // Question 3: Write a Java program to check if a number is a palindrome in Java ? (121 is a palindrome, 321 is not palindrome).

        // Q. 5 :Write a Java method to compute the sum of the digits in an integer.
        // int N = 512;
        // System.out.println("sum of "+ N  + " is:"+ sumDigit(N));


        System.out.println(2%10);

    }
}
