package inflearnCodingTest.recursivetreegraph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Recursive_4 {
    // 4. 피보나치 수열
    static int[] fibo;

    public int DFS(int n) {
        if (fibo[n] != 0) return fibo[n];
        if (n == 1)
            return fibo[n] = 1;
        else if (n == 2)
            return fibo[n] = 1;
        else
            return fibo[n] = DFS(n - 1) + DFS(n - 2);
    }

    public static void main(String[] args) throws IOException {
        Recursive_4 T = new Recursive_4();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        fibo = new int[n];
        for (int i = 1; i < n; i++) {
            System.out.print(T.DFS(i) + " ");
        }
    }
}