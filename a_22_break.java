import java.util.Scanner;
public class a_22_break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // for(int i =1; i<=10; i++){
        //     if(i==5){
        //         break; 
        //     }
        //     System.out.println(i);
        // }

        // Q. Keep enterings numbers till user input a multiple of 10 ?
        // do{
        //     System.out.println("Enter a number:");
        //     int n = sc.nextInt();
        //     if(n%10==0){
        //         System.out.println("This is multiple of 10");
        //         break;
        //     }
        //     // System.out.println(n);
        // } while(true);
        

        // Continue Statement
        // for(int i = 1; i<=10; i++){
        //     if(i==5){
        //         continue;
        //     }
        //     System.out.print(i+" ");
        // }

        // Q. Display all numbers entered by user except of multiple of 10.
        do{
            System.out.println("Enter a number:");
            int n = sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.print(n);

        } while(true);


    //  sc.close();
    }
}
