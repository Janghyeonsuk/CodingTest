package inflearnCodingTest.DfsAndBfs;

import java.io.*;
import java.util.StringTokenizer;


public class DFS_9 {
    static int n, m;
    static int[] combi;

    public static void DFS(int L, int st) {
        if (L == m) {
            for (int x : combi)
                System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = st; i <= n; i++) {
                combi[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        combi = new int[m];
        DFS(0, 1);
    }
}
