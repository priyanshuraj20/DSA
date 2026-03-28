import java.util.*;
public class GraphANDTraversal{
    static class Edge{
        int src;
        int des;
        int w;
        Edge(int s, int d, int w){
            this.src = s;
            this.des = d;
            this.w = w;
        }
    }
    public static void main(String[] args){
        int V = 5;
        ArrayList<Edge>[] Graph = new ArrayList[V];
        for(int i =0; i < V; i++){
            Graph[i] = new ArrayList<>();
        }
        Graph[0].add(new Edge(0,1,1));
        Graph[0].add(new Edge(0,2,1));
        Graph[1].add(new Edge(1,2,1));
        Graph[2].add(new Edge(2,3,1));
        Graph[2].add(new Edge(2,4,1));
        Graph[3].add(new Edge(3,1,1));
        Graph[3].add(new Edge(3,4,1));

        for(int i =0; i < V; i++){
            ArrayList<Edge> curr = Graph[i];
            for(Edge e: curr){
                System.out.println("src:"+e.src+"des"+e.des);
            }

        }
        //dfs
        dfs(Graph);
        //bfs
        System.out.println("BFS:");
        bfs(Graph);
    }
    //Traversal: TC :O(V+E);
    private static void dfs(ArrayList<Edge>[] Graph){
        int V = Graph.length;
        boolean visited[] = new boolean[V];
        for(int i =0; i < V; i++){
            if(!visited[i]){
                dfsUtil(Graph,visited,i);
            }
        }
    }
    private static void dfsUtil(ArrayList<Edge>[] Graph,boolean vis[],int node){
        vis[node] = true;
        System.out.println(node);
        for(int i =0 ; i < Graph[node].size(); i++){
            Edge curr = Graph[node].get(i);
            if(!vis[curr.des]){
                dfsUtil(Graph, vis, curr.des);
            }
        }
    }
    private static void bfs(ArrayList<Edge>[] Graph){
        int V= Graph.length;
        boolean[] visited = new boolean[V];
        for(int i =0; i < V; i++){
            if(!visited[i]){
                bfsUtil(Graph,visited,i);
            }
        }
    }
    private static void bfsUtil(ArrayList<Edge>[] Graph,boolean[] vis, int node){
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        vis[node] = true;
        while(!q.isEmpty()){
            int curr = q.remove();
            System.out.println(curr);
            
            for(Edge e : Graph[curr]){
                if(!vis[e.des]){
                    vis[e.des] = true;
                     q.add(e.des);
                }
            }

        }
    }
}
