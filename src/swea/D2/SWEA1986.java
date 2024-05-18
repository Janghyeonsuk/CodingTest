package swea.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA1986 {
    static StringBuilder sb = new StringBuilder();

    public static void solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) answer += i;
            else answer -= i;
        }

        sb.append(answer + "\n");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#" + tc + " ");
            int n = Integer.parseInt(br.readLine());
            solution(n);
        }
        System.out.println(sb);
        br.close();
    }
}

