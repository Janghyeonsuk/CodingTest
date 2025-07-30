package baekjoon.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ14889 {
    static int min = Integer.MAX_VALUE;
    static int N;
    static int[][] arr;
    static boolean[] visited;

    public static void dfs(int L, int start) {
        if (L == N / 2) {
            calcDiff();
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

    public static void calcDiff() {
        int startSum = 0;
        int linkSum = 0;

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (visited[i] && visited[j]) {
                    startSum += arr[i][j] + arr[j][i];
                } else if (!visited[i] && !visited[j]) {
                    linkSum += arr[i][j] + arr[j][i];
                }
            }
        }
        min = Math.min(min, Math.abs(startSum - linkSum));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        visited = new boolean[N];
        arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0);

        System.out.println(min);
    }
}

