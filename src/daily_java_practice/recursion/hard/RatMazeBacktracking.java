package daily_java_practice.recursion.hard;

import java.util.ArrayList;
import java.util.List;

public class RatMazeBacktracking {
	static boolean isSafe(int x, int y, int n, int[][] maze, int[][] visited) {
        return (x >= 0 && x < n &&
                y >= 0 && y < n &&
                maze[x][y] == 1 &&
                visited[x][y] == 0);
    }

    static void solve(int x, int y, int n, int[][] maze,
                      int[][] visited, String path,
                      List<String> result) {

        if (x == n - 1 && y == n - 1) {
            result.add(path);
            return;
        }

        visited[x][y] = 1;

        if (isSafe(x + 1, y, n, maze, visited)) {
            solve(x + 1, y, n, maze, visited, path + "D", result);
        }

        if (isSafe(x, y - 1, n, maze, visited)) {
            solve(x, y - 1, n, maze, visited, path + "L", result);
        }

        if (isSafe(x, y + 1, n, maze, visited)) {
            solve(x, y + 1, n, maze, visited, path + "R", result);
        }

        if (isSafe(x - 1, y, n, maze, visited)) {
            solve(x - 1, y, n, maze, visited, path + "U", result);
        }

        visited[x][y] = 0;
    }

    static List<String> findPaths(int[][] maze) {

        int n = maze.length;
        List<String> result = new ArrayList<>();
        int[][] visited = new int[n][n];

        if (maze[0][0] == 1) {
            solve(0, 0, n, maze, visited, "", result);
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}
        };

        List<String> paths = findPaths(maze);

        for (String path : paths) {
            System.out.print(path + " ");
        }
    }
}
