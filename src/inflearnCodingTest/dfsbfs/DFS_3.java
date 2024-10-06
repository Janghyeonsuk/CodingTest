package inflearnCodingTest.dfsbfs;

import java.io.*;
import java.util.StringTokenizer;

public class DFS_3 {
    static int n, m, answer = Integer.MIN_VALUE;
    static int[] ps, pt;

    public void DFS(int L, int sSum, int tSum) {
        if (tSum > m) return;
        if (L == n) answer = Math.max(answer, sSum);
        else {
            DFS(L + 1, sSum, tSum);
            DFS(L + 1, sSum + ps[L], tSum + pt[L]);
        }
    }

    public static void main(String[] args) throws IOException {
        DFS_3 T = new DFS_3();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        ps = new int[n];
        pt = new int[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            ps[i] = Integer.parseInt(st.nextToken());
            pt[i] = Integer.parseInt(st.nextToken());
        }

        T.DFS(0, 0, 0);
        System.out.print(answer);
    }
}
