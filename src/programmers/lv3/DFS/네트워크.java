package programmers.lv3.DFS;

public class 네트워크 {
    int answer = Integer.MAX_VALUE;
    boolean[] visited;

    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];

        dfs(begin, target, words, 0);

        return answer == Integer.MAX_VALUE ? 0 : answer;
    }

    public void dfs(String cur, String target, String[] words, int L) {
        if (cur.equals(target)) {
            answer = Math.min(answer, L);
            return;
        }

        for (int i = 0; i < words.length; i++) {
            if (!visited[i] && check(cur, words[i])) {
                visited[i] = true;
                dfs(words[i], target, words, L + 1);
                visited[i] = false;
            }
        }
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