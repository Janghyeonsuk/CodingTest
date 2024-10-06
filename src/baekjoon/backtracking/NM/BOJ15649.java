package baekjoon.backtracking.NM;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ15649 {
    static int N, M;
    static int[] arr;
    static boolean[] isused;

    public static void solve(int L) {
        if (L == M) {
            for (int x : arr)
                System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = 1; i <= N; i++) {
                if (!isused[i]) {
                    arr[L] = i;
                    isused[i] = true;
                    solve(L + 1);
                    isused[i] = false;
                }
            }

        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];
        isused = new boolean[N + 1];

        solve(0);
    }
}
