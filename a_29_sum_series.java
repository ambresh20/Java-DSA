import java.util.Scanner;
public class a_29_sum_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // find the sum of following series:
        // 1 - 2 + 3 - 4 + 5 - 6 + 7 - 8 + 9 - .............. n 
        // when we calculates sum of total odd numbers and even numbers.
        // sum of series = sum_odd -sum_even ;
        // int n = sc.nextInt();
        // System.out.println("Enter no terms:");
        // int ans = 0;
        // for(int i =1; i<=n; i++){
        //     if(i%2==0){
        //         ans -=i ;
        //     }
        //     else{
        //         ans +=i;
        //     }
        // } 
        // System.out.println( "Sum of series" +ans);



        // Q. Given two numbers a and b. Find a raise to the power of b.
        // simple word means a to the power of b .
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();

        int mult = 1;
        for(int i=1; i<=b; i++){
            mult = mult*a;
        }
        System.out.println(mult);

        sc.close();
    }
}
