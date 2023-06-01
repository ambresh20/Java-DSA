import java.util.*;
public class a_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            // int a = sc.nextInt();
            // System.out.println(a);
            int A =1;
            int B = 2;
            int C= 5;

            int D = (B*B) - (4*A*C)  ;
            if(D>=0){
                double x1 = (-B + Math.pow(D,0.5))/2*A;
                double x2 = (-B - Math.pow(D,0.5))/2*A ;
                System.out.println(x1 +","+x2);
            }
            else{
                System.out.println("-1");
            }
            
        
        sc.close();
    }
        
    
}
