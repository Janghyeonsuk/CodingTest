package baekjoon.recursion;

import java.io.*;
import java.util.*;

public class BOJ11729 {
    static int cnt = 0;
    static StringBuilder sb = new StringBuilder();

    public static void func(int a, int b, int n) {
        if (n == 1) {
            cnt++;
            sb.append(a + " " + b).append("\n");
            return;
        }
        func(a, 6 - a - b, n - 1);
        sb.append(a + " " + b).append("\n");
        cnt++;
        func(6 - a - b, b, n - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        func(1, 3, N);
        System.out.println(cnt);
        System.out.print(sb);
    }
}


