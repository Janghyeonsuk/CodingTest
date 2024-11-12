package inflearnCodingTest.dp;

import java.io.*;
import java.util.*;

public class dp_3 {
    static int n;
    static int[] arr, dy;

    public static int solution() {
        dy[0] = 1;
        int ans = dy[0];
        for (int i = 1; i < n; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--)
                if (arr[j] < arr[i] && dy[j] > max) max = dy[j];
            dy[i] = max + 1;

            ans = Math.max(ans, dy[i]);
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        dy = new int[n];
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        System.out.println(solution());
    }
}

