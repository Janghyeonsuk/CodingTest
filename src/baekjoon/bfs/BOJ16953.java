package baekjoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ16953 {

    public static int bfs(long a, long b){
        Queue<Long> q = new ArrayDeque<>();
        Set<Long> visited = new HashSet<>();
        visited.add(a);
        q.offer(a);

        int L = 1;
        while(!q.isEmpty()){
            int size = q.size();

            for (int i = 0; i < size; i++) {
                long cur = q.poll();
                if(cur == b) return L;

                long n = cur * 2;
                long m = Long.parseLong(cur + "1");
                if(!visited.contains(n) && n <= b) q.offer(n);
                if(!visited.contains(m) && m <= b) q.offer(m);
            }
            L++;
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        System.out.print(bfs(a,b));
    }
}