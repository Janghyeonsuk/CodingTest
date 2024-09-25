package inflearnCodingTest.twopointSlidingwindow;

import java.io.*;

public class TwoPoint_5 {
    //5. 연속된 자연수의 합
    public static int solution(int n) {
        int ans = 0;
        int sum = 0;
        int lt = 1;
        int max = n / 2 + 1;

        for (int rt = 1; rt <= max; rt++) {
            sum += rt;
            if (sum == n) ans++;

            while (sum >= n) {
                sum -= lt++;
                if (sum == n)
                    ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(solution(n));
    }
}