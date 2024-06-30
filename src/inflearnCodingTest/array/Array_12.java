package inflearnCodingTest.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array_12 {
    // 12. 멘토링

    static int n, m;
    static int[][] board;

    public static int solution(int n, int m) {
        int ans = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int cnt = 0;
                if (i != j) {
                    for (int k = 0; k < m; k++) {
                        int pi = 0, pj = 0;
                        for (int l = 0; l < n; l++) {
                            if (board[k][l] == i) pi = l;
                            if (board[k][l] == j) pj = l;
                        }
                        if (pi < pj) cnt++;
                    }
                }
                if (cnt == m) ans++;
            }
        }


        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        board = new int[m][n];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(solution(n, m));
    }
}
