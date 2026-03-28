package cycle.undirectedgraph;

import java.util.*;

public class Main {

    static class Edge {

        int src, des;

        Edge(int s, int d) {
            src = s;
            des = d;
        }
    }

    public static void main(String[] args) {

        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));
        graph[2].add(new Edge(3, 1));
        graph[2].add(new Edge(3, 4));
        graph[2].add(new Edge(3, 5));
        graph[2].add(new Edge(4, 2));
        graph[2].add(new Edge(4, 3));
        graph[2].add(new Edge(4, 5));
        graph[2].add(new Edge(5, 3));
        graph[2].add(new Edge(5, 4));
        graph[2].add(new Edge(5, 6));
        graph[2].add(new Edge(6, 5));

        boolean cycle  = BFS.bfss(graph);
        System.out.println("Using BFS: " + cycle);
        boolean cycle2 = DFS.dfss(graph);
        System.out.println("using DFS:" + cycle2);


    }

}
