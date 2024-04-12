package baekjoon.structure.array;

import java.io.*;

public class num_10808 {

    public int[] solve(String str) {
        int[] result = new int['z' - 'a' + 1];
        for (int i = 0; i < str.length(); i++)
            result[str.charAt(i) - 'a'] += 1;

        return result;
    }

    public static void main(String[] args) throws IOException {
        num_10808 main = new num_10808();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] result = main.solve(s);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
