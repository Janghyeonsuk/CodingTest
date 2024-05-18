package swea.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA2005 {
    static StringBuilder sb = new StringBuilder();

    public static void solution(int n) {
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j || j == 0)
                    arr[i][j] = 1;
                else
                    arr[i][j] = i;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                sb.append(arr[i][j] + " ");
            }
            sb.append("\n");
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#" + tc + "\n");
            int n = Integer.parseInt(br.readLine());
            solution(n);
        }
        System.out.println(sb);
        br.close();
    }
}

