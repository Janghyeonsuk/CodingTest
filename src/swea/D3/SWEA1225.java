package swea.D3;

import java.io.*;
import java.util.*;

public class SWEA1225 {
    static int T = 10, N;
    static Queue<Integer> Q;
    static StringBuilder sb = new StringBuilder();

    public static void solution() {
        int count = 1;
        while (true) {
            int first = Q.poll() - count++;

            if (first <= 0) {
                Q.offer(0);
                break;
            }

            if (count == 6) count = 1;
            Q.offer(first);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int tc = 1; tc <= T; tc++) {
            N = Integer.parseInt(br.readLine());
            sb.append("#" + N + " ");

            Q = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 8; i++) {
                Q.add(Integer.parseInt(st.nextToken()));
            }

            solution();
            for (int i = 0; i < 8; i++) {
                sb.append(Q.poll() + " ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}

