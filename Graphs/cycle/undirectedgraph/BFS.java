package cycle.undirectedgraph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//Cycle Detection in undirected graph using bfs
public class BFS {
    
    public static boolean bfss(ArrayList<Main.Edge>[] Graph){
        int V = Graph.length;
    boolean[] visited = new boolean[V];
    for(int i = 0; i < V; i++){
        if(bfsUtil(Graph,visited,i,-1)) return true;
    }
    return false;
}
public static boolean bfsUtil(ArrayList<Main.Edge>[] graph, boolean[] vis,int src, int par){
    Queue<int[]> q = new LinkedList<>();
    q.add(new int[]{src,par});
    vis[src] = true;
    while(!q.isEmpty()){
        int curr[] = q.remove();
        int s = curr[0];
        int p = curr[1];
        for(Main.Edge e:graph[s]){
            if(!vis[e.des]){
                vis[e.des] = true;
                q.add(new int[]{e.des,s});
            }else if(vis[e.des] && e.des != p) return true;
        }
    }
    return false;
}
}
