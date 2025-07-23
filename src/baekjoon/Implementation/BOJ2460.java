package baekjoon.Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2460 {
    // 지하철 최대 승객 수 구하기
    public static int solution(int[][] arr) {
        int max = 0;
        int cur = 0;
        for (int i = 0; i < arr.length; i++) {
            cur = cur - arr[i][0] + arr[i][1];

            max = Math.max(max, cur);
        }

        return max;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] arr = new int[10][2];
        for (int i = 0; i < 10; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(arr));
    }
}
