package InflearnCodingTest.RecursiveAndTreeAndGraph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_14 {
    static int n, m;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;
    static int[] dis;


    public void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        ch[v] = 1;
        dis[v] = 0;
        while (!queue.isEmpty()) {
            int cv = queue.poll();
            for (int nv : graph.get(cv)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    queue.offer(nv);
                    dis[nv] = dis[cv] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        BFS_14 main = new BFS_14();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++)
            graph.add(new ArrayList<>());

        ch = new int[n + 1];
        dis = new int[n + 1];

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            graph.get(a).add(b);
        }
        main.BFS(1);
        for (int i = 2; i <= n; i++)
            System.out.println(i + " : " + dis[i]);

    }
}
