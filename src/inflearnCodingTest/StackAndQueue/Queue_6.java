package inflearnCodingTest.StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_6 {
    // 6. 공주 구하기

    public int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> Q = new LinkedList<>();

        for (int i = 1; i <= n; i++)
            Q.offer(i);

        while (!Q.isEmpty()) {
            for (int i = 1; i < k; i++)
                Q.offer(Q.poll());
            Q.poll();
            if (Q.size() == 1)
                answer = Q.poll();
        }

        return answer;
    }


    public static void main(String[] args) {
        Queue_6 main = new Queue_6();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        System.out.println(main.solution(n, k));
    }
}
