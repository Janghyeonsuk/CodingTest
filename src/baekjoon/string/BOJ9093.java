package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9093 {

    public static void solution(String s) {
        StringBuilder result = new StringBuilder();

        for (String str : s.split(" ")) {
            result.append(new StringBuilder(str).reverse().append(" "));
        }

        System.out.println(result.toString().trim());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            solution(br.readLine());
        }
    }
}
