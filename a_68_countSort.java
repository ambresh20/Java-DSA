public class a_68_countSort {

    static void countSort(int arr[]) {
        // calculating ranges 
        int largest = Integer.MIN_VALUE ;
        for(int i=0; i<arr.length ; i++){
            largest = Math.max(largest, arr[i]);
        }

        // create counts arrays.
        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]] ++ ;
        
        }

        // sorting 
        int j = 0 ;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i] -- ;
            }
        }

    }

    static void print(int arr[]) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {8,9,7,3,2} ;
        
        System.out.println("Before sorting : ");
        print(arr);
        System.out.println("After sorting : ");
        countSort(arr);
        print(arr);
    }
}
