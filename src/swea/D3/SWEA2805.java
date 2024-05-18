package swea.D3;

import java.io.*;

public class SWEA2805 {
    static int T, N;
    static int[][] arr;
    static StringBuilder sb = new StringBuilder();

    public static void solution(int[][] board) {
        int sum = 0;
        int mid = N / 2;
        for (int i = 0; i < N; i++) {
            if (i <= mid) {
                for (int j = mid - i; j < mid + i + 1; j++) {
                    sum += board[i][j];
                }
            } else {
                for (int j = i - mid; j < N + mid - i; j++) {
                    sum += board[i][j];
                }
            }
        }


        sb.append(sum + "\n");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#" + tc + " ");
            N = Integer.parseInt(br.readLine());
            arr = new int[N][N];

            for (int i = 0; i < N; i++) {
                String[] nums = br.readLine().split("");
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(nums[j]);
                }
            }
            solution(arr);
        }
        System.out.println(sb);
        br.close();
    }
}

