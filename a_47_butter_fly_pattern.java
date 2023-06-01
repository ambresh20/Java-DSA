public class a_47_butter_fly_pattern {

    static void butter_fly(int N){
        // first half
        for(int i=1; i<=N; i++){
            // to print stars

            // stars (i)
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // spaces 2 * N-i
            for(int k=1; k<= 2*(N-i); k++){
                System.out.print(" ");
            }
            // stars (i)
            for(int l=1; l<=i; l++){
                System.out.print("*");
            }
            System.out.println();
        }

        // second half 
        for(int i=N; i>=1; i--){
            // to print 

            // star (i)
            for(int j=1 ; j<=i; j++){
                System.out.print("*");
            }
            // spaces 2 * N -i 
            for(int k=1; k<= 2*(N-i); k++){
                System.out.print(" ");
            }
            // stars i
            for(int l=1; l<=i; l++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        butter_fly(4);

    }
}
