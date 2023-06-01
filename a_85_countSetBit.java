public class a_85_countSetBit {
    public static int countBit(int n){
        int count = 0;
        while(n>0){
            if((n & 1) != 0){  // check our LSB
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countBit(16));
        
    }
}
