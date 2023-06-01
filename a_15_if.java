import java.util.Scanner;
public class a_15_if {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();

        // Q.1
        // if(a%2==0){
        //     System.out.println("Even Numbers :)");
        // }
        // else{
        //     System.out.println("Odd Number :)");
        // }

        // Q.2 Income Tax Calculations
        // int income = sc.nextInt();
        // int tax;
        // if(income < 500000){
        //     tax = 0;
        // }
        // else if((income>500000)&& (income <1000000)){
        //     tax = (int)(income*0.2) ;
        // }
        // else{
        //     tax = (int)(income* 0.3);
        // }
        // System.out.println(tax);

        // Q.3 Largest number of 3 .
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if((a>=b) && (a>=c)){
        System.out.println("A is largest number ");
        }
        else if(b>=c){
            System.out.println("B is largest number");
        }
        else{
            System.out.println("C is largest number");
        }


        sc.close();
    }
    
}
