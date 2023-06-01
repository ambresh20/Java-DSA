public class a_100_mergeSort {

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

//     public static void mergeSort (int arr[] , int si, int ei){
//         if(si >= ei){  // base case
//             return ;
//         }

//         // kaam 
//         int mid = si + (ei - si)/2 ;   // mid = (si + ei )/2 ;
//         mergeSort(arr, si, mid);  // left part divide 
//         mergeSort(arr, mid+1, ei);  // right part divide 

//         merge(arr, si , mid, ei )  ;   // merge (combine) of left part and right part 
//     }

//     public static void merge (int arr[], int si, int mid, int ei){
//         int temp[] = new int[ei - si + 1] ;
//         int i = si ;   // idx for 1st sorted arrays
//         int j= mid+1 ;     // idx for 2nd sorted arrays
//         int k = 0 ;   // iterator for temparary arrays
    
//         while(i <= mid && j <= ei ){
//             if(arr[i] <= arr[j] ){
//                 temp[k] = arr[i];
//                 i++ ;
//             }
//             else{
//                 temp[k] = arr[j] ;
//                 j++ ;
//             }

//             k++;
//         }

//         // for leftover element of 1st sorted arrays
//         while(i <= mid ){
//             temp[k++] = arr[i++] ;
//             // k++ ; i++ ;
//         }

//         // for leftover (remaining) element of 2nd sorted arrays 
//         while(j <= ei){
//             temp[k++] = arr[j++] ;
//             // k++ ; j++ ;
//         }

//         // copy tempary to original arrays
//         for( k=0 , i= si ; k<temp.length; k++  , i++){
//             arr[i] = temp[k];
//         }

//     }

//     public static void main(String[] args) {
//         int arr[] = { 4,1,3,9,7 } ;
//         mergeSort( arr, 0, arr.length-1 );
//         printArr(arr);
        
//     }
// }


    public static void main(String[]args) {
         int arr[]={3,7,2,9,5,6};
        mergesort(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }

    public static void mergesort(int arr[],int si, int ei) {
        if(si>=ei){
            return;
        }

        int midpoint=si+(ei-si)/2;
        mergesort(arr, si,midpoint);
        mergesort(arr, midpoint+1, ei);
        merge(arr, si, ei, midpoint);
        
    }

    public static void merge(int arr[],int si,int ei,int midpoint) {
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=midpoint+1;
        int k=0;

        while(i<=midpoint&& j<=ei){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
                
            }
            else{
                temp[k]=arr[j];
                j++;
                
            }
            k++;
        }

        while(i<=midpoint){
            temp[k++]=arr[i++];
        }

        while(j<=ei){
            temp[k++]=arr[j++];
        }

        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
}