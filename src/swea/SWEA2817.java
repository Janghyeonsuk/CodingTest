package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA2817 {
    static int N, K, cnt;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void solution(int idx, int sum) {
        if (idx == N) {
            if (sum == K) cnt++;
            return;
        }

        solution(idx + 1, sum);
        solution(idx + 1, sum + arr[idx]);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#" + tc + " ");
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            arr = new int[N];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(st.nextToken());
            cnt = 0;
            solution(0, 0);
            sb.append(cnt + "\n");
        }

        System.out.println(sb);
        br.close();
    }
}
