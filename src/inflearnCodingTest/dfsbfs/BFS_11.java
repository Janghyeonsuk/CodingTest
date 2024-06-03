package inflearnCodingTest.dfsbfs;

import java.io.*;
import java.util.*;

public class BFS_11 {
    static int dn = 4;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int[][] dis = new int[8][8];
    static int[][] board = new int[8][8];

    public static void BFS(int x, int y) {
        Queue<Point> Q = new LinkedList<>();
        Q.offer(new Point(x, y));
        board[x][y] = 1;
        while (!Q.isEmpty()) {
            Point p = Q.poll();
            for (int i = 0; i < dn; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
                    Q.offer(new Point(nx, ny));
                    board[nx][ny] = 1;
                    dis[nx][ny] = dis[p.x][p.y] + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 1; i <= 7; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 7; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        BFS(1, 1);

        if (dis[7][7] != 0) System.out.print(dis[7][7]);
        else System.out.print("-1");
    }
}
