 public class a_44_inverted_half_pyramid{
    
    public static void half_pyramid(int N){
        // outer loop for rows .
        for(int i=1; i<=N; i++){
            // inner loop 
            for(int j=1; j<=N-i ; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void half_pyramid_with_number(int N){
        //outer loop for line/rows.
        for(int i=1 ; i<=N ; i++){
            // inner loops for numbers 
            for(int j=1 ; j<= N-i+1; j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        half_pyramid_with_number(10);

        
    }
}