import java.util.* ;
@SuppressWarnings("unchecked")

public class a_202_Bipartite {

    static class Edge{
        int src ;
        int dest ;

        public Edge(int s, int d){
            this.src = s ;
            this.dest = d ;
        }
    }

    public static void createGraph(ArrayList<Edge> [] graph){
        for(int i=0; i<graph.length ; i++){
            graph[i] = new ArrayList<>() ;
        }

        // 0 - vertex 
        graph[0].add(new Edge(0, 1)) ;
        graph[0].add(new Edge(0, 2)) ;
       

        // 1 - vertex 
        graph[1].add(new Edge(1, 0)) ;
        graph[1].add(new Edge(1, 3)) ;
 
        // 2 - vertex 
        graph[2].add(new Edge(2, 0)) ;
        graph[2].add(new Edge(2, 4)) ;
 
        // 3 - vertex 
        graph[3].add(new Edge(3, 1)) ;
        // graph[3].add(new Edge(3, 4)) ;
 
        // 4 - vertex 
        // graph[4].add(new Edge(4, 3)) ;
        graph[4].add(new Edge(4, 2)) ;
    }

    public static boolean isBipartite(ArrayList<Edge> graph []){

        int col[] = new int[graph.length] ;
        for(int i=0; i<col.length; i++){
            col[i] = -1 ;  // No colour
        }

        Queue<Integer> q = new LinkedList<>() ;

        for(int i=0; i<graph.length; i++){
            if(col[i] == -1){  // BFS
                q.add(i) ;
                col[i] = 0 ;  // yellow colour 

                while(!q.isEmpty()){
                    int curr = q.remove() ;
                    for(int j=0; j<graph[curr].size(); j++){  // neighbours
                        Edge e = graph[curr].get(j) ;  // e.dest

                        if(col[e.dest] == -1){   // case 3
                            int nextCol = col[curr] == 0 ? 1 : 0   ;
                            col[e.dest] = nextCol ;
                            q.add(e.dest) ;
                        }
                        else if(col[e.dest] == col[curr]){  // case 1
                            return false ;  // Not bipartite Graphs
                        }
                       // case 3 col[e.dest] != col[curr]  --> No Actions : Continue
                    }
                }

            }
        }

        return true  ;
    }

    public static void main(String[] args) {
        /*
                      0 ----- 2
                      |       |
                      |       |
                      1       4
                       \     /
                        \   /
                          3
                        False 
         */
        
        int V = 5 ;
        ArrayList<Edge>[] graph = new ArrayList[V] ;   // Null --> empty ArrayList
        createGraph(graph) ; 
 
        System.out.println(isBipartite(graph));

    }
}
