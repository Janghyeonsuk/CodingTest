package swea;

import java.util.*;
import java.io.*;

public class SWEA1204 {
    static int T;
    static int[] arr = new int[1000];
    static StringBuilder sb = new StringBuilder();

    public static void solution(int[] arr) {
        int[] cnt = new int[101];
        int max = Integer.MIN_VALUE;
        int idx = 0;
        int answer = 0;

        for (int i = 0; i < arr.length; i++)
            cnt[arr[i]]++;

        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] > max) {
                max = cnt[i];
                idx = i;
            } else if (cnt[i] == max) {
                idx = Math.max(idx, i);
            }
            answer = idx;
        }

        sb.append(answer).append("\n");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());

        int n = 0;
        for (int tc = 1; tc <= T; tc++) {
            n = Integer.parseInt(br.readLine());
            sb.append("#").append(n).append(" ");

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 1000; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            solution(arr);
        }

        System.out.println(sb);
        br.close();
    }
}

