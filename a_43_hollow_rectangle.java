public class a_43_hollow_rectangle {

    public static void hollow_rectangle(int totrows, int totcols){
        // outer loop for total rows .
        for(int i =1; i<=totrows; i++){
            // inner loop for total colms.
            for(int j =1; j<=totcols; j++){
                if(i==1 || j==1 || i==totrows || j==totcols){
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
        hollow_rectangle(8,5);
        
    }
}
