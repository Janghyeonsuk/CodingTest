package programmers.lv3.DFS;

public class 단어변환 {
    private int answer = Integer.MAX_VALUE;
    private String target;
    private String[] words;
    private boolean[] visited;

    public int solution(String begin, String target, String[] words) {
        this.target = target;
        this.words = words;
        this.visited = new boolean[words.length];

        dfs(begin, 0);

        return answer == Integer.MAX_VALUE ? 0 : answer;
    }

    public void dfs(String cur, int L) {
        if (cur.equals(target)) {
            answer = Math.min(answer, L);
            return;
        }

        for (int i = 0; i < words.length; i++) {
            if (!visited[i] && check(cur, words[i])) {
                visited[i] = true;
                dfs(words[i], L + 1);
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