public class a_104_findSubset {

    public static void findSubset(String str ,String ans, int i){

        // base case 
        if( i == str.length() ) {
            if(ans.length() == 0){
                System.out.println("Null");
            }
            else {
                System.out.println(ans);
            }
           
          return ;
        }

        // recursion (kaam)

        // Yes choice
        findSubset(str, ans+str.charAt(i), i+1 ); 

        // No choice
        findSubset(str, ans, i+1 );

    }
    public static void main(String[] args) {
        String str = "abc" ;
        findSubset(str, "", 0);

     }
}
