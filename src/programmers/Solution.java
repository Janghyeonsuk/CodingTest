package programmers;

import java.util.*;

public class Solution {
    static int answer;
    static int[] sum;
    ArrayList<HashMap<Integer, Integer>> consent;
    static ArrayList<ArrayList<Integer>> connect;

    static class Plug implements Comparable<Plug> {
        int idx, size, min;

        public Plug(int idx, int size, int min) {
            this.idx = idx;
            this.size = size;
            this.min = min;
        }

        @Override
        public int compareTo(Plug o) {
            if (this.size == o.size && this.min == o.min)
                return o.idx - this.idx;
            if (this.size == o.size)
                return this.min - o.min;
            return this.size - o.size;
        }
    }

    public int socket(int x, int[][] sockets, int k) {
        int sum = 0;
        for (int i = 0; i < sockets[x].length; i++) {
            if (sockets[x][i] == 0 || sockets[x][i] == 1)
                continue;
            else if (sockets[x][i] == -1)
                sum += k;
            else {
                sum += socket(sockets[x][i] - 1, sockets, k);
            }
        }

        return sum;
    }

    public void find(int i, int k) {
        boolean[] visited = new boolean[k + 1];
        Queue<Integer> q = new LinkedList<>();
        for (int key : consent.get(i).keySet()) {
            if (key != -1) {
                q.add(key);
                connect.get(i).add(key);
            }
        }

        while (!q.isEmpty()) {
            int cur = q.poll();
            if (!visited[cur]) {
                for (int key : consent.get(cur - 1).keySet()) {
                    if (key != -1) {
                        q.offer(key);
                        connect.get(i).add(key);
                        visited[key] = true;
                    }
                }
            }
        }
    }

    public int solution(int k, int[] limits, int[][] sockets) {
        answer = 0;
        sum = new int[sockets.length];
        consent = new ArrayList<>();
        connect = new ArrayList<>();

        for (int i = 0; i < limits.length; i++) {
            consent.add(new HashMap<>());
            connect.add(new ArrayList<>());
            sum[i] += socket(i, sockets, k);
        }

        for (int i = 0; i < sockets.length; i++) {
            HashMap<Integer, Integer> hm = new HashMap<>();
            for (int j = 0; j < sockets[i].length; j++) {
                if (sockets[i][j] == 0)
                    continue;
                hm.put(sockets[i][j], hm.getOrDefault(sockets[i][j], 0) + 1);
                consent.get(i).put(sockets[i][j], hm.get(sockets[i][j]));
            }
        }

        ArrayList<Plug> list = new ArrayList<>();
        for (int i = 0; i < sockets.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int key : consent.get(i).keySet()) {
                min = Math.min(min, key);
            }
            list.add(new Plug(i, consent.get(i).size(), min));
        }
        Collections.sort(list);

        for (int i = 0; i < limits.length; i++) {
            find(i, limits.length);
        }

        for (Plug c : list) {
            int s = 0;
            if (sum[c.idx] > limits[c.idx]) {
                while (sum[c.idx] > limits[c.idx]) {
                    int x = k;
                    if (sum[c.idx] < k) {
                        sum[c.idx] = 0;
                        x = sum[c.idx];
                    } else {
                        sum[c.idx] -= k;
                    }
                    s += x;
                    answer++;
                }
            }
            if (s == 0)
                continue;
            for (int i = 0; i < sockets.length; i++) {
                if (connect.get(i).contains(c.idx + 1))
                    sum[i] -= s;
            }
        }

        return answer;
    }
}