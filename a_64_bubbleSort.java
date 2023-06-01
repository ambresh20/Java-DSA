public class a_64_bubbleSort {

    static void bubbleSort(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j] < arr[j+1]){
                    // swaping 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ;
                }
            }
        }
    }

    // static void printBubble(int arr[]) {
    //     for(int i=0; i<arr.length; i++){
    //         System.out.print(arr[i] +" ");
    //     }
    //     System.out.println();
    // }
    public static void main(String[] args) {
        int arr[] = {1,0,0,1,1,1,2,0} ;
    
        // System.out.println("Before sorting : ");
        // printBubble(arr);
        // System.out.println("After sorting : ");
        bubbleSort(arr);
        // printBubble(arr);
    }
}
