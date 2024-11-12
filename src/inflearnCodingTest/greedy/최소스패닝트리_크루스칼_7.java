package inflearnCodingTest.greedy;

import java.io.*;
import java.util.*;

public class 최소스패닝트리_크루스칼_7 {
    static int n, m;
    static int[] unf;

    public static int Find(int v) {
        if (v == unf[v]) return unf[v];
        else return unf[v] = Find(unf[v]); //경로 압축
    }

    public static void Union(int a, int b) {
        int fa = Find(a);
        int fb = Find(b);
        if (fa != fb) unf[fa] = fb;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        unf = new int[n + 1];

        ArrayList<TreeEdge> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) unf[i] = i;

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            arr.add(new TreeEdge(a, b, c));
        }

        int ans = 0;
        int cnt = 0;

        Collections.sort(arr);

        for (TreeEdge o : arr) {
            int fv1 = Find(o.v1);
            int fv2 = Find(o.v2);
            if (fv1 != fv2) {
                if (cnt++ == n - 1) break;
                ans += o.cost;
                Union(fv1, fv2);
            }
        }
        System.out.println(ans);
    }
}
