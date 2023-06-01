import java.util.Scanner;
public class a_7_sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // System.out.println(a);
        
        // int b = sc.nextInt();
        // System.out.println(b);

        // int sum = a + b ;
        // System.out.println(sum);

        // int sub = a-b;
        // System.out.println(sub);
        
        // int product = a * b;
        // System.out.println(product);

        // float divition = a/b;
        // System.out.println(divition);


          // Q. WAP Area of circle.
          // Scanner sc = new Scanner(System.in);

          // System.out.println("Enter your Radius:");
          // float rad = sc.nextFloat();

          // double Area = 3.14 * rad * rad ;
          // System.out.println("Area of Circle is:"+ Area);


          // Q. WAP Area of rectangle.
          // System.out.println("Enter length of rectangle:");
          // float a = sc.nextFloat();

          // System.out.println("Enter width of rectangle:");
          // float b = sc.nextFloat();

          // double area = a * b ;
          // System.out.println("Area of Rectangle is:" + area);
          
          //  Q. WAP Area of Square .
          System.out.println("Enter side of square (in cm):");
          long side = sc.nextLong();

          long area = side * side ; 
          System.out.println("Area of Square is:" +area + " cm*cm");



        sc.close();
    }
}
