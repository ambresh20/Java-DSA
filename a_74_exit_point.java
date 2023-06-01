public class a_74_exit_point {
    static void exitPoint(int arr[][]){
        int dir =0;  // e=0, s=1, w=2, n=3 ;
        int i= 0; 
        int j = 0;
        while(true){
            dir =  (dir+arr[i][j])%4 ;
            if(dir == 0){       // east
                j++ ;
            }
            else if(dir==1){    // south
                i++ ;
            }
            else if(dir==2){    //west
                j-- ;
            }
            else if(dir==3){    // North
                i-- ;
            }

                // Condition for exit index 
            if(i<0){
                i++; 
                break;
            }
            else if(j<0){
                j++; 
                break;
            }
            else if(i >arr.length){
                i-- ;
                break;
            }
            else if(j>arr[0].length){
                j-- ;
                break;
            }

        }
        System.out.println("Exit index at = ("+i +","+j + ")" );
    }
    public static void main(String[] args) {
        int [][]arr = {{0,0,1,0}, {1,0,0,1 }, {0,0,0,1 }, {1,0,1,0} } ;
        exitPoint(arr) ;

    
    }
}
