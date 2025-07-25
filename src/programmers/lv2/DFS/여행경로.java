package programmers.lv2.DFS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 여행경로 {

    class Ticket implements Comparable<Ticket> {
        String from;
        String to;
        boolean used;

        public Ticket(String from, String to) {
            this.from = from;
            this.to = to;
            this.used = false;
        }

        @Override
        public int compareTo(Ticket o) {
            if (this.from.equals(o.from))
                return this.to.compareTo(o.to);
            else
                return this.from.compareTo(o.from);
        }
    }

    List<String> path = new ArrayList<>();
    List<String> result = null;
    List<Ticket> tripList = new ArrayList<>();

    public String[] solution(String[][] tickets) {

        for (String[] t : tickets) {
            tripList.add(new Ticket(t[0], t[1]));
        }

        Collections.sort(tripList);
        path.add("ICN");

        DFS("ICN", 0);

        return result.toArray(new String[0]);
    }

    public void DFS(String cur, int L) {
        if (L == tripList.size()) {
            result = new ArrayList<>(path);
            return;
        }

        for (Ticket trip : tripList) {
            if (!trip.used && trip.from.equals(cur)) {
                trip.used = true;
                path.add(trip.to);

                DFS(trip.to, L + 1);
                if (result != null) return;

                trip.used = false;
                path.remove(path.size() - 1);
            }
        }
    }

//    String answer = "";
//    boolean[] visited;
//
//    public String[] solution(String[][] tickets) {
//        visited = new boolean[tickets.length];
//
//        Arrays.sort(tickets, (a, b) -> a[1].compareTo(b[1]));
//
//        DFS("ICN", "ICN", tickets, 0);
//
//        return answer.split(" ");
//    }
//
//    public void DFS(String cur, String path, String[][] tickets, int L) {
//        if (L == tickets.length) {
//            answer = path;
//            return;
//        }
//
//        for (int i = 0; i < tickets.length; i++) {
//            if (!visited[i] && cur.equals(tickets[i][0])) {
//                visited[i] = true;
//                DFS(tickets[i][1], path + " " + tickets[i][1], tickets, L + 1);
//                if (!answer.isEmpty()) return;
//                visited[i] = false;
//            }
//        }
//    }
}
