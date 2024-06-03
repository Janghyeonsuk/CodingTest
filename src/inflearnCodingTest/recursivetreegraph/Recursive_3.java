package inflearnCodingTest.recursivetreegraph;

import java.util.Scanner;

public class Recursive_3 {
    // 3. 팩토리얼
    static int n;
    static int[] num;

    public int DFS(int n) {
        if (num[n] > 0) return num[n];
        if (n == 1)
            return num[n] = 1;
        else {
            return num[n] = n * DFS(n - 1);
        }
    }

    public static void main(String[] args) {
        Recursive_3 main = new Recursive_3();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        num = new int[n + 1];
        System.out.println(main.DFS(n));
    }
}
