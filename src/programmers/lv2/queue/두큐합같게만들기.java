package programmers.lv2.queue;

import java.util.*;

public class 두큐합같게만들기 {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        int limit = queue1.length * 3;
        long sum1 = 0, sum2 = 0;

        Queue<Integer> q1 = new ArrayDeque<>();
        Queue<Integer> q2 = new ArrayDeque<>();

        for (int i = 0; i < queue1.length; i++) {
            q1.offer(queue1[i]);
            q2.offer(queue2[i]);

            sum1 += queue1[i];
            sum2 += queue2[i];
        }

        while (sum1 != sum2) {
            if (answer >= limit) return -1;

            if (sum1 > sum2) {
                sum1 -= q1.peek();
                sum2 += q1.peek();
                q2.offer(q1.poll());
            } else {
                sum2 -= q2.peek();
                sum1 += q2.peek();
                q1.offer(q2.poll());
            }
            answer++;
        }

        return answer;
    }
}
