package baekjoon.structure.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_10828 {
    private static int[] stack = new int[10001];
    private static int top = -1;

    public static int empty() {
        return top == -1 ? 1 : 0;
    }

    public static int size() {
        return top + 1;
    }

    public static int top() {
        if (top == -1)
            return -1;
        else
            return stack[top];
    }

    public static void push(int value) {
        stack[++top] = value;
    }

    public static int pop() {
        if (empty() == 0) {
            int value = stack[top];
            stack[top] = 0;
            top--;
            return value;
        } else
            return -1;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            switch (s) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(pop()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "top":
                    sb.append(top()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}