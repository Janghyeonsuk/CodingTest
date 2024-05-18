package swea.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SWEA1984 {
    static StringBuilder sb = new StringBuilder();

    public static void solution(int[] arr) {
        int answer = 0;
        double sum = 0;
        Arrays.sort(arr);

        for (int i = 1; i < arr.length - 1; i++)
            sum += arr[i];

        answer = (int) Math.round(sum / 8);

        sb.append(answer + "\n");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#" + tc + " ");
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[10];
            for (int i = 0; i < 10; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            solution(arr);
        }
        System.out.println(sb);
        br.close();
    }
}

