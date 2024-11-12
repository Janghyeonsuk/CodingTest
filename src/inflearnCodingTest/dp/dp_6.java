package inflearnCodingTest.dp;

import java.io.*;
import java.util.*;

public class dp_6 {
    static int n, m;
    static int[] dp;

    public static void solution(List<int[]> problems) {
        for (int[] problem : problems) {
            int ps = problem[0];
            int pt = problem[1];
            for (int j = m; j >= pt; j--) {
                dp[j] = Math.max(dp[j], dp[j - pt] + ps);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        dp = new int[m + 1];

        List<int[]> problems = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int ps = Integer.parseInt(st.nextToken());
            int pt = Integer.parseInt(st.nextToken());
            problems.add(new int[]{ps, pt});
        }

        solution(problems);

        System.out.println(dp[m]);
    }
}
