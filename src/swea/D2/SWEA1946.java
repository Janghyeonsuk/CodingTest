package swea.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA1946 {
    static StringBuilder sb = new StringBuilder();

    public static void solution(int n, String[] str, int[] arr) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i]; j++) {
                sb.append(str[i]);
                cnt++;
                if (cnt == 10) {
                    sb.append("\n");
                    cnt = 0;
                }
            }
        }

        sb.append("\n");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#" + tc + "\n");
            int n = Integer.parseInt(br.readLine());
            String[] str = new String[n];
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                str[i] = st.nextToken();
                arr[i] = Integer.parseInt(st.nextToken());
            }

            solution(n, str, arr);
        }
        System.out.println(sb);
        br.close();
    }
}

