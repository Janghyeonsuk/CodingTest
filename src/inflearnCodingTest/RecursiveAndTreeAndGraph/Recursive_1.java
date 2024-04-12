package inflearnCodingTest.RecursiveAndTreeAndGraph;

import java.util.Scanner;

public class Recursive_1 {
    // 1. 재귀 함수(스택 프레임)
    public void recursive(int n) {
        if (n == 0)
            return;
        else {
            recursive(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Recursive_1 main = new Recursive_1();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        main.recursive(n);
    }
}
