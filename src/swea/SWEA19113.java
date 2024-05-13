package swea;

import java.io.*;
import java.util.*;

public class SWEA19113 {
    static int T, N;
    static long[] arr;
    static boolean[] isused;
    static StringBuilder sb = new StringBuilder();

    public static void solution(long[] arr) {
        for (int i = 0; i < N * 2; i++) {
            if (isused[i]) continue;
            long origin = (arr[i] / 3L) * 4L;
            for (int j = i + 1; j < N * 2; j++) {
                if (!isused[j] && arr[j] == origin) {
                    isused[i] = true;
                    isused[j] = true;
                    sb.append(arr[i] + " ");
                    break;
                }
            }
        }
        sb.append("\n");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#" + tc + " ");
            N = Integer.parseInt(br.readLine());
            arr = new long[N * 2];
            isused = new boolean[N * 2];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N * 2; i++)
                arr[i] = Long.parseLong(st.nextToken());

            solution(arr);
        }

        System.out.println(sb);
        br.close();
    }
}
