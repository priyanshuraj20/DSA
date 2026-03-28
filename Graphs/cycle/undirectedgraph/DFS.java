package cycle.undirectedgraph;

import java.util.ArrayList;

public class DFS{
    

    public static boolean dfss(ArrayList<Main.Edge>[] Graph){
        int V = Graph.length;
        boolean visited[] = new boolean[V];
        for(int i =0; i < V; i++){
            if(!visited[i]){
                if(dfsUtil(Graph,visited,i,-1)) return true;
            }
        }
        return false;
    }
    private static boolean dfsUtil(ArrayList<Main.Edge>[] Graph,boolean vis[],int node, int parent){
        vis[node] = true;
        System.out.println(node);
        for(int i =0 ; i < Graph[node].size(); i++){
            Main.Edge curr = Graph[node].get(i);
            if(!vis[curr.des]){
                dfsUtil(Graph, vis, curr.des,node);
            }else if(vis[curr.des] && curr.des != parent) return true;
        }
        return false;
    }
}
