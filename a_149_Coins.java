import java.util.* ;
public class a_149_Coins {
    public static void main(String[] args) {
        // Indian coins 
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000 } ;

        Arrays.sort(coins, Comparator.reverseOrder() ) ;

        int countOfCoin = 0 ;
        int amount = 10087 ;
        ArrayList<Integer> ans = new ArrayList<>() ; 

        for(int i=0; i<coins.length; i++){
            if( coins[i] <= amount ) {
                while( coins[i] <= amount) {
                    countOfCoin++ ;
                    ans.add(coins[i]);
                    amount = amount - coins[i] ;
                }
            }
        }

        System.out.println("Min no of coins used = " + countOfCoin);

        for(int i=0; i<ans.size(); i++ ){
            System.out.print(ans.get(i) + " ");
        }

        System.out.println();

    }
}
