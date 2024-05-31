package inflearnCodingTest.DfsAndBfs;

import java.io.*;
import java.util.StringTokenizer;


public class DFS_6 {
    static int n, m;
    static int[] pm, arr;
    static boolean[] ch;

    public static void DFS(int L) {
        if (L == m) {
            for (int i = 0; i < m; i++)
                System.out.print(pm[i] + " ");
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if (!ch[i]) {
                    ch[i] = true;
                    pm[L] = arr[i];
                    DFS(L + 1);
                    ch[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        ch = new boolean[n];
        pm = new int[m];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        DFS(0);
    }
}

