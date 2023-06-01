
public class a_76_palidrome {
    public static boolean isPalidrome(String str){
        for(int i=0; i<str.length()/2 ; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "ambresh";
        // System.out.println(isPalidrome(str));

        for(int i=0; i<str.length()/2; i++){
            int n = str.length();
            int temp = str.charAt(i);
            // str.charAt(i) =  str.charAt(n-1-i) ;
            // str.charAt(n-1-i) = temp;
                
         }


     }
 }

