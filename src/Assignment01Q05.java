public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        int n = m.length;
        int[] visited = new int[n];
        for (int k = 0; k < n; k++) {
            visited[k] = n;
        }
        visited[i] = 0;

        findShortestPathRec(m, i, j, visited, 0);
        if (visited[j] < n)
            return visited[j];
        return -1;
    }

    private static void findShortestPathRec(int[][] m, int start, int finish, int[] visited, int count) {
        if (start == finish) {
            return;
        }

        for (int k = 0; k < m.length; k++) {
            if (m[start][k] == 1 && visited[k] > count + 1) {
                visited[k] = count + 1;
                findShortestPathRec(m, k, finish, visited, count + 1);
            }
        }

    }

    public static void main(String[] args) {
        System.out.println(
                findShortestPath(new int[][] { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }, 0, 1)); // -1
        System.out.println(
                findShortestPath(new int[][] { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }, 1, 1)); // 0
        System.out.println(
                findShortestPath(new int[][] { { 0, 1, 0, 0 }, { 0, 0, 1, 0 }, { 0, 0, 0, 1 }, { 1, 0, 0, 0 } }, 0, 2)); // 2
        System.out.println(
                findShortestPath(new int[][] { { 0, 1, 0, 1 }, { 0, 0, 0, 1 }, { 0, 0, 0, 0 }, { 0, 0, 1, 0 } }, 0, 2)); // 2
    }
}