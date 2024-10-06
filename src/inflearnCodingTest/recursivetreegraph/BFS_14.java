package inflearnCodingTest.recursivetreegraph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_14 {
    static int n, m;
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] ch;
    static int[] dis;
    Queue<Integer> Q = new LinkedList<>();

    public void BFS(int v) {
        Q.offer(v);
        ch[v] = true;
        while (!Q.isEmpty()) {
            int cv = Q.poll();
            for (int nv : graph.get(cv)) {
                if (!ch[nv]) {
                    ch[nv] = true;
                    Q.offer(nv);
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

        ch = new boolean[n + 1];
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
