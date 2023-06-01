public class a_91_isSorted {
    public static boolean isSort(int arr[] , int i){
        if(i == arr.length -1){         // base case 
            return true;
        }
        if(arr[i]> arr[i+1]){           //  check for sorted.
            return false;
        }

        return isSort(arr , i+1);       // recursion.
    }
    public static void main(String[] args) {
        int arr[] = {11,3,5,7,9};
        System.out.println(isSort(arr, 0));
        
    }
}
