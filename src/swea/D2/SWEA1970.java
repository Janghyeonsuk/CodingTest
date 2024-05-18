package swea.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA1970 {
    static StringBuilder sb = new StringBuilder();
    static int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

    public static void solution(int n) {
        int[] count = new int[money.length];

        for (int i = 0; i < money.length; i++) {
            if (n >= money[i]) {
                count[i] = n / money[i];
                n %= money[i];
            }
        }
        for (int i = 0; i < count.length; i++)
            sb.append(count[i] + " ");

        sb.append("\n");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#" + tc + "\n");
            int n = Integer.parseInt(br.readLine());
            solution(n);
        }
        System.out.println(sb);
        br.close();
    }
}

