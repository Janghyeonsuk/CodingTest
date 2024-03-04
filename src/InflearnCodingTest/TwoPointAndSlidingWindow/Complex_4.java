package InflearnCodingTest.TwoPointAndSlidingWindow;

import java.util.Scanner;

public class Complex_4 {
    //4. 연속 부분 수열
    public int solution(int n, int m, int[] arr) {
        int lt = 0;
        int answer = 0, sum = 0;
        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == m)
                answer++;
            while (sum >= m) {
                sum -= arr[lt++];
                if (sum == m)
                    answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Complex_4 main = new Complex_4();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(main.solution(n, m, arr));
    }
}
