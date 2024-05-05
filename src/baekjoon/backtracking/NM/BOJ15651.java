package baekjoon.backtracking.NM;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ15651 {
    static int N, M;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void solve(int k) {
        if (k == M) {
            for (int i = 0; i < M; i++)
                sb.append(arr[i] + " ");
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= N; i++) {
                arr[k] = i;
                solve(k + 1);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N + 1];

        solve(0);
        System.out.print(sb);
    }
}
