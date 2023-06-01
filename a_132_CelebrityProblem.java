import java.util.Stack;

public class a_132_CelebrityProblem {

    public static int isCelebrity(int arr[][]){
        Stack<Integer> s = new Stack<>() ; 
        for(int i=0; i<arr.length ; i++){
            s.push(i) ;
        }

        while(s.size() >= 2){
            int i = s.pop() ;
            int j = s.pop() ;

            if(arr[i][j] == 1){
                // if i known j --> i is a not celebrity
                s.push(j)  ;

            }
            else{
                // if i does not known j --> j is a not celebrity 
                s.push(i) ;
            }
        }

        int pot = s.pop() ;
        for(int i=0; i<arr.length; i++){
            if(i != pot){ 
                if(arr[i][pot] == 0  || arr[pot][i] == 1 ){
                    return 0;    // None
                }

            }
        }

       return pot ;     // sout( pot )
    }
    public static void main(String[] args) {
        int arr[][] = { {0, 1, 1, 1, 1},
                        {1, 0, 0, 1, 0},
                        {1, 0, 0, 1, 0},
                        {0, 0, 0, 0, 0},
                        {0, 1, 0, 1, 0}
                    } ;
        
        System.out.println(isCelebrity(arr)); 


    }
}
