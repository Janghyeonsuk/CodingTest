import java.io.*;
import java.util.*;

public class Main {
    static int n, k;
    static int[] dis = new int[100001];
    static Queue<Integer> Q = new ArrayDeque<>();

    public static int BFS(int node) {
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        if (n == k)
            System.out.print(0);
        else
            System.out.print(BFS(n));
    }
}

