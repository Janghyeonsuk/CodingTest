package baekjoon.structure.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10871 {

    public String solved(String str1, String str2){
        StringTokenizer st = new StringTokenizer(str1);

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(str2);

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num < x)
                sb.append(num).append(" ");
        }

        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        BOJ10871 main = new BOJ10871();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = br.readLine();
        String s2 = br.readLine();

        System.out.println(main.solved(s1, s2));
    }
}
