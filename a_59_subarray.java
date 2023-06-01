public class a_59_subarray {
    static void printSubarrays(int numbers[]){
        int ts = 0 ;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                int sum = 0;
                for(int k=start ; k<=end ; k++){ // prints
                    sum = sum + numbers[k]; 
                    System.out.print(numbers[k] +" ");  // subarrays.
                }
                ts++;
                System.out.println();
                System.out.println( "Sum = " + sum);
            }
              System.out.println();
        }
        // System.out.println("Total Subarray = " + ts);
    }

    static void maxSubarrSum(int numbers[]){
        int max = Integer.MIN_VALUE ;
        int min = Integer.MAX_VALUE ;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for( int j=i; j<numbers.length; j++){
                int end = j;
                int sum = 0;
                for(int k=start ; k<=end ; k++){ 
                    sum = sum + numbers[k]; 
        
                }
                System.out.println( sum);
                if(max <sum){
                    max = sum ;
                }
                if(min>sum){
                    min = sum ;
                }
            }
        }
        System.out.println("Max Sum = "+max);
        System.out.println("Min Sum = "+min);
        
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        // printSubarrays(numbers);
        maxSubarrSum(numbers);

    }
}
