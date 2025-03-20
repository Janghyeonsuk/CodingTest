package baekjoon.Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ23971 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double h = Double.parseDouble(st.nextToken());
        double w = Double.parseDouble(st.nextToken());
        double n = Double.parseDouble(st.nextToken());
        double m = Double.parseDouble(st.nextToken());

        int a = (int) Math.ceil(h / (n + 1));
        int b = (int) Math.ceil(w / (m + 1));

        System.out.println(a * b);
    }
}
