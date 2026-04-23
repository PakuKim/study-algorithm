import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        int[] rowDir = {1, -1, 0, 0};
        int[] colDir = {0, 0, 1, -1};
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];
        
        queue.add(new int[]{0, 0, 1});
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int r = current[0];
            int c = current[1];
            int dist = current[2];

            if (r == n - 1 && c == m - 1) return dist;

            for (int i = 0; i < 4; i++) {
                int row = r + rowDir[i];
                int col = c + colDir[i];

                if ((row >= 0 && row < n) && (col >= 0 && col < m) && 
                    !visited[row][col] && maps[row][col] != 0) {
                    visited[row][col] = true;
                    queue.add(new int[]{row, col, dist + 1});
                }
            }
        }
        
        return -1;
    }
}