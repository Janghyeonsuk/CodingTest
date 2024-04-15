package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String S[] = new String[n];

        for (int i = 0; i < n; i++) {
            S[i] = br.readLine();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(Character.toString(S[i].charAt(0)) + Character.toString(S[i].charAt(S[i].length() - 1)));
        }
        br.close();
    }
}
