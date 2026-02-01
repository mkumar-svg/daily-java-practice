package daily_java_practice.graph.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSOfGraphUsingQueue {
	public static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
		ArrayList<Integer> bfs = new ArrayList<>();
		boolean[] visited = new boolean[V];
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(0);
		visited[0] = true;
		
		while(!queue.isEmpty()) {
			int node = queue.poll();
			bfs.add(node);
			
			for(int neighbour : adj.get(node)) {
				if(!visited[neighbour]) {
					visited[neighbour] = true;
					queue.add(neighbour);
				}
			}
		}
		
		return bfs;
	}
	
	public static void main(String[] args) {
		int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);

        ArrayList<Integer> result = bfsOfGraph(V, adj);

        for (int node : result) {
            System.out.print(node + " ");
        }
	}
}
