package baekjoon.bfs;

import java.io.*;
import java.util.*;

public class BOJ1697 {
    static int n, k;
    static int[] dis = new int[100001];
    static Queue<Integer> Q = new ArrayDeque<>();

    public static int BFS(int node) {
        Q.offer(node);
        int n;
        dis[node] = 1;
        while (!Q.isEmpty()) {
            n = Q.poll();
            if (n == k)
                return dis[n] - 1;

            if (n - 1 >= 0 && dis[n - 1] == 0) {
                dis[n - 1] = dis[n] + 1;
                Q.offer(n - 1);
            }
            if (n + 1 <= 100000 && dis[n + 1] == 0) {
                dis[n + 1] = dis[n] + 1;
                Q.offer(n + 1);
            }
            if (2 * n <= 100000 && dis[2 * n] == 0) {
                dis[2 * n] = dis[n] + 1;
                Q.offer(2 * n);
            }

        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());


        if (n == k)
            System.out.print(0);
        else {
            System.out.print(BFS(n));
        }
    }
}


