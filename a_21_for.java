public class a_21_for {
    public static void main(String[] args){

        // for(int i =1; i<=10; i++){
        //     System.out.println(i+ ".Hello World :)");
        // }


        // Q. Square patttern.
        // for(int line=1; line<=4; line++){
        //     System.out.println("* * * *");
        // }

        // Q.Print Reverse a  numbers.  --> this is only print values reverse not store values.
        // int num = 15072001;
        // while(num>0){
        //     int lastDigit = num % 10;
        //     System.out.print(lastDigit);
        //     num = num/10 ;  // n/=10;
        // }
        // System.out.println();



        // Q. convert reverse number with store values.

        int num = 15072001;
        int rev = 0;
        while(num>0){
            int lastDigit = num % 10;
            rev = (rev*10) + lastDigit ;
            num = num/10;
        }
        System.out.println(rev);

   }
}
