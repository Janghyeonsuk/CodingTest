package baekjoon.recursion;

import java.io.*;
import java.util.*;

public class BOJ1780 {
    static int N;
    static int[][] paper;
    static int[] cnt = new int[3];

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
            cnt[++paper[x][y]]++;
            return;
        }
        int t = n / 3;

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                solve(t, x + i * t, y + j * t);

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

        for (int i : cnt)
            System.out.println(i);
    }
}


