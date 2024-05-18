package book.greedy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Greedy_1 {
    public static int solution(int n, int k, Integer[] arr) {
        int answer = 0;
        Arrays.sort(arr, Collections.reverseOrder());

        while (k != 0) {
            for (int i = 0; i < n; i++) {
                if (k / arr[i] > 0) {
                    answer += k / arr[i];
                    k = k % arr[i];
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Integer[] arr = new Integer[N];

        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(br.readLine());

        System.out.print(solution(N, K, arr));
        br.close();
    }
}
