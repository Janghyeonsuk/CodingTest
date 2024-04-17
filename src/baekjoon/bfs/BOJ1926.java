package baekjoon.bfs;

import java.io.*;
import java.util.*;

//Flood fill 유형
public class BOJ1926 {
    static int n, m, cnt, max;
    static int[][] board;            // 도화지 배열
    static boolean[][] vis;      // 방문처리 배열
    static int dn = 4;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public void BFS(int x, int y) {
        cnt++;
        vis[x][y] = true;
        Queue<Point> Q = new ArrayDeque<>();
        Q.offer(new Point(x, y));
        int size = 0;

        while (!Q.isEmpty()) {
            size++;
            Point p = Q.poll();
            for (int k = 0; k < dn; k++) {
                int nx = p.x + dx[k];
                int ny = p.y + dy[k];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 1 && !vis[nx][ny]) {
                    Q.offer(new Point(nx, ny));
                    vis[nx][ny] = true;
                }
            }
        }
        max = Math.max(max, size);
    }

    public static void main(String[] args) throws IOException {
        BOJ1926 T = new BOJ1926();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        board = new int[n][m];
        vis = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m; y++) {
                if (board[x][y] == 1 && !vis[x][y])
                    T.BFS(x, y);
            }
        }

        System.out.println(cnt);
        System.out.println(max);
    }
}
