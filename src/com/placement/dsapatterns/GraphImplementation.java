package com.placement.dsapatterns;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphImplementation {
    static class Edge{
        int src;
        int dest;

        Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }

   static void createGraph(ArrayList<Edge> graph[]){
         for(int i=0;i<graph.length;i++){
             graph[i]=new ArrayList<>();
         }
         graph[0].add(new Edge(0,2));
         graph[1].add(new Edge(2,0));
        graph[1].add(new Edge(2,1));
        graph[1].add(new Edge(2,3));
        graph[2].add(new Edge(3,2));
        graph[2].add(new Edge(3,1));
        graph[3].add(new Edge(1,2));
        graph[3].add(new Edge(1,3));
    }
    static void BFS(ArrayList<Edge> graph[], int v) {
        boolean[] visited = new boolean[v];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited[0] = true;
        while(!queue.isEmpty()) {
            int value = queue.remove();
            System.out.print(value + "->");
            for(int i = 0; i < graph[value].size(); i++) {
                Edge edge = graph[value].get(i);
                if(!visited[edge.dest]) {
                    queue.add(edge.dest);
                    visited[edge.dest] = true;
                }
            }
        }
    }

  static void dfs(ArrayList<Edge> graph[],int start,boolean visited[]){
        System.out.println(start);
        visited[start]=true;

        for(int i=0;i<graph[start].size();i++){
            Edge edge = graph[start].get(i);
            if(visited[edge.dest]==false) {
                dfs(graph, edge.dest, visited);
            }
        }
  }

    public static void main(String[] args) {
         int vertices=4;
        ArrayList graph[] =new ArrayList[vertices];
        boolean visited[]=new boolean[vertices];
        createGraph(graph);
        System.out.println("BFS Traversal:");
        BFS(graph, vertices);
        System.out.println("DFS Traversal:");
        dfs(graph,0,visited);
    }
}
