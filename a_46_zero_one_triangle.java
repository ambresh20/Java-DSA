public class a_46_zero_one_triangle{
    
    static void zero_one_triangle(int N){
        // outer loop for line/rows.
        for(int i=1; i<=N; i++){
            // inner - 0 and 1 numbers.
            for(int j=1; j<=i; j++){
                // matrix index 
                if( (i+j)%2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        zero_one_triangle(10);

    }
}