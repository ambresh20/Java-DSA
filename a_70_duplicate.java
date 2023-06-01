public class a_70_duplicate {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,3,11};
        
            for(int i=0; i<arr.length; i++){
                for(int j = i+1; j<arr.length-1; j++){
                    if(arr[i] == arr[j]){
                      System.out.print(arr[i] +" ");
                    }
                      
                }
                
            }
            // System.out.println("-1");
    }
}
