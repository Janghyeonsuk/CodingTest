import java.io.*;
import java.util.StringTokenizer;

public class Main {
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