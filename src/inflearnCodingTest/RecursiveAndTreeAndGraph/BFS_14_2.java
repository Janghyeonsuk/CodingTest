package inflearnCodingTest.RecursiveAndTreeAndGraph;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_14_2 {
    static int answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int n, m;
    static int[] dis, ch;
    Queue<Integer> Q = new LinkedList<>();


    public void BFS(int v) {
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(v);
        ch[v] = 1;
        dis[v] = 0;
        int L = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int cur = Q.poll();
                dis[cur] = L;
                for (int nx : graph.get(cur)) {
                    if (ch[nx] == 0) {
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
    }

    public static void main(String[] args) throws IOException {
        BFS_14_2 main = new BFS_14_2();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            graph.get(a).add(b);
        }
        ch = new int[n + 1];
        dis = new int[n + 1];
        ch[1] = 1;
        main.BFS(1);

        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + dis[i]);
        }
    }
}