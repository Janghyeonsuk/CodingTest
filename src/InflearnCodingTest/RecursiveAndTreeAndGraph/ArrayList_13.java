package InflearnCodingTest.RecursiveAndTreeAndGraph;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_13 {
    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;

    public void DFS(int v) {
        if (v == n)
            answer++;
        else {
            for (int nv : graph.get(v)) {
                if (ch[nv] == 0)
                    ch[nv] = 1;
                DFS(nv);
                ch[nv] = 0;
            }
        }
    }


    public static void main(String[] args) {
        ArrayList_13 main = new ArrayList_13();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            graph.get(a).add(b);
        }
        ch[1] = 1;
        main.DFS(1);
        System.out.println(answer);
    }
}
