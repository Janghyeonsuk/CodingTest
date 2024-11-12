package baekjoon.dp;

import java.io.*;
import java.util.*;

public class BOJ_2293 {
    static int n, money;
    static int[] dp, coins;

    public static void solution() {
        for (int i = 0; i < n; i++) {
            for (int j = coins[i]; j <= money; j++) {
                dp[j] += dp[j - coins[i]];
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        money = Integer.parseInt(st.nextToken());

        coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        dp = new int[money + 1];
        dp[0] = 1;

        solution();
        System.out.println(dp[money]);
    }
}

