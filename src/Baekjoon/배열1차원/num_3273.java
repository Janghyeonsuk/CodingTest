package Baekjoon.배열1차원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] flag = new int[20000001];

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        int x = Integer.parseInt(br.readLine());
        int ans = 0;

        for (int i = 0; i < n; i++)
            flag[arr[i]] = 1;

        for (int i = 0; i < n; i++)
            if (x - arr[i] > 0 && flag[x - arr[i]] == 1)
                ans++;

        System.out.println(ans / 2);
    }
}
