package baekjoon.backtracking.NM;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ15664 {
    static int N, M;
    static int[] arr;
    static int[] nums;
    static boolean[] isused;
    static StringBuilder sb = new StringBuilder();

    public static void solve(int k, int st) {
        if (k == M) {
            for (int i = 0; i < M; i++)
                sb.append(arr[i] + " ");
            sb.append("\n");
            return;
        }
        int tmp = 0;

        for (int i = st; i < N; i++) {
            if (!isused[i] && nums[i] != tmp) {
                isused[i] = true;
                arr[k] = nums[i];
                tmp = arr[k];
                solve(k + 1, i + 1);
                isused[i] = false;
            }
        }
    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        nums = new int[N];
        arr = new int[N + 1];
        isused = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            nums[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(nums);
        solve(0, 0);
        System.out.print(sb);
    }
}

