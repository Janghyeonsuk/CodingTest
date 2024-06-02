package inflearnCodingTest.DfsAndBfs;

import java.io.*;
import java.util.*;

public class BFS_13 {
    static int n, answer = 0;
    static int dn = 8;
    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
    static int[][] board;
    static Queue<Point> Q = new LinkedList<>();

    public static void BFS(int x, int y) {
        board[x][y] = 0;
        Q.offer(new Point(x, y));
        while (!Q.isEmpty()) {
            Point p = Q.poll();
            for (int i = 0; i < dn; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
                    board[nx][ny] = 0;
                    Q.offer(new Point(nx, ny));
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        board = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    BFS(i, j);
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}
