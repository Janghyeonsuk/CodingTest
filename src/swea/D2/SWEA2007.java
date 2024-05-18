package swea.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA2007 {
    static StringBuilder sb = new StringBuilder();

    public static void solution(String str) {
        int cnt = 0;

        for (int i = 1; i < str.length(); i++) {
            String s1 = str.substring(0, i); // i = 5 korea
            String s2 = str.substring(i, i + i); //  5 - 9
            if (s1.equals(s2)) {
                cnt = i;
                break;
            }
        }

        sb.append(cnt + "\n");
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
