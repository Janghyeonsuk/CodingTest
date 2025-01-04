package programmers.lv1.priorityQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class 명예의전당1 {

    public int[] solution(int k, int[] score) {
        List<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> pQ = new PriorityQueue<>();

        for (int i : score) {
            pQ.offer(i);

            while (pQ.size() > k) {
                pQ.poll();
            }

            list.add(pQ.peek());
        }

        return list.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}
