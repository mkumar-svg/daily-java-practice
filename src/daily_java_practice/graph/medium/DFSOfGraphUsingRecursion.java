package daily_java_practice.graph.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DFSOfGraphUsingRecursion {
	public static void dfs(int node, List<Integer>[] adj, boolean[] visited, List<Integer> result) {
		visited[node] = true;
		result.add(node);
		
		for(int neighbour : adj[node]) {
			if(!visited[neighbour]) {
				dfs(neighbour, adj, visited, result);
			}
		}
	}
	
	public static void main(String[] args) {
		int V = 5;
		
		@SuppressWarnings("unchecked")
		List<Integer>[] adj = new ArrayList[V];
		for(int i = 0; i < V; i++) {
			adj[i] = new ArrayList<>();
		}
		
		adj[0].addAll(Arrays.asList(1,2));
		adj[1].addAll(Arrays.asList(0,3));
		adj[2].addAll(Arrays.asList(0,4));
		adj[3].add(1);
		adj[4].add(2);
		
		boolean[] visited = new boolean[V];
		List<Integer> result = new ArrayList<>();
		
		dfs(0, adj, visited, result);
		
		for (int x : result) {
            System.out.print(x + " ");
        }
	}
}
