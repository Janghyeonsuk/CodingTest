package baekjoon.structure.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class num_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        boolean flag = false;
        int n = Integer.parseInt(br.readLine());
        int tmp = 1;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            for (; tmp <= num; tmp++) {
                stack.push(tmp);
                sb.append("+").append("\n");
            }

            if (stack.peek() == num) {
                stack.pop();
                sb.append("-").append("\n");
            } else
                flag = true;
        }
        if (flag)
            System.out.println("NO");
        else
            System.out.println(sb);
    }
}
