import java.util.Scanner; 
public class a_49_hollow_rhombus {

    static void hollo_rhombus(int N){
        // rows 
        for(int i=1; i<=N; i++){
            // spaces 
            for(int k=1; k<=(N-i); k++){
                System.out.print(" ");
            }

            // stars + space + stars
            for(int j=1; j<=N; j++){
                if(i==1 || j==1 || i==N || j==N){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        hollo_rhombus(N);

        
        sc.close();
    }
}
