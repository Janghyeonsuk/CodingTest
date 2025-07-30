package baekjoon.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2661 {
    static int N;
    static boolean flag = false;

    public static void dfs(String cur) {
        if (flag) return;

        if (cur.length() == N) {
            System.out.println(cur);
            flag = true;
            return;
        }

        for (int i = 1; i <= 3; i++) {
            String next = cur + i;
            if (isGood(next)) {
                dfs(next);
            }
        }
    }

    public static boolean isGood(String s) {
        int len = s.length();
        for (int i = 1; i <= len / 2; i++) {
            String front = s.substring(len - i * 2, len - i);
            String back = s.substring(len - i);
            if (front.equals(back)) return false;
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        dfs("");
    }
}
