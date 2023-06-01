public class a_74_rotate_by_90 {
    static void rotate(int arr[][]){
       
        // transpose 
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp ;
 
            }
        }
        // reverse
        for(int i=0; i<arr.length; i++){
            int li = 0; 
            int ri = arr[0].length-1;
            while(li < ri){
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp ;
                li++;
                ri--;
            }
        }

    }
    public static void main(String[] args) {
        int arr[][] = { {'a','b','c','d'},{'e','f','g','h'},{'i','j','k','l'},{'m','n','o','p'} };
        rotate(arr);

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print( (char)arr[i][j] +" ");
            }
            System.out.println();
        }
        
    }
}
