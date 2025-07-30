package programmers.lv3.BFS;

import java.util.*;

public class 아이템줍기 {
    static final int SIZE = 101;
    int[][] map = new int[SIZE][SIZE];
    boolean[][] visited = new boolean[SIZE][SIZE];
    int[] dx = {0, 0, -1, 1};
    int[] dy = {1, -1, 0, 0};

    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        for (int[] rect : rectangle) {
            int x1 = rect[0] * 2, y1 = rect[1] * 2, x2 = rect[2] * 2, y2 = rect[3] * 2;

            draw(x1, y1, x2, y2);
        }
        return bfs(characterX * 2, characterY * 2, itemX * 2, itemY * 2);
    }

    public int bfs(int sx, int sy, int ix, int iy) {
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{sx, sy, 0});
        visited[sy][sx] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();

            int x = cur[0];
            int y = cur[1];
            int dist = cur[2];

            if (x == ix && y == iy) return dist / 2;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < SIZE && ny >= 0 && ny < SIZE && !visited[ny][nx] && map[ny][nx] == 1) {
                    visited[ny][nx] = true;
                    q.offer(new int[]{nx, ny, dist + 1});
                }
            }
        }
        return 0;
    }


    public void draw(int sx, int sy, int ex, int ey) {
        for (int y = sy + 1; y < ey; y++) {
            for (int x = sx + 1; x < ex; x++) {
                map[y][x] = 2;
            }
        }

        for (int y = sy; y <= ey; y++) {
            for (int x = sx; x <= ex; x++) {
                if (x == sx || x == ex || y == sy || y == ey) {
                    if (map[y][x] != 2) {
                        map[y][x] = 1;
                    }
                }
            }
        }
    }
}