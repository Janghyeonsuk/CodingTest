package baekjoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ13549 {
    static int min = Integer.MAX_VALUE;

    public static void bfs(int start, int target) {
        int[] dist = new int[100001];

        Arrays.fill(dist, -1);

        Deque<Integer> q = new ArrayDeque<>();
        q.offer(start);
        dist[start] = 0;

        while (!q.isEmpty()) {
            int cur = q.poll();

            if (cur == target) {
                min = Math.min(dist[cur], min);
            }

            int telpo = cur * 2;

            if (telpo <= 100000 && dist[telpo] == -1) {
                dist[telpo] = dist[cur];
                q.offerFirst(telpo);
            }

            for (int next : new int[]{cur - 1, cur + 1}) {
                if (next < 0 || next > 100000) continue;

                if (dist[next] == -1) {
                    dist[next] = dist[cur] + 1;
                    q.offerLast(next);
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        bfs(a, b);

        System.out.println(min);
    }
}
