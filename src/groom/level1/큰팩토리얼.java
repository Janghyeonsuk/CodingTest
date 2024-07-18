package groom.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 큰팩토리얼 {
    private static int MOD = 1000000007;

    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = (result * i) % MOD;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long result = factorial(N) % MOD;
        System.out.println(result);
    }
}