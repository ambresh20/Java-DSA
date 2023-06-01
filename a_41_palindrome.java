import java.util.Scanner;
public class a_41_palindrome {
    public static int  reverse(int N){
        int rev = 0;
        while(N>0){
            int lastDigit = N%10;
            // System.out.print(lastDigit);
            rev = (rev*10) + lastDigit ;
            N = N/10;
        }
        return rev ;
    }

    public static void isPalindrome(int N){
        int myNum = N;
        if(reverse(N)==myNum){
            System.out.println(N +" is palindrome numbers :)");
        }
        else{
            System.out.println(N + " not a palindrome numbers");
        }


    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();

        isPalindrome(N);


     sc.close();
    }
}
