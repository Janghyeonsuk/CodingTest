package swea;

import java.io.*;

public class SWEA1213 {
    static int T = 10;
    static StringBuilder sb = new StringBuilder();

    public static void solution(String str, String sentence) {
        int cnt = 0;
        int len = str.length();
        while (sentence.contains(str)) {
            int idx = sentence.indexOf(str);
            sentence = sentence.substring(idx + len);
            cnt++;
        }
        sb.append(cnt + "\n");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int tc = 1; tc <= T; tc++) {
            int n = Integer.parseInt(br.readLine());
            sb.append("#" + n + " ");
            String str = br.readLine();
            String senetence = br.readLine();
            solution(str, senetence);
        }

        System.out.println(sb);
        br.close();
    }
}
