import java.util.Scanner;
public class a_20_while {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        // int counter = 0;
        // while(counter < 5){
        //     System.out.println("Good Morning :)");
        //     counter++;
        // }
        // System.out.println("Good Morning 5th times");

        // Q. WAP print to 10 Numbers.
        // int i=1;
        // while(i<=10){
        //     System.out.println(i);
        //     i++;
        // }

        // Q. WAP print 1 to N numbers.
        // System.out.println("Enter number of N:");
        // int N = sc.nextInt();
        // int counter = 1;
        // while(counter <= N){
        //     System.out.print(counter+" ");
        //     counter ++;
        // }

       // Q. WAP print sum of 1 to N numbers.
        System.out.println("Enter number of N:");
        int N = sc.nextInt();
        int counter = 1;
        int sum = 0;
        while(counter <= N){
            System.out.print(counter+" ");
            sum = sum + counter;
            counter ++;
        }
        System.out.println("\nSum is:"+ sum);

        // Q. Write a program to input 5 numbers from keyboard and find their sum and average.
        // int i = 1;
        // int sum =0;
        // while(i<=5){
        //     int a = sc.nextInt();
        //     sum = sum +a ;
        //     i++;
        // }
        // System.out.println("Sum is:"+sum);
        // float avg = sum/5;
        // System.out.println("Average is:"+ avg);


        sc.close();
    }
}
