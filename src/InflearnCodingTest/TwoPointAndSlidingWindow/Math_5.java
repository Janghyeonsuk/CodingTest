package InflearnCodingTest.TwoPointAndSlidingWindow;

import java.util.Scanner;

public class Math_5 {
    //5. 연속된 자연수의 합
    public int solution(int n) {
        int answer = 0;
        int cnt = 1;
        n--;

        while(n > 0) {
            cnt++;
            n -= cnt;
            if(n%cnt == 0)
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Math_5 main = new Math_5();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(main.solution(n));
    }
}
