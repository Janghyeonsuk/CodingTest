package InflearnCodingTest.TwoPointAndSlidingWindow;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SlidingWindow_3 {
    //3. 최대 매출
    public int solution(int n, int k, int[] arr) {
        int answer = Integer.MIN_VALUE;
        /*int lt = 0, rt = k;

        while (rt <= n) {
            int sum = 0;
            for (int i = lt; i < rt; i++)
                sum += arr[i];

            answer = Math.max(sum, answer);
            lt++;
            rt++;
        }*/

        int sum = 0;

        for (int i = 0; i < k; i++)
            sum += arr[i];

        answer = sum;

        for (int i = k; i < n; i++) {
            sum += arr[i] - arr[i - k];
            answer = Math.max(sum, answer);
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        SlidingWindow_3 T = new SlidingWindow_3();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());


        bw.write(String.valueOf(T.solution(n, k, arr)));

        bw.flush();
        bw.close();
        br.close();
    }
}
