package DAA_LAB;

import java.util.Arrays;

public class FloydWarshall {
     static int V = 4;
     static int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        int[][] graph = {
                {0, 3, INF, 7},
                {8, 0, 2, INF},
                {5, INF, 0, 1},
                {2, INF, INF, 0}
            };


        int[][] shortestDistances = floydWarshall(graph);

        System.out.println("Shortest distances between all pairs of vertices:");
        printSolution(shortestDistances);
    }

    public static int[][] floydWarshall(int[][] graph) {
        int[][] dist = Arrays.copyOf(graph, V);

        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    if (dist[i][k] != INF && dist[k][j] != INF && dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        return dist;
    }

    public static void printSolution(int[][] dist) {
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (dist[i][j] == INF) {
                    System.out.print("INF  ");
                } else {
                    System.out.print(dist[i][j] + "    ");
                }
            }
            System.out.println();
        }
    }
}
