package inflearnCodingTest.DfsAndBfs;

import java.io.*;
import java.util.StringTokenizer;

public class DFS_3 {
    static int n, m, answer = Integer.MIN_VALUE;
    static int[] ps, pt;

    public static void DFS(int L, int sum, int time) {
        if (time > m) return;
        if (L == n) {
            answer = Math.max(answer, sum);
        } else {
            DFS(L + 1, sum, time);
            DFS(L + 1, sum + ps[L], time + pt[L]);
        }
    }

    public static void main(String[] args) throws IOException {
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

        DFS(0, 0, 0);
        System.out.print(answer);
    }
}
