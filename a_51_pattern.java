public class a_51_pattern {
    static void pattern1(int N){
        // ( rows - colm +1 )
        for(int i=1; i<=N; i++){
            // number startin i.
            for(int j=i; j>=1; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern2(int N){
        // AAA
        // BBB
        // CCC for N =3;
        char ch = 'A';
        for(int i=1; i<=N; i++){
             for(int j=1; j<=N; j++){
                System.out.print(ch);
             }
             ch++;
             System.out.println();
        }

    }

    static void pattern3(int N){
        for(int i=1; i<=N; i++){
            char ch ='A';
            for(int j=1; j<=N; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }

    static void pattern4(int N){
        char ch = 'A';
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();

        }
    }

    static void pattern5(int N){
        for(int i=1; i<=N; i++){
            int ch = 'A' + i -1;
            for(int j=1; j<=N; j++){
                System.out.print((char)ch +" ");
                 ch++;
            }
            System.out.println();
        }
    } 

    static void pattern6(int N){
        char ch = 'A';
        for(int i=1; i<=N; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println();
        }

    }

    static void pattern7(int N){
        char ch = 'A';
        for(int i=1; i<=N; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }

    public static void pattern8(int N){
        // char ch = 'A';
        for(int i=1; i<=N; i++){
            int ch = 'A'+i -1;
            for(int j=1; j<=i; j++){
                System.out.print((char) ch +" ");
                ch++;
            }
            System.out.println();

        }
    }

    static void pattern9(int N){
        for(int i=1; i<=N; i++){
            int ch = 'A' + N - i  ;
            for(int j=1; j<=i; j++){
                System.out.print((char) ch +" ");
                ch++;
            }
            System.out.println();
        }
    }

    static void pattern10(int N){
        for(int i=1; i<=N; i++){
            // space 
            for(int j=1; j<=N-i; j++ ){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern11(int N){
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern12(int N){
        for(int i=1; i<=N; i++){
            // space 
            for(int j =1; j<=(i-1); j++){
                System.out.print(" ");
            }
            // stars
            for(int k=1; k<=(N-i+1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern13(int N){
        for(int i=1; i<=N; i++){
            // space 
            for(int j=1; j<=(N-i); j++ ){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(k + " ");
            }

            // second half
            for(int l= i-1; l>=1 ; l-- ){
                System.out.print(l +" ");
            }

              System.out.println();
        }
    }

        public static void main(String[] args) {
            // pattern1(10);
            // pattern2(6);
            // pattern3(5);
            // pattern4(3);
            // pattern5(3);
            // pattern6(5);
            // pattern7(4);
            // pattern8(6);
            // pattern9(4);
            // pattern10(4);
            // pattern11(4);
            // pattern12(4);
            // pattern13(4);

            // int N =4;
            // char ch = 'A';
            // for(int i=1; i<=N; i++){
            //     // hollow 
            //     for(int j=1; j<=N; j++){
            //         if(i==1 || j==1 || i==N || j==N){
            //             System.out.print(ch);
            //             ch++;
            //         }
            //         else{
            //              System.out.print("$");
            //         }
                   
            //     }
            //      System.out.println();
            // }
            

       
    }
}
