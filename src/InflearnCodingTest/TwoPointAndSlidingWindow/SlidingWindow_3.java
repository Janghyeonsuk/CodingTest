package InflearnCodingTest.TwoPointAndSlidingWindow;

import java.util.Scanner;

public class SlidingWindow_3 {
    //3. 최대 매출
    public int solution(int n, int k, int[] arr) {
        /*int lt = 0, rt = k;
        int max = Integer.MIN_VALUE;

        while (rt < n) {
            int sum = 0;

            for (int i = lt; i < rt; i++)
                sum += arr[i];

            max = Math.max(max, sum);
            lt++;
            rt++;
        }*/

        int sum = 0;
        int answer = 0;

        for (int i = 0; i < k; i++)
            sum += arr[i];
        answer = sum;
        for (int i = k; i < n; i++) {
            sum += (arr[i] - arr[i - k]);
            answer = Math.max(answer, sum);
        }

        return answer;
    }

    public static void main(String[] args) {
        SlidingWindow_3 main = new SlidingWindow_3();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(main.solution(n, k, arr));
    }
}
