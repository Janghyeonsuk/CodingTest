package baekjoon.structure.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class num_10845 {
    static Queue<Integer> queue = new LinkedList<>();

    static void push(int n) {
        queue.add(n);
    }

    static int pop() {
        if (queue.isEmpty())
            return -1;
        else
            return queue.remove();
    }

    static int size() {
        return queue.size();
    }

    static int empty() {
        return queue.isEmpty() ? 1 : 0;
    }

    static int front() {
        if (queue.isEmpty())
            return -1;
        else
            return queue.peek();
    }

    static int back() {
        if (queue.isEmpty())
            return -1;
        else
            return ((LinkedList<Integer>) queue).getLast();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int last = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            switch (s) {
                case "push":
                    last = Integer.parseInt(st.nextToken());
                    push(last);
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
                case "front":
                    sb.append(front()).append("\n");
                    break;
                case "back":
                    sb.append(back()).append("\n");
                    break;
                default:
                    break;
            }
        }
        System.out.println(sb);
    }
}
