package baekjoon.bfs;

import java.io.*;
import java.util.*;

//거리 측정 유형
public class BOJ2178 {
    static int n, m;
    static int[][] board, dis;            // 도화지 배열
    static int dn = 4;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public void BFS(int x, int y) {
        Queue<Point> Q = new ArrayDeque<>();
        Q.offer(new Point(x, y));
        while (!Q.isEmpty()) {
            Point p = Q.poll();
            for (int i = 0; i < dn; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                if (nx > 0 && nx <= n && ny > 0 && ny <= m && board[nx][ny] == 1) {
                    board[nx][ny] = 0;
                    Q.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[p.x][p.y] + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BOJ2178 T = new BOJ2178();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        board = new int[n + 1][m + 1];
        dis = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            String[] s = br.readLine().split("");
            for (int j = 1; j <= m; j++) {
                board[i][j] = Integer.parseInt(s[j - 1]);
            }
        }

        T.BFS(1, 1);
        System.out.println(dis[n][m] + 1);
    }
}

