package daily_java_practice.recursion.hard;

import java.util.Arrays;

public class GraphColoringBacktracking {
	private static boolean isSafe(int node, int[] color, boolean[][] graph, int n, int col) {
		for(int k = 0; k < n; k++) {
			if(k != node && graph[k][node] && color[k] == col) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean solve(int node, int[] color, int m, int n, boolean[][] graph) {
		if(node == n) {
			return true;
		}
		
		for(int col = 1; col <= m; col++) {
			if(isSafe(node, color, graph, n, col)) {
				color[node] = col;
				
				if(solve(node + 1, color, m, n, graph)) {
					return true;
				}
				
				color[node] = 0;
			}
		}
		return false;
	}
	
	public static boolean canColorGraph(boolean[][] graph, int m, int n) {
		int[] color = new int[n];
		Arrays.fill(color, 0);
		return solve(0, color, m, n, graph);
	}
	
	public static void main(String[] args) {
        int n = 4;
        int m = 3;

        boolean[][] graph = new boolean[101][101];
        graph[0][1] = graph[1][0] = true;
        graph[1][2] = graph[2][1] = true;
        graph[2][3] = graph[3][2] = true;
        graph[3][0] = graph[0][3] = true;
        graph[0][2] = graph[2][0] = true;

        System.out.println(canColorGraph(graph, m, n));
    }
}
