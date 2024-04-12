package Baekjoon.자료구조.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class num_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int total = 0;

        int K = Integer.parseInt(br.readLine());
        for (int i = 0; i < K; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n != 0)
                stack.push(n);
            else
                stack.pop();
        }

        for (int i : stack) {
            total += i;
        }
        System.out.println(total);
    }
}
