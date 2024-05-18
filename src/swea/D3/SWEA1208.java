package swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SWEA1208 {
    static int T = 10, N;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void solution(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            Arrays.sort(arr);
            arr[0]++;
            arr[99]--;
        }
        Arrays.sort(arr);
        int answer = arr[99] - arr[0];
        sb.append(answer + "\n");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int tc = 1; tc <= T; tc++) {
            sb.append("#" + tc + " ");
            N = Integer.parseInt(br.readLine());

            arr = new int[100];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            solution(N, arr);
        }
        System.out.println(sb);
        br.close();
    }
}
