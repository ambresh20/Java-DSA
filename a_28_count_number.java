// count numbers of digit given numbers.

import java.util.Scanner;
public class a_28_count_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any numbers:");
        int n = sc.nextInt();
        // int count = 0;

        // for(int i = 1; n>0; i++){
        //     n = n/10;
        //     count ++;

        // }
        // System.out.println("No of digit is:"+ count);


        // Q. find sum of digit given numbers.
        int sum = 0;
        for(int i = 1; n>0; i++){
          int reminder = n % 10;
          sum = sum + reminder;
          n = n/10;
        }
        System.out.println(sum);




       sc.close(); 
    }
}
