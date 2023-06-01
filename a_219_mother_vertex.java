import java.util.* ;

public class a_219_mother_vertex {

	public static void addEdge(int u , int v, ArrayList<ArrayList<Integer>> adj){
		adj.get(u).add(v) ;
	}

	public static void DFSUtil(ArrayList<ArrayList<Integer>> adj, int v, boolean visit[]){

		visit[v] = true ;

		for(int x : adj.get(v)){
			if (!visit[x]){
				DFSUtil(adj, x, visit);
			}
		}

	}

	public static int motherVertex(ArrayList<ArrayList<Integer>> adj, int V){

		boolean visit[] = new boolean[V] ;
        int v = -1 ;

		for(int i=0; i<V; i++){
			if(!visit[i]){
				DFSUtil(adj, i, visit);
				v = i ;
			}
		}

		boolean check[] = new boolean[V] ;
		DFSUtil(adj, v, check);

		for(boolean val : check){
			if (!val){
				return -1;
			}
		}

		return v; 
	}

	public static void main(String[] args) {
		int V = 7 ;
		// int E = 8 ;

		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>() ;

		for(int i=0; i<V; i++){
			adj.add(new ArrayList<>()) ;
		}

		addEdge(0, 1,adj) ;
		addEdge(0, 2,adj) ;
		addEdge(1, 3,adj) ;
		addEdge(4, 1,adj) ;
		addEdge(6, 4,adj) ;
		addEdge(5, 6,adj) ;
		addEdge(5, 2,adj) ;
		addEdge(6, 0,adj) ;
		
		System.out.println("Mother vertex is "+ motherVertex(adj, V));

	}
}
