package inflearnCodingTest.DfsAndBfs;

import java.io.*;
import java.util.StringTokenizer;

public class DFS_2 {
    static int c, n, answer = Integer.MIN_VALUE;
    static int[] arr;

    public static void DFS(int L, int sum) {
        if (sum > c) return;
        if (L == n) {
            answer = Math.max(answer, sum);
        } else {
            DFS(L + 1, sum + arr[L]);
            DFS(L + 1, sum);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        c = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(br.readLine());

        DFS(0, 0);
        System.out.print(answer);
    }
}