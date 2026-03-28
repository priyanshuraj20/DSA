import java.util.*;
public class createGraph{
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
        Graph[0].add(new Edge(1,2,1));
        Graph[0].add(new Edge(2,3,1));
        Graph[0].add(new Edge(2,4,1));
        Graph[0].add(new Edge(3,1,1));
        Graph[0].add(new Edge(3,4,1));

        for(int i =0; i < V; i++){
            ArrayList<Edge> curr = Graph[i];
            for(Edge e: curr){
                System.out.println("src:"+e.src+"des"+e.des);
            }
        }
    }
}