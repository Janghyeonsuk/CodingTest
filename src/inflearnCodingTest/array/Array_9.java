package inflearnCodingTest.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array_9 {
    static int n;
    static int[][] board;

    public static int solution(int[][] board) {
        int ans = 0;
        int sum1, sum2;

        for (int i = 0; i < n; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < n; j++)
                sum1 += board[i][j];


            for (int j = 0; j < n; j++)
                sum2 += board[j][i];

            ans = Math.max(ans, Math.max(sum1, sum2));
        }

        sum1 = sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += board[i][i];
            sum2 += board[i][n - i - 1];
        }
        ans = Math.max(ans, Math.max(sum1,sum2));

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

        System.out.println(solution(board));
    }
}
