package baekjoon.Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ2581 {

    public static void solution(int n, int m) {
        List<Integer> list = new ArrayList<>();

        for (int i = n; i <= m; i++) {
            if (isPrime(i)) list.add(i);
        }

        if (list.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(list.stream().mapToInt(Integer::intValue).sum());
            System.out.println(list.get(0));
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        solution(N, M);
    }
}