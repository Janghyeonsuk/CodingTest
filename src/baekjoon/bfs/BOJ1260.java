package baekjoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ1260 {

    static boolean[] visited;
    static List<List<Integer>> graph = new ArrayList<>();

    public static void dfs(int v){
        visited[v] = true;
        System.out.print(v + " ");
        for (int edge : graph.get(v)) {
            if(!visited[edge]){
                dfs(edge);
            }
        }
    }

    public static void bfs(int v){
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(v);

        while(!q.isEmpty()){
            int cur = q.poll();
            visited[cur] = true;
            System.out.print(cur + " ");
            for (Integer edge : graph.get(cur)) {
                if(!visited[edge]) {
                    q.offer(edge);
                    visited[edge] = true;
                }
            }

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        for (List<Integer> edges : graph) {
            Collections.sort(edges);
        }

        visited = new boolean[N + 1];
        dfs(V);
        System.out.println();

        visited = new boolean[N + 1];
        bfs(V);
    }
}