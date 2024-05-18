package swea.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA1204 {
    static StringBuilder sb = new StringBuilder();

    public static void solution(int[] arr) {
        int max = Integer.MIN_VALUE;
        int maxCount = 0;
        for (int i = 0; i <= 100; i++) {
            if (maxCount < arr[i]) {
                maxCount = arr[i];
                max = i;
            }
            if (maxCount == arr[i]) {
                max = Math.max(max, i);
            }
        }
        sb.append(max + "\n");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            int num = Integer.parseInt(br.readLine());
            sb.append("#" + num + " ");
            int[] arr = new int[101];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 1000; i++)
                arr[Integer.parseInt(st.nextToken())] += 1;
            solution(arr);
        }

        System.out.println(sb);
        br.close();
    }
}
