package swea;

import java.util.*;
import java.io.*;

public class SWEA1244 {
    static int T, max, chance;
    static String[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void solution(int k, int cnt) {
        if (cnt == chance) {
            String answer = "";
            for (String s : arr) {
                answer += s;
            }
            max = Math.max(max, Integer.parseInt(answer));
            return;
        }

        for (int i = k; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                swap(i, j);
                solution(i, cnt + 1);
                swap(i, j);
            }
        }
    }

    private static void swap(int i, int j) {
        String tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            st = new StringTokenizer(br.readLine());
            arr = st.nextToken().split("");
            chance = Integer.parseInt(st.nextToken());

            if (arr.length < chance)
                chance = arr.length;

            solution(0, 0);
            sb.append("#").append(tc).append(" ").append(max).append("\n");
            max = 0;
        }

        System.out.println(sb);
        br.close();
    }
}
