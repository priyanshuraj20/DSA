//bipartite: if the graphs can coloured with the 2 color and no two adjacent nodes have the same color.
//so we will use color array instead of visited and can use dfs for each by passing color and return false if we get false 
import java.util.*;
public class Bipartite{ 
    public static boolean bipartite(ArrayList<Intger>[] graph,int col,int node,int[] color){
        color[node] = col;
        for(int neigh : graph[node]){
            if(color[neigh] == -1){
                if(!bipartite(graph, !col, node, color)) return false;
            }else if(color[neigh] == col) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int V;
        int color[] = new int[V];
        Arrays.fill(color,-1);
        for(int i =0; i < V; i++){
            if(!bipartite(graph, 0, i, color)){
                System.out.println("false");
            }
        }
        System.out.println("true");

    }
}