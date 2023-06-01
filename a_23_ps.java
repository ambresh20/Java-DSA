import java.util.Scanner;
public class a_23_ps {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Q.2:Write a program that read a set of integers,and then prints the sum of the even and odd integers.

        // int i =1;
        // // int count = 0;
        // int sumeven = 0;
        // int sumodd = 0;
        // System.out.println("How many times requires input:");
        // int n = sc.nextInt();
        // while(i<=n){
        // int input = sc.nextInt();
        // if(input%2==0){
        //     sumeven = sumeven + input;
        // }
        //   else if(input %2 !=0){
        //     sumodd = sumodd + input;
        // }
        // i++;

        // }
        // System.out.println("Sum of Even:"+ sumeven);
        // System.out.println("Sum of Odd:"+ sumodd);


        // Q.3 Write a program to find the factorial of any number entered by the user.
    //     System.out.println("Enter Your number:");
    //     int n = sc.nextInt();
    //     int mult = 1;
    //     if(n==0){
    //         mult = 1;
    //     }
    //    else{
    //      while(n>0){
    //         mult = mult*n;
    //         n --;
    //     }
    // }
    //     System.out.println("Factorials is:" +mult);


    // Q.4 - print multiple table user input .
    System.out.println("Enter Your number:");
    int n = sc.nextInt();
    for(int i =1; i <=10; i++){
        System.out.println("Multiple of is:"+(i*n));
    }

    
    }
    
}
