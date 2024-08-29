package baekjoon.twopoint;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1940 {
    static int N, M;
    static int[] arr;

    public static int solution() {
        int ans = 0;
        int lt = 0, rt = N - 1; //투포인터 설정
        while (lt < rt) {
            int sum = arr[lt] + arr[rt];
            if (sum == M) {
                ans++;
                lt++;
                rt--;
            } else if (sum > M) {
                rt--;
            } else {
                lt++;
            }
        }

        return ans;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        System.out.println(solution());
    }
}
