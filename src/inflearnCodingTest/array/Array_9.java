package inflearnCodingTest.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array_9 {
    static int n;
    static int[][] board;

    public static int solution(int n, int[][] arr) {
        int ans = Integer.MIN_VALUE;

        int sum3 = 0;
        int sum4 = 0;
        for (int i = 0; i < n; i++) {
            int sum1 = 0;
            int sum2 = 0;

            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            sum1 = Math.max(sum1, sum2);
            ans = Math.max(ans, sum1);

            sum3 += arr[i][i];
            sum4 += arr[n - i - 1][i];
        }

        sum3 = Math.max(sum3, sum4);
        ans = Math.max(ans, sum3);

        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        board = new int[n][n];


        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(solution(n, board));
    }
}
