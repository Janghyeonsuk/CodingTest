package swea.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA1989 {
    static StringBuilder sb = new StringBuilder();

    public static void solution(String str) {
        String reverse = new StringBuilder(str).reverse().toString();
        int bit = str.equals(reverse) ? 1 : 0;
        sb.append(bit + "\n");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#" + tc + " ");
            String str = br.readLine();
            solution(str);
        }
        System.out.println(sb);
        br.close();
    }
}

