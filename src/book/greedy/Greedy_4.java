package book.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Greedy_4 {
    public static int solution(int n, int k) {
        int answer = 0;

        //1. 방법
//        while (n != 1) {
//            if (n % k == 0) {
//                n /= k;
//            } else {
//                n--;
//            }
//            answer++;
//        }
        //2. 방법

        while (true) {
            if (n < k) break;

            int target = (n / k) * k;
            answer += n - target;
            n = target;

            n /= k;
            answer++;
        }

        answer += (n - 1);

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        System.out.println(solution(N, K));
        br.close();
    }
}