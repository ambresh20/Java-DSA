public class a_63_ps {

    // Q.2 Given an integer array nums, return true if any value appears at least 
    // twice in the array, and return false if every element is distinct
    static boolean twice(int numbers[]){
        for(int i=0 ; i< numbers.length; i++){
            for(int j=i+1 ; j<numbers.length; j++){
                if(numbers[i] == numbers[j]){
                    return true;
                }
            }
        }
        return false ;
    }

    static void triplets(int nums[]){
        int n = nums.length; 
        for(int i=0;i<n; i++ ){
            for(int j=0; j<n; j++){
                for(int k=0; k<n; k++){
                    
                }
            }
        }

    }
    public static void main(String[] args) {
        // int numbers[] = {1,3,5,7,1,9} ;
        // System.out.println(twice(numbers));

        // Q.2 Given an integer array nums, return all the triplets [nums[i], nums 
        //[j],  nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] +
        //nums[k] == 0.Notice that the solution set must not contain duplicate 
        //triplets
        int nums[] = {-1,0,1,2,-1,4};
    }
}
