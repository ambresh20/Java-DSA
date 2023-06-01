
public class a_105_findPermutation {

    public static void permutation(String str, String ans){
        // base case 
        if(str.length()==0){
            System.out.println(ans);
            return ;
        }

        // recursive
        for(int i=0; i<str.length() ; i++){
            char curr =   str.charAt(i) ;
            String newStr = str.substring(0, i) + str.substring(i+1) ;
            permutation(newStr, ans+curr);
        }


    }
    public static void main(String[] args) {
        String str = "abc" ;
        permutation(str, "");
        
    }
}
