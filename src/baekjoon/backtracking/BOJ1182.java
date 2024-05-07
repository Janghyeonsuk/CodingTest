package baekjoon.backtracking;

import java.io.*;
import java.util.*;

public class BOJ1182 {
    static int N, S, cnt;
    static int[] arr;

    public static void solve(int k) {
        if (k == S) {
            cnt++;
            return;
        }


    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        solve(0);
        System.out.println(cnt);
    }
}


