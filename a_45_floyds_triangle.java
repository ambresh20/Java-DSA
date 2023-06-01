public class a_45_floyds_triangle {

    static void floyds_triangle(int N){
        // outer loop for line/rows.
        int count = 0;
        for(int i=1; i<=N; i++){
            // inner loop for numbers.
            for(int j=1; j<=i; j++){
                count++;
                System.out.print(count + " ");
                
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        floyds_triangle(10);

    }
}
