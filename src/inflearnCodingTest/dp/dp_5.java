package inflearnCodingTest.dp;

import java.io.*;
import java.util.*;

public class dp_5 {
    static int n, money;
    static int[] dp, coins;

    public static void solution() {
        for (int i = 0; i < n; i++) {
            for (int j = coins[i]; j <= money; j++) {
                if (dp[j - coins[i]] != Integer.MAX_VALUE)
                    dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        coins = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            coins[i] = Integer.parseInt(st.nextToken());
        }

        money = Integer.parseInt(br.readLine());

        dp = new int[money + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        solution();
        System.out.println(dp[money] != Integer.MAX_VALUE ? dp[money] : -1);
    }
}

