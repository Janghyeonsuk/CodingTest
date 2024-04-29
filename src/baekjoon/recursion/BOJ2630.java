package baekjoon.recursion;

import java.io.*;
import java.util.*;

public class BOJ2630 {
    static int N;
    static int[][] paper;
    static int[] ans = new int[2];

    public static boolean check(int n, int x, int y) {
        if (n == 1)
            return true;
        else
            for (int i = x; i < x + n; i++)
                for (int j = y; j < y + n; j++)
                    if (paper[x][y] != paper[i][j])
                        return false;

        return true;
    }

    public static void solve(int n, int x, int y) {
        if (check(n, x, y)) {
            ans[paper[x][y]]++;
            return;
        }

        int half = n / 2;

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                solve(half, x + i * half, y + j * half);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        paper = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solve(N, 0, 0);

        for (int i : ans)
            System.out.println(i);
    }
}

