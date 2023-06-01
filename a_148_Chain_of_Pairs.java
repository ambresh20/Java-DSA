import java.util.* ;

// max length Chain of pairs

public class a_148_Chain_of_Pairs {
    public static void main(String[] args) {
        int pair[][] = { {5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90} } ;

        Arrays.sort(pair, Comparator.comparingDouble( o -> o[1])) ;

        int chainLen = 1 ;   // 1st selections of chain 
        int chainEnd = pair[0][1] ;  // Last selected pairs end  // chain end 

        for(int i=0; i<pair.length ; i++) {
            if(pair[i][0] > chainEnd ) {
                chainLen++ ;
                chainEnd = pair[i][1] ;
            } 
        }

        System.out.println("Maximum Length of chain pairs = " + chainLen);
        
    }
}
