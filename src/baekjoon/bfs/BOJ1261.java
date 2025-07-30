package baekjoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ1261 {
    static int N, M;
    static int[][] map;
    static int[][] dist;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static class Point implements Comparable<Point> {
        int x, y, cost;

        public Point(int x, int y, int cost) {
            this.x = x;
            this.y = y;
            this.cost = cost;
        }

        public int compareTo(Point o) {
            return this.cost - o.cost; // cost 오름차순
        }
    }

    public static void bfs2() {
        PriorityQueue<Point> q = new PriorityQueue<>();
        dist[0][0] = 0;

        q.offer(new Point(0, 0, 0));

        while (!q.isEmpty()) {
            Point p = q.poll();

            int x = p.x;
            int y = p.y;
            int cost = p.cost;

            if (x == N - 1 && y == M - 1) {
                System.out.println(cost);
                return;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;

                int next = cost + map[nx][ny];

                if (dist[nx][ny] > next) {
                    dist[nx][ny] = next;
                    q.offer(new Point(nx, ny, next));
                }
            }
        }

    }

    static public void bfs() {
        Deque<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{0, 0});
        dist[0][0] = 0;
        while (!q.isEmpty()) {
            int[] cur = q.pollFirst();
            int x = cur[0];
            int y = cur[1];

            if (x == N - 1 && y == M - 1) {
                System.out.println(dist[N - 1][M - 1]);
                return;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;

                int cost = dist[x][y] + map[nx][ny];

                if (dist[nx][ny] > cost) {
                    dist[nx][ny] = cost;
                    if (map[nx][ny] == 0) {
                        q.offerFirst(new int[]{nx, ny});
                    } else {
                        q.offerLast(new int[]{nx, ny});
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        dist = new int[N][M];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j) - '0';
                dist[i][j] = Integer.MAX_VALUE;
            }
        }
        bfs();
    }
}
