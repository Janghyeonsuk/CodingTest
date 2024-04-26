package baekjoon.recursion;

import java.io.*;
import java.util.*;

public class BOJ1629 {
    static long a, b, c;

    public static long pow(long a, long b, long c) {
        if (b == 1)
            return a % c;
        long val = pow(a, b / 2, c);
        val = val * val % c;
        if (b % 2 == 0)
            return val;

        return val * a % c;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        System.out.println(pow(a, b, c));
    }
}


