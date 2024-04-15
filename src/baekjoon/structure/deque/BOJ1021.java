package baekjoon.structure.deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        LinkedList<Integer> deque = new LinkedList<>();
        int count = 0;

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++)
            deque.add(i);

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());

            while (deque.getFirst() != num) {
                if (deque.indexOf(num) <= (deque.size() / 2)) {
                    deque.addLast(deque.getFirst());
                    deque.removeFirst();
                } else {
                    deque.addFirst(deque.getLast());
                    deque.removeLast();
                }
                count++;
            }
            deque.removeFirst();
        }
        System.out.println(count);
    }
}
