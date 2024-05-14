package swea;

import java.io.*;

public class SWEA1926 {
    static int T;
    static StringBuilder sb = new StringBuilder();

    public static void solution(int n) {
        for (int i = 1; i <= n; i++) {
            String tmp = String.valueOf(i);

            if (tmp.contains("3") || tmp.contains("6") || tmp.contains("9")) {
                for (int j = 0; j < tmp.length(); j++) {
                    tmp = tmp.replaceAll("[369]", "-");
                }
                tmp = tmp.replaceAll("[0124578]", "");
            }
            sb.append(tmp + " ");
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());
        solution(T);

        System.out.println(sb);
        br.close();
    }
}

