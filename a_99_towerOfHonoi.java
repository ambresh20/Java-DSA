public class a_99_towerOfHonoi {

    public static void towerOfHanoi (int n, String src, String helper, String dest){
        if(n == 1) {
            System.out.println("Move disk " +n + " from rod " + src + " to rod " + helper);
            return;
        }

        towerOfHanoi(n-1, src, dest ,helper) ;
        System.out.println("Move disk " +n + " from rod " + src + " to rod " + helper);
        towerOfHanoi(n-1, dest, helper, src);
        
    }
    public static void main(String[] args) {
        towerOfHanoi(3, "A", "B", "C");
        
    }
}
