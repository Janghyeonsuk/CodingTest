package baekjoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ14226 {
    private static int answer = 0;

    public static void bfs(int s) {
        Queue<int[]> q = new ArrayDeque<>();
        boolean[][] visited = new boolean[2001][2001];
        q.offer(new int[]{1, 0, 0});
        visited[1][0] = true;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int[] cur = q.poll();
                int now = cur[0];
                int save = cur[1];
                int time = cur[2];

                if (now == s) {
                    answer = time;
                    return;
                }

                if (!visited[now][now]) {
                    q.offer(new int[]{now, now, time + 1});
                    visited[now][now] = true;
                }

                if (now + save <= 2000 && !visited[now + save][save]) {
                    q.offer(new int[]{now + save, save, time + 1});
                    visited[now + save][save] = true;
                }

                if (now - 1 > 0 && !visited[now - 1][save]) {
                    q.offer(new int[]{now - 1, save, time + 1});
                    visited[now - 1][save] = true;
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());

        bfs(s);

        System.out.println(answer);
    }
}

