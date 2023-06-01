import java.util.Scanner;
public class a_48_solid_rhombus {

    static void solid_rhombus(int N){
        // rows 
        for(int i=1; i<=N; i++){
            // spaces
            for(int j=1; j<=N-i; j++){
                System.out.print(" ");
            }
            // stars
            for(int k=1; k<=N; k++){
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        solid_rhombus(N);

        
        sc.close();
    }
}
