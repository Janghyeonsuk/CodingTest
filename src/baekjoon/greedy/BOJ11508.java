package baekjoon.greedy;

import java.util.*;
import java.io.*;

public class BOJ11508 {
    static int N, answer;
    static Integer[] arr;

    public static void solution() {
        for (int i = 0; i < N; i++) {
            if (i % 3 == 2) continue;
            answer += arr[i];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new Integer[N];
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr, Collections.reverseOrder());
        solution();
        System.out.println(answer);
        br.close();
    }
}

