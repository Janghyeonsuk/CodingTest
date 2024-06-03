package inflearnCodingTest.recursivetreegraph;

import java.util.Scanner;

public class Recursive_4 {
    // 4. 피보나치 수열
    static int[] fibo;

    public int recursive(int n) {
        if (fibo[n] > 0) return fibo[n];
        if (n == 1)
            return fibo[n] = 1;
        else if (n == 2)
            return fibo[n] = 1;
        else
            return fibo[n] = recursive(n - 1) + recursive(n - 2);
    }

    public static void main(String[] args) {
        Recursive_4 main = new Recursive_4();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        fibo = new int[n + 1];
        main.recursive(n);
        for (int i = 1; i <= n; i++)
            System.out.print(fibo[i] + " ");

    }

}
