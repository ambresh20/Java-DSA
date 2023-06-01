public class a_65_selectionSort {

    static void selectionSort(int arr[]){
    for(int i =0; i<arr.length -1; i++){
        int minPos = i;
        for(int j= i+1; j<arr.length; j++){  // Choosing for minumum elements 
            if(arr[minPos] > arr[j]){
                minPos = j;
            }
        }
          // swap 
          int temp = arr[minPos];
          arr[minPos] = arr[i];
          arr[i] = temp ;
    }
        
    }
    static void print(int arr[]) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2} ;
    
        System.out.println("Before sorting : ");
        print(arr);
        System.out.println("After sorting : ");
        selectionSort(arr);
        print(arr);
    }
}
