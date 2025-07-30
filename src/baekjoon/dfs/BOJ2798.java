package baekjoon.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ2798 {
    static int answer = 0;
    static int N, M;
    static int[] arr;
    static boolean[] visited;

    public static void dfs(int L, int start) {
        if (L == 3) {
            cal();
            return;
        }

        for (int i = start; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(L + 1, i + 1);
                visited[i] = false;
            }
        }
    }

    public static void cal() {
        int sum = 0;

        for (int i = 0; i < N; i++) {
            if (visited[i]) {
                sum += arr[i];
            }
        }

        if (sum <= M) {
            answer = Math.max(answer, sum);
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        visited = new boolean[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 0);

        System.out.println(answer);
    }
}
