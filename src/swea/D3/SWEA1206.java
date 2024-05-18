package swea.D3;

import java.util.*;
import java.io.*;

public class SWEA1206 {
    static int T = 10;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void solution(int n, int[] building) {
        int answer = 0;
        for (int i = 2; i < n - 2; i++) {
            int max = Math.max(building[i - 2], Math.max(building[i - 1], Math.max(building[i + 1], building[i + 2])));
            if (building[i] > max)
                answer += building[i] - max;
        }
        sb.append(answer).append("\n");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = 0;
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#").append(tc).append(" ");
            n = Integer.parseInt(br.readLine());
            arr = new int[n];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            solution(n, arr);
        }

        System.out.println(sb);
        br.close();
    }
}

