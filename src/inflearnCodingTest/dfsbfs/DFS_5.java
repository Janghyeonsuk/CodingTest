package inflearnCodingTest.dfsbfs;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;


public class DFS_5 {
    static int n, m, answer = Integer.MAX_VALUE;
    static Integer[] coin;

    public static void DFS(int L, int sum) {
        if (sum > m) return;
        if (L >= answer) return; // 이미 수보다 큰 경우는 필요 x
        if (sum == m) {
            answer = Math.min(answer, L);
        } else {
            for (int i = 0; i < n; i++) {
                DFS(L + 1, sum + coin[i]);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        coin = new Integer[n];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++)
            coin[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(coin, Collections.reverseOrder());
        m = Integer.parseInt(br.readLine());
        DFS(0, 0);
        System.out.println(answer);
    }
}

