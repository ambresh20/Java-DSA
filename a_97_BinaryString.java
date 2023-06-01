public class a_97_BinaryString {
    public static void binString(int n, int lastPlace, String str ){
        // Base case
        if(n==0){
            System.out.println(str);
            return ;
        }

        // kaam
        // if(lastPlace == 0){
        //     // sit 0 on the chair of n.
        //     binString(n-1, 0, str+"0");
        //     binString(n-1, 1, str+"1");
        // }
        // else{
        //     binString(n-1, 0, str+"0");
        // }

        // 2nd Methods.
        binString(n-1, 0, str+"0");
        if(lastPlace == 0){
                binString(n-1, 1, str+"1");
            }
    }

    public static void binaryprob(int n, StringBuilder str, int lastplace){
        if(n==0){
            System.out.println(str);
            return;
        }
            if(lastplace==0){
                binaryprob(n-1, str.append(0), 0);
                binaryprob(n-1, str.append(1), 1);
            }
            else{
                binaryprob(n-1, str.append(0), 0);
            }
        
    }
    
    public static void main(String[] args) {
        // binString(3, 0, new String("")) ;  
        StringBuilder sb = new StringBuilder("") ;
        binaryprob(3, sb,0);
    }
}
