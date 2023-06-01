import java.util.* ;

public class a_198_DFS {

    static class Edge{
        int src ;
        int dest ;
        int wt ;

        public Edge(int s, int d, int w){
            this.src = s ;
            this.dest = d ;
            this.wt = w ;
        }
    }

    public static void createGraph(ArrayList<Edge> [] graph){
        for(int i=0; i<graph.length ; i++){
            graph[i] = new ArrayList<>() ;
        }

        // 0 - vertex 
        graph[0].add(new Edge(0, 1, 5)) ;

        // 1 - vertex 
        graph[1].add(new Edge(1, 0, 5)) ;
        graph[1].add(new Edge(1, 2, 1)) ;
        graph[1].add(new Edge(1, 3, 3)) ;
 
        // 2 - vertex 
        graph[2].add(new Edge(2, 1, 1)) ;
        graph[2].add(new Edge(2, 3, 1)) ;
        graph[2].add(new Edge(2, 4, 2)) ;
 
        // 3 - vertex 
        graph[3].add(new Edge(3, 1, 3)) ;
        graph[3].add(new Edge(3, 2, 1)) ;
 
        // 4 - vertex 
        graph[4].add(new Edge(4, 2, 1)) ;
    }

    public static void dfs(ArrayList<Edge> [] graph, int curr, boolean vist[]){
        // visit 
        System.out.print(curr +" ");
        vist[curr] = true ;
      
        for(int i=0; i<graph[curr].size() ; i++){
            Edge e = graph[curr].get(i) ;
            if(!vist[e.dest]){
                dfs(graph, e.dest, vist) ;
            }
        }
    }

    public static void main(String[] args) {
        int V = 5 ;
        ArrayList<Edge>[] graph = new ArrayList[V] ;   // Null --> empty ArrayList

       createGraph(graph) ; 
       dfs(graph, 0, new boolean[V]);
        

    }
}

