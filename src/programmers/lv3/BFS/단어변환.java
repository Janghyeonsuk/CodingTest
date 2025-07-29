package programmers.lv3.BFS;

import java.util.ArrayDeque;
import java.util.Queue;

public class 단어변환 {

    public int solution(String begin, String target, String[] words) {
        Queue<String> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[words.length];

        int L = 0;
        queue.offer(begin);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                String cur = queue.poll();
                if (cur.equals(target)) return L;

                for (int j = 0; j < words.length; j++) {
                    if (!visited[j] && check(cur, words[j])) {
                        visited[j] = true;
                        queue.offer(words[j]);
                    }
                }
            }
            L++;
        }


        return 0;
    }

    public boolean check(String a, String b) {
        int diff = 0;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i))
                diff++;
        }

        return diff == 1;
    }
}
