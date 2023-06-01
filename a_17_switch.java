import java.util.Scanner;
public class a_17_switch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a :");
        int a = sc.nextInt();
        System.out.println("Enter b :");
        int b = sc.nextInt();

        System.out.println("Enter Operands :");
        char ch = sc.next().charAt(0);

        switch(ch){
            case '+' : 
                 System.out.println("Sum is " +(a+b));
                 break ;
            case '-' :
                System.out.println("Subtract is "+ (a-b));
                break;
            case '*' :
                System.out.println("Multipises is "+ (a*b));
                break;
            case '/' : 
                System.out.println("Divion is "+ (a/b));
                break;
            case '%' :
                System.out.println("Reminder is "+ (a%b));
                break;
            default :
            System.out.println("Enter Your symbols are wrong");                     

        }

      sc.close();
    }
}
