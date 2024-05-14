package swea;

import java.io.*;

public class SWEA1289 {
    static int T;
    static StringBuilder sb = new StringBuilder();

    public static void solution(String bit) {
        int cnt = 0;
        char cur = '0';
        for (int i = 0; i < bit.length(); i++) {
            if (bit.charAt(i) != cur) {
                cur = bit.charAt(i);
                cnt++;
            }
        }
        sb.append(cnt + "\n");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#" + tc + " ");
            String str = br.readLine();
            solution(str);
        }

        System.out.println(sb);
        br.close();
    }
}

