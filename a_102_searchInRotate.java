// search in Rotate sorted arrays
public class a_102_searchInRotate {

    public static int search(int arr[], int key, int si, int ei){
        if(si>ei){    // base case
            return -1;
        }
        
        // kaam
        int mid = si + (ei-si)/2 ;    // or (si + ei)/2 

        // Case Found 
        if( arr[mid] == key ){
            return mid ;
        }

        // mid on L1 
        if(arr[si] <= arr[mid]){
              // case a : left side
            if(arr[si] <= key  && key <= arr[mid] ){
               return search(arr, key, si, mid-1) ;
            }
            // Case b : right side
            else{
               return search(arr, key, mid+1, ei) ;
            }
            
        }


        // mid on L2
        else{
            // case c : right side
            if(arr[mid] >= key && key <= arr[ei] ) {
                return search(arr, key, mid+1, ei) ;
            }
            // case d : left side 
            else{
                return search(arr, key, si, mid-1) ;
            }

        }
 
    }
    public static void main(String[] args) {
        int arr[] = { 5,6,7,8,9,10,1,2,3 };
        int key = 10 ;
        int tIdx = search(arr, key, 0, arr.length-1) ;
        System.out.println(tIdx);
        

    }
}
