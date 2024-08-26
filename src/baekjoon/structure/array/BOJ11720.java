package baekjoon.structure.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11720 {
    static int n;

    public static int solution(char[] arr) {
        int ans = 0;

        for (char num : arr) {
            ans += num - '0';
        }

        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        String sNum = br.readLine();
        char[] cNum = sNum.toCharArray();

        System.out.println(solution(cNum));
    }

}
