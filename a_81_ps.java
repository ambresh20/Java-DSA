import java.util.*;
public class a_81_ps {
    public static String asciiDifference(String str){

        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0)) ;

        for(int i=1; i<str.length(); i++){
            char prev = str.charAt(i-1);
            char curr = str.charAt(i);
            int gap = curr - prev ;

            sb.append(gap);
            sb.append(curr);
        }

        return sb.toString();
        
    }
    public static void main(String[] args) {
        // Question 1 : Count how many times lowercase vowels occurred in a String entered by the user.

        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // int count = 0;
        // for(int i=0; i<str.length(); i++){
        //     char ch = str.charAt(i);
        //     if(ch=='a' || ch =='e' || ch=='i' || ch=='o' ||ch=='u'){
        //         count ++;
        //     }
        // }
        // System.out.println(count);

        //  Question 4 : Determine if 2 Strings are anagrams of each other
        // example: race and care . 

        // String str1 = sc.next();
        // String str2 = sc.next();
     
        // str1 = str1.toLowerCase();
        // str2 = str2.toLowerCase();

        //     if(str1.length() ==str2.length())  {
                
        //          char []str1charArray = str1.toCharArray();
        //          char []str2charArray = str2.toCharArray();
                
        //          Arrays.sort(str1charArray);
        //          Arrays.sort(str2charArray); 

        //          boolean result = Arrays.equals(str1charArray,str2charArray);

        //          if(result) {
        //             System.out.println(" anagrams");
        //          }
        //          else{
        //             System.out.println("not anagrams ");
        //           }
        //         }
        //    else{
        //             // case when lengths are not equal
        //             System.out.println("not anagrams ");
        //         }


        // Question - ASCII difference String 
        String str = "abdgca" ;
        System.out.println(asciiDifference(str));


    }
}
