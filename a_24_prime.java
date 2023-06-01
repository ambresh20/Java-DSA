// check numbers is a prime numbers or not prime.
import java.util.Scanner;
public class a_24_prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        // if(n==0 || n==1){
        //     System.out.println("Not a prime number");
        // }

        // if(n==2){
        //     System.out.println("prime number");
        // }
        // else{
        //     boolean isPrime = true ;
        //     // for(int i =2; i <= n-1; i++ ){
        //         for(int i =2; i<=Math.sqrt(n); i++){
        //         if(n%i==0){
        //              isPrime = false;
        //             // System.out.println("Not a prime number");
        //         }
        //     }
        //     if(isPrime){
        //         System.out.println("prime number");
        //     }
        //     else{
        //         System.out.println("Not a prime number");
        //     }


        //#############################################################//
        // }


        // int i,flag=0;      
          
        // if(n==0||n==1){  
        //  System.out.println(n+" is not prime number");      
        // }
        // else{  
        //     for(i=2; i<=Math.sqrt(n); i++){      
        //      if(n%i==0){      
        //       System.out.println(n+" is not prime number");      
        //        flag=1;      
        //         break;      
        //     }      
        //  }      
        //  if(flag==0){ 
        //     System.out.println(n+" is prime number");
        //    }  
        // }


// *******************************************************************//

        // int flag = 0;
        // if(n==0 || n==1){
        //     System.out.println("No");
        //     //  flag=1;
        // }
        // else if(n==2){
        //     System.out.println("Yes");
        //     //  flag=0;
        // }
        // else{
        //      for (int i = 2; i <= Math.sqrt(n); i++) {
        //        if(n%i ==0){
        //          System.out.println("No");
        //          flag=1;      
        //          break;  
        //         }
        //    }
        //    if(flag==0){ 
        //     System.out.println("Yes");
        //    }  
        // }

        // @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ //


        boolean isPrime = true ;
       if(n==0 || n==1){
        isPrime = false;
       }
       else{
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i ==0){
                isPrime = false ;
                break ;
            }
       }
     }

     
       if(isPrime){
        System.out.println(n + " is a prime number");
       }
       else{
        System.out.println("Not a prime number");
       }




        sc.close();
    }
}
