package programmers.lv3.DFS;

import java.util.Arrays;

public class 여행경로 {
    String answer = "";
    boolean[] visited;
    String[][] tickets;

    public String[] solution(String[][] tickets) {
        this.tickets = tickets;
        visited = new boolean[tickets.length];

        Arrays.sort(tickets, (a, b) -> a[1].compareTo(b[1]));

        dfs("ICN", "ICN", 0);

        return answer.split(" ");
    }

    public void dfs(String cur, String path, int L) {
        if(!answer.isEmpty()) return; // 사전순 조건 충족

        if (L == tickets.length) {
            answer = path;
            return;
        }

        for (int i = 0; i < tickets.length; i++) {
            if (!visited[i] && cur.equals(tickets[i][0])) {
                visited[i] = true;
                dfs(tickets[i][1], path + " " + tickets[i][1], L + 1);
                visited[i] = false;
            }
        }
    }
}