package baekjoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String s = br.readLine();

        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += s.charAt(i) - '0';
        }

        System.out.println(sum);

        /*String s = br.readLine();

        int sum = 0;

        for (byte value : s.getBytes()) {
            sum += (value - '0');
        }
        System.out.println(sum);
        */

        br.close();
    }
}
