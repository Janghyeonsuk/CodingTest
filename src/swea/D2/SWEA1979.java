package swea.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA1979 {
    static StringBuilder sb = new StringBuilder();

    public static void solution(int n, int k, int[][] arr) {

        int answer = 0;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    cnt++;
                } else {
                    if (cnt == k) answer++;
                    cnt = 0;
                }
            }
            if (cnt == k) answer++;
        }


        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j][i] == 1) {
                    cnt++;
                } else {
                    if (cnt == k) answer++;
                    cnt = 0;
                }
            }
            if (cnt == k) answer++;
        }
        sb.append(answer + "\n");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#" + tc + " ");
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int[][] board = new int[n][n];
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    board[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            solution(n, k, board);
        }
        System.out.println(sb);
        br.close();
    }
}
