package baekjoon.deep1;

import java.io.*;

public class BOJ1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] alpha = new int[26];
        int max = Integer.MIN_VALUE;
        char ch = '?';

        String str = br.readLine().toLowerCase();

        for (char c : str.toCharArray())
            alpha[c - 'a']++;

        for (int i = 0; i < 26; i++) {
            if (alpha[i] > max) {
                max = alpha[i];
                ch = (char) (i + 'A');
            } else if (alpha[i] == max)
                ch = '?';
        }

        bw.write(ch);

        br.close();
        bw.flush();
        bw.close();
    }
}
