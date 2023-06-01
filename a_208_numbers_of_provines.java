import java.util.* ;
@SuppressWarnings("unchecked")

public class a_208_numbers_of_provines {

    static class Edge{
        int src ;
        int dest ;
        int wt ;

        public Edge(int s, int d ,int w){
            this.src = s ;
            this.dest = d ;
            this.wt = w ;
        }
    }

    public static void createGraph(ArrayList<Edge> graph []){
        for(int i=0; i<graph.length ; i++){
            graph[i] = new ArrayList<>() ;
        }

        graph[0].add(new Edge(0, 1, 2)) ;
        graph[0].add(new Edge(0, 2, 4)) ;

        graph[1].add(new Edge(1, 2, 1)) ;
        graph[1].add(new Edge(1, 3, 7)) ;


        graph[2].add(new Edge(2, 4 , 3)) ;
       
        graph[3].add(new Edge(3, 5, 1)) ;
 
        graph[4].add(new Edge(4, 3, 2)) ;
        graph[4].add(new Edge(4, 5, 5)) ;

    }

    public static int numberprovines(ArrayList<Edge> [] graph){
        boolean vist[] = new boolean[graph.length] ;
        int count = 0 ;

        for(int i=0; i<graph.length ; i++){
            if(!vist[i]){
                count++ ;
                dfsUtil(graph, i , vist);
            }
        }
        
       return count ; 
    }

    public static void dfsUtil(ArrayList<Edge> [] graph, int curr, boolean vist[]){ 
        vist[curr] = true ;
      
        for(int i=0; i<graph[curr].size() ; i++){
            Edge e = graph[curr].get(i) ;
            if(!vist[e.dest]){
                dfsUtil(graph, e.dest, vist) ;
            }
        }
    }


    public static void main(String[] args) {
        int V = 6 ;
        ArrayList<Edge>[] graph = new ArrayList[V] ;   // Null --> empty ArrayList
    
        createGraph(graph) ; 
        numberprovines(graph) ;

    }
}
