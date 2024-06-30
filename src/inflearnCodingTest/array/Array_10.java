package inflearnCodingTest.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array_10 {
    // 10. 봉우리

    static int n;
    static int[][] board;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int dn = 4;

    public static int solution(int[][] board) {
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for (int k = 0; k < dn; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
                    if (board[nx][ny] >= board[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) cnt++;
            }
        }

        return cnt;
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

        System.out.println(solution(board));
    }

}
