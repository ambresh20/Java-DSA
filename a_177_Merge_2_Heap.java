public class a_177_Merge_2_Heap {

    public static void heapify(int arr[], int i, int size){
        int left = 2*i+1 ;
        int right = 2*i+2 ;
        int maxIdx = i ;

        if(left < size && arr[left] > arr[maxIdx]) {
            maxIdx = left ;
        }

        if(right < size && arr[right] > arr[maxIdx]) {
            maxIdx = right ;
        }

        if(maxIdx != i){
            // swap 
            int temp = arr[i] ;
            arr[i] = arr[maxIdx] ;
            arr[maxIdx] = temp ;

            heapify(arr, maxIdx, size) ;
        }
    }

    public static void main(String[] args) {
        
       int n = 4, m = 3 ;
       int a[] = {10, 5, 6, 2}  ;
       int b[] = {12, 7, 9}  ;

       int ans[] = new int[n+m] ;
        
        // step : 1 merge 2 arrays
        for(int i=0; i<n; i++){
            ans[i] = a[i] ;
        }
        
        for(int i=0; i<m; i++){
            ans[n+i] = b[i] ;
        }
        
        // step : 2 Build Heap
        int N = ans.length ;
        for(int i=N/2 ; i>=0 ; i--){
            heapify(ans, i, N) ;
        }

    }
}
