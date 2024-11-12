package baekjoon.dp;

import java.io.*;
import java.util.*;

class Brick implements Comparable<Brick> {
    public int s, h, w;
    public int num;

    public Brick(int s, int h, int w, int num) {
        this.s = s;
        this.h = h;
        this.w = w;
        this.num = num;
    }

    @Override
    public int compareTo(Brick o) {
        return o.s - this.s;
    }
}

public class BOJ_2655 {
    static int n;
    static int[] dp;
    static ArrayList<Brick> bricks;
    static ArrayList<Integer> list;

    public static void solution() {
        dp[0] = bricks.get(0).h;

        int ans = dp[0];
        for (int i = 1; i < n; i++) {
            int max_h = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (bricks.get(j).w > bricks.get(i).w && dp[j] > max_h)
                    max_h = dp[j];
            }
            dp[i] = max_h + bricks.get(i).h;
            ans = Math.max(ans, dp[i]);
        }

        for (int i = n - 1; i >= 0; i--) {
            if (dp[i] == ans) {
                list.add(bricks.get(i).num);
                ans -= bricks.get(i).h;
            }
        }

    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        dp = new int[n];
        bricks = new ArrayList<>();
        list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            bricks.add(new Brick(s, h, w, i));
        }

        Collections.sort(bricks);
        solution();

        System.out.println(list.size());
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}

