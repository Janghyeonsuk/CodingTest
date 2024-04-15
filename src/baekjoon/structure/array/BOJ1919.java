package baekjoon.structure.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1919 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alpha = new int[26];
        char[] a = br.readLine().toLowerCase().toCharArray();
        char[] b = br.readLine().toLowerCase().toCharArray();

        int ans = 0;

        for (char c : a)
            alpha[c - 'a']++;
        for (char c : b)
            alpha[c - 'a']--;

        for (int i = 0; i < 26; i++) {
            if (alpha[i] != 0)
                ans += Math.abs(alpha[i]);
        }

        System.out.println(ans);
    }
}
