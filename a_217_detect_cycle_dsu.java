import java.util.ArrayList;

// Cycle Detection Using Disjoint set ds (Union find algorithms)

public class a_217_detect_cycle_dsu {

	static class Edge {
        int src ;
        int dest ;
        int wt ;

        public Edge(int s, int d ,int w){
            this.src = s ;
            this.dest = d ;
            this.wt = w ;
        }

    }

	public static void createGraph(ArrayList<Edge> edges ) {
		// edges 
		edges.add(new Edge(0, 1, 10)) ;
		edges.add(new Edge(0, 2, 15)) ;
		edges.add(new Edge(0, 3, 30)) ;
		edges.add(new Edge(1, 3, 40)) ;
		edges.add(new Edge(2, 3, 50)) ;
		
	}

	static int n = 4 ;
	static int par[] = new int[n] ;
	static int rank[] = new int[n] ;

	public static void init(){
		for(int i=0; i<n; i++){
			par[i] = i ;
		}
	}

	public static int find(int x ){
		if(x == par[x]){
			return x ;
		}

		// return find(par[x]) ;  
		return par[x] = find(par[x]) ;      // path compression
	}

	public static void union(int a , int b){
		int parA = find(a) ;
		int parB = find(b) ;

		if(rank[parA] == rank[parB]) {
			par[parB] = parA ;
			rank[parA]++ ;
		}
		else if(rank[parA] > rank[parB]){
			par[parB] = parA ;
		}
		else{
			par[parA] = parB ;
		}
	}	

	public static int isCycle(ArrayList<Edge> edges){
        // Iterate through all edges of graph, find subset of both vertices of every edge, if both subsets are same, then there is cycle in graph.
        for (int i = 0; i < edges.size()-1; ++i) {
            int x = find(edges.get(i).src) ;   // e.src
            int y = (edges.get(i).dest) ;  // e.dest
 
            if (x == y)
                return 1;
 
            union(x, y) ;
        }

        return 0;
    }

	public static void main(String[] args) {
		init() ; 
        
        ArrayList<Edge> edges = new ArrayList<>() ;
		// createGraph(edges); 
 
        // add edge 0-1
        edges.get(0).src = 0;
        edges.get(0).dest = 1;
 
        // add edge 1-2
        edges.get(1).src = 1;
        edges.get(1).dest = 2;
 
        // add edge 0-2
        edges.get(2).src = 0;
        edges.get(2).dest = 2;
 
        if (isCycle(edges) == 1)
            System.out.println("Graph contains cycle");
        else
            System.out.println(
                "Graph doesn't contain cycle");
    

	}
}
