import java.util.*;
public class a_arrays {
    public static void digitSum(int N){
    //     Scanner sc = new Scanner(System.in);
    //     int arr[] = new int[N];

    //     for(int i=0; i<N; i++){
    //         arr[i] = sc.nextInt();
    //     }

    //     for(int i=0; i<N ; i++){
    //         int sum = 0;
    //         int num  = arr[i] ;
    //      while(num>0){
    //        int ld = num % 10 ;
    //         sum += ld ;
    //         num = num/10; 
            
    //       }
    //         System.out.print(sum + " ");
    //     }

    //     sc.close();
    // 
}

    public static void indexLaegest(int arr[] , int index){
        int a[] = new int[arr.length-1-index];
        int i = 0;
        for(int j=index+1; j<arr.length; j++){
            a[i] = arr[j] ;
            i++;
        }
        Arrays.sort(a);
        // int firstlargest = Integer.MIN_VALUE;
        for(int k=0; k<a.length; k++){
            if(arr[index] < a[k]){
                System.out.print(a[k]);
                break ;
            }
          
        }
       
    }

    static void butter_fly(int N){
        // // first half
        // for(int i=1; i<=N; i++){
        //     // to print stars

        //     // stars (i)
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     // spaces 2 * N-i
        //     for(int k=1; k<= 2*(N-i); k++){
        //         System.out.print(" ");
        //     }
        //     // stars (i)
        //     for(int l=1; l<=i; l++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // second half 
        for(int i=N; i>=1; i--){
            // to print 

            // number
            for(int j=1 ; j<=i; j++){
                System.out.print(j);
            }
            // star
            for(int k=2; k<= 2*(N-i) + 1; k++){
                System.out.print("*");
            }
            // number
            for(int l=i; l>=1; l--){
                System.out.print(l);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
    //    int arr[] = {31,22,3,4,12,6,23,11,39};
    //    int index = 6;
    //    indexLaegest(arr, index);

    butter_fly(9);



    
    }
}
