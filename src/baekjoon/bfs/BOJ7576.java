package baekjoon.bfs;

import java.io.*;
import java.util.*;

// 시작점이 여러개일때
public class BOJ7576 {
    static int n, m, day;
    static int[][] board, dis;            // 도화지 배열
    static int dn = 4;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static Queue<Point> Q = new ArrayDeque<>();

    public void BFS() {
        while (!Q.isEmpty()) {
            Point p = Q.poll();
            for (int i = 0; i < dn; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    Q.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[p.x][p.y] + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BOJ7576 T = new BOJ7576();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        board = new int[n][m];
        dis = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
                if (board[i][j] == 1)
                    Q.offer(new Point(i, j));
            }
        }
        T.BFS();
        boolean flag = true;
        day = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 0) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    day = Math.max(day, dis[i][j]);
                }
            }
        } else
            day = -1;
        System.out.println(day);
    }
}
