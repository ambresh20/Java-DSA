import java.util.Scanner;
public class a_27_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int n = sc.nextInt();

        char ch = 'A';
        //outer loops
        for(int line =1; line<=n; line++){
            // inner loops
            for(int number =1; number<=line; number++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();

        }


       sc.close(); 
    }
}
