package baekjoon.backtracking;
import java.io.*;
import java.util.*;

public class BOJ1182 {
    static int N, S, cnt;
    static int[] arr;

    public static void solve(int cur, int sum) {
        if (cur == N) {
            if (sum == S) cnt++;
            return;
        }

        solve(cur + 1, sum);
        solve(cur + 1, sum + arr[cur]);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        solve(0, 0);
        if (S == 0) cnt--;
        System.out.print(cnt);
    }
}

