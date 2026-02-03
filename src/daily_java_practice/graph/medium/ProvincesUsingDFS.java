package daily_java_practice.graph.medium;

import java.util.ArrayList;
import java.util.List;

public class ProvincesUsingDFS {
	public static void dfs(int node, List<List<Integer>> adjList, boolean[] visited) {
		visited[node] = true;
		
		for(int neghbour : adjList.get(node)) {
			if(!visited[neghbour]) {
				dfs(neghbour, adjList, visited);
			}
		}
	}
	
	public static int countProvinces(int[][] adjMatrix, int V) {
		List<List<Integer>> adjList = new ArrayList<>();
		for(int i = 0; i < V; i++) {
			adjList.add(new ArrayList<>());
		}
		
		for(int i = 0; i < V; i++) {
			for(int j = 0; j < V; j++) {
				if(adjMatrix[i][j] == 1 && i != j) {
					adjList.get(i).add(j);
				}
			}
		}
		
		boolean[] visited = new boolean[V];
		int provinces = 0;
		
		for(int i = 0; i < V; i++) {
			if(!visited[i]) {
				provinces++;
				dfs(i, adjList, visited);
			}
		}
		
		return provinces;
	}
	
	public static void main(String[] args) {

        int[][] adj = {
            {1, 0, 1},
            {0, 1, 0},
            {1, 0, 1}
        };

        int V = 3;

        System.out.println(countProvinces(adj, V)); 
    }
}
