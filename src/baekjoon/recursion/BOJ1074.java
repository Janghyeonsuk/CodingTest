package baekjoon.recursion;

import java.io.*;
import java.util.*;

public class BOJ1074 {
    public static int func(int n, int r, int c) {
        if (n == 0)
            return 0;
        int half = (int) Math.pow(2, n - 1);

        if (r < half && c < half) return func(n - 1, r, c);
        else if (r < half && c >= half) return half * half + func(n - 1, r, c - half);
        else if (r >= half && c < half) return 2 * half * half + func(n - 1, r - half, c);
        else return 3 * half * half + func(n - 1, r - half, c - half);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        System.out.println(func(N, r, c));
    }
}

