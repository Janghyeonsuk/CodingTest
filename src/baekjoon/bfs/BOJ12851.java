package baekjoon.bfs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ12851 {
    static int min = Integer.MAX_VALUE;
    static int cnt = 0;

    public static void bfs(int a, int b) {
        Queue<Integer> q = new ArrayDeque<>();
        int[] count = new int[100001];
        Arrays.fill(count, -1);

        q.offer(a);
        count[a] = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int cur = q.poll();

                if (cur == b) {
                    if (count[cur] < min) {
                        min = count[cur];
                        cnt = 1;
                    } else if (count[cur] == min) {
                        cnt++;
                    }
                }

                int[] nexts = new int[]{cur - 1, cur + 1, cur * 2};

                for (int next : nexts) {
                    if (next < 0 || next > 100000) continue;

                    if (count[next] == -1 || count[next] == count[cur] + 1) {
                        count[next] = count[cur] + 1;
                        q.offer(next);
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        bfs(a, b);

        System.out.println(min);
        System.out.println(cnt);
    }
}
