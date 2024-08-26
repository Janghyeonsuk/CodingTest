package baekjoon.structure.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ1546 {
    static int n;

    public static double solution(int M, Integer[] arr) {
        double ans = 0;
        double sum = 0;

        for (Integer num : arr) {
            sum += num;
        }

        ans = sum / M * 100 / n;

        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        Integer[] score = new Integer[n];

        for (int i = 0; i < n; i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(score, Collections.reverseOrder());
        int max = score[0];

        System.out.println(solution(max, score));
    }

}
