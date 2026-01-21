public class aktivitas4 {
    static final int INF = 9999;

    public static void floydWarshall(int[][] dist) {
        int V = dist.length;
        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
            System.out.println("Iterasi k = " + k);
            printMatrix(dist);
            System.out.println("-------------------------");
        }
    }

    public static void printMatrix(int[][] dist) {
        for (int[] row : dist) {
            for (int val : row) {
                if (val == INF) System.out.print("INF ");
                else System.out.print(val + "   ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 2, 5, INF, INF},
            {2, 0, 2, 4, INF},
            {5, 2, 0, INF, 3},
            {INF, 4, INF, 0, 1},
            {INF, INF, 3, 1, 0}
        };

        System.out.println("Matriks Awal:");
        printMatrix(graph);
        System.out.println("=========================");
        
        floydWarshall(graph);
    }
}