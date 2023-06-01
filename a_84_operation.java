public class a_84_operation {
    public static int getIthBit(int n, int i){
        int bitMask = 1<<i ;
        if((n & bitMask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static int setIthBit(int n, int i){
        int bitMask = 1<<i ;
        return n|bitMask ;
    }

    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i) ;
        return n & bitMask ;
    }
    
    public static int updateIthBit(int n, int i, int newBit){
        // if(newBit == 0){
        //     return clearIthBit(n, i);
        // }
        // else{
        //     return setIthBit(n, i);
        // }

        // Second methods.
        n = clearIthBit(n, i);
        int BitMask = newBit<<i ;
        return n | BitMask ;
    }
    public static int clearLastIthBit(int n, int i){
        int BitMask = (~0)<<i ;
        return n & BitMask;
    }
    public static int clearRangeOfBit(int n, int i, int j){
        int a = (~0)<<(j+1);
        int b = (1<<i) -1;
        int bitMask = a | b;
        return n & bitMask ;
    }
    public static boolean isPowerOfTwo(int n){
        return (n & (n-1)) == 0 ;
    }
    public static void main(String[] args) {
        // System.out.println(getIthBit(15, 5));
        // System.out.println(setIthBit(10, 2));
        // System.out.println(clearIthBit(10, 1));
        // System.out.println(updateIthBit(10,1,0));
        // System.out.println(clearLastIthBit(15, 2));
        // System.out.println(clearRangeOfBit(10,2,4));

        System.out.println(isPowerOfTwo(34));
       
        
    }
}
