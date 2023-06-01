public class a_101_quickSort {

	public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

	public static void quickSort(int arr[], int si, int ei){
		if( si >= ei){
			return ;
		}
		// last element for pivot
		int pIdx = partitions(arr, si, ei);
		quickSort(arr, si, pIdx-1);  // left  partitions
		quickSort(arr, pIdx+1, ei);   // rigth partitions

	}

	public static int  partitions(int arr[], int si, int ei){
		int pivot = arr[ei] ;
		int i = si -1 ;   // make place for element smallers than pivot ;
		
		for(int j = si ; j<ei ; j++){
			if(arr[j] <= pivot ){
				i++; 
				// swap
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp ;
			}
		}

		// swap for pivot elements
		i++ ;
		int temp = pivot ;
		arr[ei] = arr[i] ;
		arr[i] = temp ;

       return i ;
	}

	public static void main(String args[]){
		int arr[] = { 12, 11, 13, 5, 6, 7 };  
		quickSort(arr, 0, arr.length-1);
		printArr(arr);



	}
}





