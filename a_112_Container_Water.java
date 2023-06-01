import java.util.ArrayList;
// Container with most Waters

public class a_112_Container_Water {
    // public static int storeWater(ArrayList<Integer> height) {
    //     int maxWater = 0 ;
    //   // brute force  Time Complexity -> O(n^2)
    //     for(int i=0; i<height.size(); i++){  // Line 1
    //         for(int j=i+1; j<height.size(); j++){    // Line 2
    //             int ht = Math.min(height.get(i), height.get(j) ) ;
    //             int width = j - i ;
    //             int currWater = ht*width ;
    //             maxWater = Math.max( maxWater, currWater) ;
    //         }
    //     }
    //     return maxWater ;
    // }

    public static int storeWater(ArrayList<Integer> height){
        int maxWater = 0;
        int lp = 0;                     // Left point 
        int rp = height.size() - 1 ;   // Right point 

        while(lp<rp){
           // Calculating water's
           int ht = Math.min(height.get(lp), height.get(rp)) ;
           int width = rp - lp ;
           int currWater = ht*width ;
           maxWater = Math.max(maxWater, currWater) ;

           // updates points 
           if( height.get(lp) < height.get(rp)){
               lp++ ;
           }
           else{
                rp-- ;
           }
    
        }

        return maxWater ;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>() ;
        //   1,8,6,2,5,4,8,3,7
        height.add(1) ;
        height.add(8) ;
        height.add(6) ;
        height.add(2) ;
        height.add(5) ;
        height.add(4) ;
        height.add(8) ;
        height.add(3) ;
        height.add(7) ;
        
        System.out.println(storeWater(height));

    }
}
