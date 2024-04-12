package inflearnCodingTest.TwoPointAndSlidingWindow;

import java.io.*;

public class TwoPoint_5 {
    //5. 연속된 자연수의 합
    public int solution(int n) {
        int answer = 0;
        int lt = 0;
        int m = n / 2 + 1;
        int[] arr = new int[m];
        for (int i = 0; i < m; i++)
            arr[i] = i + 1;

        int sum = 0;
        for (int rt = 0; rt < m; rt++) {
            sum += arr[rt];
            if (sum == n)
                answer++;
            while (sum >= n) {
                sum -= arr[lt++];
                if (sum == n)
                    answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        TwoPoint_5 T = new TwoPoint_5();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(T.solution(n)));

        bw.flush();
        bw.close();
        br.close();
    }
}