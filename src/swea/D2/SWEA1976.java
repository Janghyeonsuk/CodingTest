package swea.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA1976 {
    static StringBuilder sb = new StringBuilder();

    public static void solution(int h1, int m1, int h2, int m2) {
        int h = h1 + h2;
        int m = m1 + m2;

        if (m > 60) {
            h++;
            m = m1 + m2 - 60;
        }

        if (h > 12) h -= 12;

        sb.append(h + " " + m + "\n");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#" + tc + " ");
            st = new StringTokenizer(br.readLine());
            int h1 = Integer.parseInt(st.nextToken());
            int m1 = Integer.parseInt(st.nextToken());
            int h2 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());

            solution(h1, m1, h2, m2);
        }
        System.out.println(sb);
        br.close();
    }
}

