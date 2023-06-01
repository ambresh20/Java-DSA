public class a_74_multiplacation {
    public static void main(String[] args) {
        // multiplication of two matrix.
        int r1 = 3, c1 = 2;
        int one[][] = { {1,2},{3,4},{5,6} };
        int r2 = 2, c2 = 4;
        int two[][] = { {1,2,3,4},{5,6,7,8} };
        if(r2 != c1){
            System.out.println("Multiplication not possible :)");
        }

        int prod[][] = new int[r1][c2];
        for(int i=0; i<prod.length; i++){
            for(int j=0; j<prod[0].length; j++){
                for(int k=0 ; k<r2 ; k++){             // optional k < c1 ......
                    prod[i][j] += one[i][k]* two[k][j] ;

                }
            }
        }
         // printing matrix :
        for(int i=0; i<prod.length; i++){
            for(int j=0; j<prod[0].length; j++){
                System.out.print(prod[i][j] +" ");
            }
            System.out.println();
        }


    }
}
