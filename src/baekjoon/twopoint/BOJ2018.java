package baekjoon.twopoint;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2018 {
    static int N;

    public static int solution(int N) {
        int ans = 1;
        int lt = 1, rt = 1; //투포인터 설정
        int sum = 1; //sum: 합, cnt: 가지수(정답)
        while (rt != N) {
            if (sum == N) {
                ans++;
                rt++;
                sum += rt;
            } else if (sum > N) {
                sum -= lt;
                lt++;
            } else {
                rt++;
                sum += rt;
            }
        }

        return ans;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        System.out.println(solution(N));
    }
}

