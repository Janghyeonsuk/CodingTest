package baekjoon.bfs;

import java.io.*;
import java.util.*;

public class BOJ4179 {
    static int n, m;
    static String[][] board;
    static int[][] dis1, dis2;
    static int dn = 4;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static Queue<Point> Q1 = new ArrayDeque<>();
    static Queue<Point> Q2 = new ArrayDeque<>();

    public void BFS1() {
        while (!Q1.isEmpty()) {
            Point p = Q1.poll();
            for (int k = 0; k < dn; k++) {
                int nx = p.x + dx[k];
                int ny = p.y + dy[k];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (dis1[nx][ny] >= 0 || board[nx][ny].equals("#")) continue;
                dis1[nx][ny] = dis1[p.x][p.y] + 1;
                Q1.offer(new Point(nx, ny));
            }
        }
    }

    public void BFS2() {
        while (!Q2.isEmpty()) {
            Point p = Q2.poll();
            for (int k = 0; k < dn; k++) {
                int nx = p.x + dx[k];
                int ny = p.y + dy[k];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                    System.out.println(dis2[p.x][p.y] + 1);
                    return;
                }

                if (dis2[nx][ny] >= 0 || board[nx][ny].equals("#")) continue;
                if (dis1[nx][ny] != -1 && dis1[nx][ny] <= dis2[p.x][p.y] + 1) continue;
                dis2[nx][ny] = dis2[p.x][p.y] + 1;
                Q2.offer(new Point(nx, ny));
            }
        }
        System.out.println("IMPOSSIBLE");
    }

    public static void main(String[] args) throws IOException {
        BOJ4179 T = new BOJ4179();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        board = new String[n][m];
        dis1 = new int[n][m];
        dis2 = new int[n][m];

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split("");
            for (int j = 0; j < m; j++) {
                dis1[i][j] = -1;
                dis2[i][j] = -1;
                board[i][j] = s[j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j].equals("F")) {
                    Q1.offer(new Point(i, j));
                    dis1[i][j] = 0;
                }
                if (board[i][j].equals("J")) {
                    Q2.offer(new Point(i, j));
                    dis2[i][j] = 0;
                }
            }
        }
        T.BFS1();
        T.BFS2();
    }
}

