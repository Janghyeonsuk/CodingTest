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

        for (int i = 1; i <= n; i++) { //현재 학생
            for (int j = 1; j <= n; j++) { //비교할 학생
                int cnt = 0;//현재 학생이 비교학생보다 시험을 잘본 횟수
                if (i != j) { // 둘이 겹치지 않도록
                    for (int k = 0; k < m; k++) { // 문제
                        int pi = 0, pj = 0;
                        for (int l = 0; l < n; l++) { // 학생 등수 기록
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
