// WAP to String Compression withing two way of compress 
// Ex. aaaabbcccd = abcd.
// Ex. aaaabbcccd = a4b2c3d.
public class a_80_comparess {
    static String compress1(String str){
        String s =  str.charAt(0)+"";
        for(int i=1; i<str.length(); i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr != prev){
                s += curr ;
            }
        }
        return s;
    }

    public static String compresscount(String str){
        String s =  str.charAt(0)+"";
        int count = 1; 
        for(int i=1; i<str.length(); i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr == prev){
                count++ ;
            }
            else{
                if(count>1){
                    s += count ;
                    count = 1;
                }
                s += curr;
            }
        }
        if(count>1){
            s += count ;
            count = 1;
        }
        return s;
    }
    public static void main(String[] args) {
        String str = "aaaaabbbcccdegggf";
        System.out.println(compress1(str));
        System.out.println(compresscount(str));
        
    }
}
