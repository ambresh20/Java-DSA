import java.util.* ;
@SuppressWarnings("unchecked") 

public class a_201_Cycle_Undirected {

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
        // graph[0].add(new Edge(0, 2)) ;
        graph[0].add(new Edge(0, 3)) ;

        // 1 - vertex 
        graph[1].add(new Edge(1, 0)) ;
        graph[1].add(new Edge(1, 2)) ;
 
        // 2 - vertex 
        // graph[2].add(new Edge(2, 0)) ;
        graph[2].add(new Edge(2, 1)) ;
 
        // 3 - vertex 
        graph[3].add(new Edge(3, 0)) ;
        graph[3].add(new Edge(3, 4)) ;
 
        // 4 - vertex 
        graph[4].add(new Edge(4, 3)) ;
    }

    public static boolean detectCycle(ArrayList<Edge> [] graph){
        boolean vist[] = new boolean[graph.length] ;
        for(int i=0; i<graph.length ; i++){
            if(!vist[i]){
                if( detectCycleUtil(graph, vist, i, -1 ) ){
                    return true ;
                    // cycle exits in one of the part 
                }
            }
        }

        return false ;
    }

    public static boolean detectCycleUtil(ArrayList<Edge> [] graph, boolean vist[], int curr, int par){

        vist[curr] = true ;

        for(int i=0; i<graph[curr].size() ; i++){
            Edge e = graph[curr].get(i) ;
            // case 3 
            if(!vist[e.dest]) {
                if(detectCycleUtil(graph, vist, e.dest, curr)){
                    return true ;
                }
            }
            // case 1
            else if(vist[e.dest] && e.dest != par){
                return true ;
            }
            // case 2  -> do nothing -> continue 
        }

        return false ;
    }

    public static void main(String[] args) {
        /*
                              1 ---- 3
                           /  |      |
                         0    |      |
                           \  |      |
                              2      4
         */


        int V = 7 ;
        ArrayList<Edge>[] graph = new ArrayList[V] ;   // Null --> empty ArrayList
       createGraph(graph) ; 

       System.out.println(detectCycle(graph));

    }
}
