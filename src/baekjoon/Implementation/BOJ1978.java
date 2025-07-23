package baekjoon.Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1978 {
    // 소수구하기
    public static int solution(int[] arr) {
        int cnt = 0;
        for (int n : arr) {
            if (check(n)) cnt++;
        }
        return cnt;
    }

    public static boolean check(int n) {
        if (n == 1) return false;
        for (int i = 2; i < n; i++) {
            for (int j = i; j < n; j += i) {
                if (n % j == 0) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(arr));
    }
}
