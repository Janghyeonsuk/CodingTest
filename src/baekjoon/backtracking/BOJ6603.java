package baekjoon.backtracking;

import java.io.*;
import java.util.*;

public class BOJ6603 {
    static int N;
    static int[] input;
    static int[] arr = new int[6];
    static StringBuilder sb = new StringBuilder();

    public static void solve(int cnt, int cur) {
        if (cnt == 6) {
            for (int val : arr)
                sb.append(val).append(" ");
            sb.append("\n");
            return;
        }

        for (int i = cur; i < N; i++) {
            arr[cnt] = input[i];
            solve(cnt + 1, i + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            if (N == 0) break;

            input = new int[N];

            for (int i = 0; i < N; i++)
                input[i] = Integer.parseInt(st.nextToken());

            solve(0, 0);
            sb.append(" ");
        }

        System.out.print(sb);
    }
}
