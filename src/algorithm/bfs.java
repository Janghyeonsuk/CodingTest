package algorithm;

import java.util.ArrayDeque;
import java.util.Queue;

public class bfs {
    // 상, 하, 좌, 우 탐색을 위한 방향 벡터
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        // 2차원 배열 예제 (1은 갈 수 있는 경로, 0은 갈 수 없는 경로)
        int[][] grid = {
                {1, 1, 1, 1},
                {1, 0, 1, 1},
                {0, 1, 1, 0},
                {0, 1, 1, 1},
        };

        // 방문 정보
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        // 예시로 (0, 0)부터 탐색 시작
        bfs(0, 0, visited, grid);
    }

    public static void bfs(int x, int y, boolean[][] visited, int[][] grid) {
        Queue<Point> queue = new ArrayDeque<>();
        queue.offer(new Point(x, y));
        // 현재 위치를 방문했다고 표시
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            Point p = queue.poll();
            System.out.println("방문 위치: (" + p.x + ", " + p.y + ")");

            // 현재 위치에서 인접한 위치 탐색
            for (int d = 0; d < 4; d++) {
                int nx = p.x + dx[d];
                int ny = p.y + dy[d];

                // 배열 범위 안에 있고 방문하지 않았다면 큐에 넣고 탐색
                if (0 <= nx && nx < grid.length && 0 <= ny && ny < grid[0].length && !visited[nx][ny] && grid[nx][ny] == 1) {
                    queue.offer(new Point(nx, ny));
                    visited[nx][ny] = true;
                }
            }
        }
    }
}
