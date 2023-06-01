import java.util.Scanner;

public class a_5_meter_to_inch {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        // //  float inch , meter ;
        // System.out.println("enter inches value:");
        //  float inch = sc.nextFloat();
        // double meter = (0.0254) * (inch)  ;
        // System.out.println(meter + " meter");

        // Q. Convert minutes to years and days.
        // System.out.println("Enter Minuts:");
        // int mint = sc.nextInt();

        // int years = (mint)/(525949) ;
        // float days = (mint/1440)%365 ;
     

        // System.out.println("Years is :"+ years  );
        // System.out.println("Day is :" +days); 


       // Q.5. Write a Java program that prints the current time in GMT.

       System.out.println("Enter GMT:");
       int time = sc.nextInt();

       int hour = time / 24;
        
       int min = time /1400 ; 

       int second = time/(1400*60);


       System.out.println("Current time is "+ hour + ":" + min + ":" + second);

    }
    
}
