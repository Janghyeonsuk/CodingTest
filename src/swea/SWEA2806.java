package swea;

import java.io.*;

public class SWEA2806 {
    static int T = 10;
    static int N, cnt;
    static boolean[] isused1, isused2, isused3;
    static StringBuilder sb = new StringBuilder();

    public static void solution(int cur) {
        if (cur == N) {
            cnt++;
            return;
        }

        for (int i = 0; i < N; i++) {
            if (isused1[i] || isused2[cur + i] || isused3[cur - i + N - 1])
                continue;
            isused1[i] = true;
            isused2[cur + i] = true;
            isused3[cur - i + N - 1] = true;
            solution(cur + 1);
            isused1[i] = false;
            isused2[cur + i] = false;
            isused3[cur - i + N - 1] = false;

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#" + tc + " ");
            N = Integer.parseInt(br.readLine());
            isused1 = new boolean[30];
            isused2 = new boolean[30];
            isused3 = new boolean[30];

            solution(0);
            sb.append(cnt + "\n");
            cnt = 0;
        }
        System.out.println(sb);
        br.close();
    }
}

