package swea.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA2001 {
    static StringBuilder sb = new StringBuilder();

    public static void solution(int n, int m, int[][] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i <= n - m; i++) {
            for (int j = 0; j <= n - m; j++) {
                int sum = 0;
                for (int k = i; k < i + m; k++) {
                    for (int l = j; l < j + m; l++) {
                        sum += arr[k][l];
                    }
                }
                max = Math.max(sum, max);
            }
        }


        sb.append(max + "\n");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#" + tc + " ");
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[][] arr = new int[n][n];

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }

            }
            solution(n, m, arr);

        }
        System.out.println(sb);
        br.close();
    }
}

