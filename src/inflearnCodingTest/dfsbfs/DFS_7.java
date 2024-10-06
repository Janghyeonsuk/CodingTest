package inflearnCodingTest.dfsbfs;

import java.io.*;
import java.util.StringTokenizer;


public class DFS_7 {
    static int[][] memo = new int[34][34];

    public static int DFS(int n, int r) {
        if (memo[n][r] != 0) return memo[n][r];
        if (n == r || r == 0) return 1;
        else return memo[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        System.out.print(DFS(n, r));
    }
}
