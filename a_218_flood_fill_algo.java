// Flood Fill Algorithms for image coloring 

public class a_218_flood_fill_algo {

	public static void helper(int[][] image, int sr, int sc, int color, boolean vist[][], int orgCol){
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length ||
        vist[sr][sc] || image[sr][sc] != orgCol ) {
            return ;
        }
        
        vist[sr][sc] = true ;
        image[sr][sc] = color ;
        // left 
        helper(image , sr , sc-1, color, vist, orgCol) ;
        // right
        helper(image , sr , sc+1, color, vist, orgCol) ;
        // top
        helper(image , sr-1 , sc, color, vist, orgCol) ;
        // bottom
        helper(image , sr+1 , sc, color, vist, orgCol) ;
        
    }
    
    public static void floodFill(int[][] image, int sr, int sc, int newColor){
        // Code here
        boolean vist[][] = new boolean[image.length][image[0].length] ;
        helper(image, sr, sc, newColor, vist, image[sr][sc] ) ;
        
        // return image ;
    }

	public static void main(String[] args) {
		int image[][] = { {1, 1, 1 },
		                  {1, 1, 0 } ,
		                  {1, 0, 1 } } ;

		for(int i=0; i<3; i++){
		    for(int j=0; j<3; j++){
			    System.out.print(image[i][j] + " ");
		    }
		    System.out.println();
		}

		System.out.println();

		floodFill(image, 1, 1, 2);
		
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.print(image[i][j] + " ");
			}
			System.out.println();
		}
	}
}
