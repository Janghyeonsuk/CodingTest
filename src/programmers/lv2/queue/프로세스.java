package programmers.lv2.queue;

import java.util.*;

public class 프로세스 {

    class Process {
        int priority;
        int index;

        Process(int priority, int index) {
            this.priority = priority;
            this.index = index;
        }
    }

    public int solution(int[] priorities, int location) {
        Queue<Process> queue = new LinkedList<>();
        int answer = 0;

        for (int i = 0; i < priorities.length; i++) {
            queue.add(new Process(priorities[i], i));
        }

        while (!queue.isEmpty()) {
            Process cur = queue.poll();

            boolean flag = false;
            for (Process p : queue) {
                if (p.priority > cur.priority) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                queue.add(cur);
            } else {
                answer++;
                if (cur.index == location) {
                    return answer;
                }
            }
        }

        return answer;
    }
}
