package programmers.lv3.DFS;

public class 네트워크 {

    private int n;
    private boolean[] visited;
    private int[][] computers;

    public int solution(int n, int[][] computers) {
        this.n = n;
        this.computers = computers;
        visited = new boolean[n];

        int answer = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i);
                answer++;
            }
        }

        return answer;
    }

    public void dfs(int cur) {
        visited[cur] = true;

        for (int i = 0; i < n; i++) {
            if (!visited[i] && computers[cur][i] == 1) {
                dfs(i);
            }
        }
    }

}