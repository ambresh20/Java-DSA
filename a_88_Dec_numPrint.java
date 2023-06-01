
public class a_88_Dec_numPrint {
    public static void printDec(int n){
        // base case
        if(n == 1){
            System.out.print(n );
            return;
        }
        System.out.print(n +" ");
        printDec(n-1);
    }

    public static void printIncOrd(int n){
        // base case 
        if(n == 1){
            System.out.print(n +" ");
            return ;
        }
        printIncOrd(n -1);
        System.out.print(n + " ");
    }


    public static void main(String[] args) {
        // int n = 20 ;
        // printDec(20);
        printIncOrd(20);
        
    }

}