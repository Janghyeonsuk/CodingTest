package inflearnCodingTest.DfsAndBfs;

import java.io.*;
import java.util.StringTokenizer;


public class DFS_4 {
    static int[] pm;
    static int n, m;

    public static void DFS(int L) {
        if (L == m) {
            String tmp = "";
            for (int i = 0; i < m; i++)
                tmp += pm[i] + " ";
            System.out.println(tmp);
        } else {
            for (int i = 1; i <= n; i++) {
                pm[L] = i;
                DFS(L + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        pm = new int[m];
        DFS(0);
    }
}

