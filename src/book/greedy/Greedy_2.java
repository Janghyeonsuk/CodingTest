package book.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Greedy_2 {
    public static int solution(int n, int m, int k, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int cnt = k;
        int first = arr[n - 1];
        int second = arr[n - 2];

        //1. 방법
//        while (m-- > 0) {
//            if (cnt != 0) {
//                answer += first;
//                cnt--;
//            } else {
//                answer += second;
//                cnt = k;
//            }
//        }
        // 2. 방법
        // 가장 큰수가 더해지는 횟수를 수열을 파악해 계산
        int count = m / (k + 1) * k + m % (k + 1);

        answer += count * first; // 가장 큰값 * 횟수
        answer += (m - count) * second; // (전체 - 가장 큰값 횟수) * 두번째 수

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        System.out.println(solution(N, M, K, arr));
        br.close();
    }
}