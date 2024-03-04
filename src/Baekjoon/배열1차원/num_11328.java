package Baekjoon.배열1차원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_11328 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] alpha = new int[26];
            char[] a = st.nextToken().toCharArray();
            char[] b = st.nextToken().toCharArray();

            for (char c : a) alpha[c - 'a']++;
            for (char c : b) alpha[c - 'a']--;

            boolean flag = true;

            for (int j : alpha)
                if (j != 0)
                    flag = false;

            if (flag) System.out.println("Possible");
            else System.out.println("Impossible");
        }
    }
}
