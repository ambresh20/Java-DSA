public class a_96_FriendsPair {

    public static int friendPair(int n){
        // base case
        if(n ==1 || n==2){
            return n;
        }

        // kaam
        // single choice
        int fnm1 = friendPair(n-1);

        // pair choice
        int fnm2 = friendPair(n-2);
        int waysPair = (n-1) * fnm2 ;
        
        // Total ways of
        int totWays = fnm1 + waysPair;

        return totWays;
    }

    public static void main(String[] args) {
        System.out.println( friendPair(5) ) ;
        
    }
}
