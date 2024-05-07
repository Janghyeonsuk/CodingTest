package baekjoon.backtracking;

import java.util.*;
import java.io.*;

public class BOJ9663 {
    static int N, cnt;
    static boolean[] isused1, isused2, isused3;

    public static void solve(int cur) {
        if (cur == N) {
            cnt++;
            return;
        }

        for (int i = 0; i < N; i++) {
            if (isused1[i] || isused2[cur + i] || isused3[cur - i + N - 1])
                continue;
            isused1[i] = true;
            isused2[cur + i] = true;
            isused3[cur - i + N - 1] = true;
            solve(cur + 1);
            isused1[i] = false;
            isused2[cur + i] = false;
            isused3[cur - i + N - 1] = false;
        }

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        solve(0);
        System.out.print(cnt);

        br.close();
    }
}
