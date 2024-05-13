package swea;

import java.io.*;
import java.util.StringTokenizer;

public class SWEA1209 {
    static int T = 10;
    static int[][] arr;
    static StringBuilder sb = new StringBuilder();

    public static void solution(int[][] arr) {
        int max = Integer.MIN_VALUE;
        int dSum1 = 0;
        int dSum2 = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < arr.length; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            max = Math.max(max, Math.max(sum1, sum2));

            dSum1 += arr[i][i];
            dSum2 += arr[i][99 - i];
        }
        max = Math.max(max, Math.max(dSum1, dSum2));

        sb.append(max + "\n");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int tc = 1; tc <= T; tc++) {
            int t = Integer.parseInt(br.readLine());
            sb.append("#" + t + " ");

            arr = new int[100][100];
            for (int i = 0; i < 100; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 100; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            solution(arr);
        }

        System.out.println(sb);
        br.close();
    }
}

