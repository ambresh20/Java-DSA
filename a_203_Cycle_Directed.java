import java.util.* ;
@SuppressWarnings("unchecked")

public class a_203_Cycle_Directed {

    static class Edge{
        int src ;
        int dest ;

        public Edge(int s, int d){
            this.src = s ;
            this.dest = d ;
        }
    }

    // public static void createGraph(ArrayList<Edge> [] graph){ // Cycle - True 
    //     for(int i=0; i<graph.length ; i++){
    //         graph[i] = new ArrayList<>() ;
    //     }

    //     graph[0].add(new Edge(0, 2)) ;
       
    //     graph[1].add(new Edge(1, 0)) ;
 
    //     graph[2].add(new Edge(2, 3)) ;
 
    //     graph[3].add(new Edge(3, 0)) ;;
    // }

    // graph - 2 (false)
    public static void createGraph(ArrayList<Edge> [] graph){ // Cycle - True 
        for(int i=0; i<graph.length ; i++){
            graph[i] = new ArrayList<>() ;
        }

        graph[0].add(new Edge(0, 1)) ;
        graph[0].add(new Edge(0, 2)) ;
       
        graph[1].add(new Edge(1, 3)) ;
 
        graph[2].add(new Edge(2, 3)) ;
    }

    public static boolean isCycle(ArrayList<Edge> [] graph){
        boolean vist[] = new boolean[graph.length] ;
        boolean stack[] = new boolean[graph.length] ;

        for(int i=0; i<graph.length; i++){
            if(!vist[i]){
               if( isCycleUtil(graph, vist, i, stack) ){
                return true ;
               }
            }
        }

        return false ;
    }

    public static boolean isCycleUtil(ArrayList<Edge> [] graph, boolean vist[],
                                      int curr, boolean stack[] ){  // midifies dfs
        vist[curr] = true ;
        stack[curr] = true ;

        for(int i=0; i<graph[curr].size() ; i++){
            Edge e = graph[curr].get(i) ;
            if(stack[e.dest]) {   // cycle
                return true ;
            }
            if(!vist[e.dest] && isCycleUtil(graph, vist, e.dest, stack)){
                return true ;
            }
        }

        stack[curr] = false ;

        return false ;
    }

    public static void main(String[] args) {

        int V = 4 ;
        ArrayList<Edge>[] graph = new ArrayList[V] ;   // Null --> empty ArrayList
        createGraph(graph) ; 

        System.out.println(isCycle(graph));
        
    }
}
