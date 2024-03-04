package InflearnCodingTest.TwoPointAndSlidingWindow;

import java.util.Scanner;

public class TwoPoint_5 {
    //5. 연속된 자연수의 합
    public int solution(int n) {
        int lt = 0;
        int answer = 0;
        int sum = 0;
        int m = n / 2 + 1;
        int[] arr = new int[m];

        for (int i = 0; i < m; i++)
            arr[i] = i + 1;

        for (int rt = 0; rt < m; rt++) {
            sum += arr[rt];
            if (sum == n)
                answer++;
            while (sum >= n) {
                sum -= arr[lt++];
                if (sum == n) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        TwoPoint_5 main = new TwoPoint_5();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(main.solution(n));
    }

}
