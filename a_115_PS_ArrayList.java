import java.util.ArrayList;

public class a_115_PS_ArrayList {

    public static boolean monotonic(ArrayList<Integer> num ){
        for(int i=0; i<num.size()-1; i++){
            if(num.get(i) > num.get(i+1)){
                return false ;
            }

        }
        return true ;
    }

    public static boolean lonelyNumbers(ArrayList<Integer> num , int key){
        for(int i=0; i<num.size(); i++){
            for(int j=i+1; j<num.size(); j++){
                if(num.get(i) == num.get(j)){
                    return false ;
                }
            }
        }
        return true ;
    }

    public static boolean isSafe(ArrayList<Integer> num, int N){
        for(int i=0; i<num.size(); i++){
            if(num.get(i) == (N-1)){
                return false;
            }
            else if (num.get(i) == (N+1)){
                return false;
            }
        }

        return true ;
    }
    public static void main(String[] args) {
        // Q.1 - Monotonic arrayList 
        // ArrayList<Integer> num = new ArrayList<>();
        // num.add(1);
        // num.add(3);
        // num.add(2);
        // // num.add(4);
        // System.out.println( monotonic(num) );

        // Q.2 - Lonely numbers
        ArrayList<Integer> num = new ArrayList<>() ;
        num.add(1);
        num.add(3) ;
        num.add(5) ;
        num.add(3) ;

        ArrayList<Integer> list = new ArrayList<>() ;
        for(int i=0; i<num.size() ; i++){
            if( lonelyNumbers(num, num.get(i)) ) {

            }
        }

        


    }
}
