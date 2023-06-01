
// *****
// ****
// ***
// **
// *
import java.util.Scanner;
public class a_26_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Rows :");
        int n = sc.nextInt();

        for(int line =1; line<=n; line++){
            for(int star =1; star<= n-line+1; star++){
                System.out.print("*");
            }
            for(int third=1; third<=line; third++){
                for(int space =1; space<=n-line+1; space++){
                System.out.print(" ");
            }
        }
            for(int four =1; four<=n-line +1; four++){
                System.out.print("*");
            }

            System.out.println();
        }




        sc.close();
    }
}
