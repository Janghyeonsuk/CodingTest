package swea.D3;

import java.io.*;
import java.util.*;

public class SWEA20551 {
    static int T, A, B, C;
    static StringBuilder sb = new StringBuilder();

    public static void solve(int a, int b, int c) {
        int answer = 0;
        if (b < 2 || c < 3)
            sb.append(-1).append("\n");
        else {
            if (c <= b) {
                answer += b - c + 1;
                b -= b - c + 1;
            }
            if (b <= a) {
                answer += a - b + 1;
                a -= a - b + 1;
            }

            sb.append(answer).append("\n");
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        T = Integer.parseInt(st.nextToken());

        for (int t = 1; t <= T; t++) {
            sb.append("#").append(t).append(" ");
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            solve(A, B, C);
        }
        System.out.print(sb);
    }
}
