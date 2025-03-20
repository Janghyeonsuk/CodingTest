package baekjoon.baekjoonlist;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ5073 {

    static void solution(int n) {
        int cnt = 1;
        int range = 2;

        while (n >= range) {
            range += (cnt * 6);
            cnt++;
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        solution(n);
    }
}
