package inflearnCodingTest.greedy;

import java.io.*;
import java.util.*;

public class 최소스패닝트리_프림_8 {
    static int n, m;
    static boolean[] ch;
    static ArrayList<ArrayList<Edge>> graph;

    public static int solution(int v) {
        int ans = 0;
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        pQ.offer(new Edge(v, 0));
        while (!pQ.isEmpty()) {
            Edge tmp = pQ.poll();
            int ev = tmp.vex;
            if (!ch[ev]) {
                ch[ev] = true;
                ans += tmp.cost;
                for (Edge o : graph.get(ev)) {
                    if (!ch[o.vex]) pQ.offer(new Edge(o.vex, o.cost)); //지난 간선을 추가하지 않음
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        ch = new boolean[n + 1];

        graph = new ArrayList<ArrayList<Edge>>();

        for (int i = 0; i <= n; i++)
            graph.add(new ArrayList<Edge>());

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            graph.get(a).add(new Edge(b, c));
            graph.get(b).add(new Edge(a, c));
        }
        System.out.println(solution(1));
    }
}
