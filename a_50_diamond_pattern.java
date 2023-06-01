import java.util.*;
public class a_50_diamond_pattern {

    static void diamond(int N){
        // first half
        for(int i=1; i<=N; i++){
            // space 
            for(int j=1; j<= (N-i); j++){
                System.out.print(" ");
            }
            // stars
            for(int k=1; k<= (2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }

        // second half
        for(int i=N; i>=1; i--){
             // space 
             for(int j=1; j<= (N-i); j++){
                System.out.print(" ");
            }
            // stars
            for(int k=1; k<= (2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
            

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        diamond(N);
        

        sc.close();
    }
}
