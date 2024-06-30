package inflearnCodingTest.twopointSlidingwindow;

import java.io.*;
import java.util.StringTokenizer;

public class SlidingWindow_3 {
    //3. 최대 매출
    static int n, m;

    public static int solution(int[] arr) {
        int ans = 0;

        /*
        int lt = 0, rt = k;

        while (rt <= n) {
            int sum = 0;
            for (int i = lt; i < rt; i++)
                sum += arr[i];

            ans = Math.max(sum, ans);
            lt++;
            rt++;
        }
        */

        for (int i = 0; i < m; i++)
            ans += arr[i];

        int sum = ans;
        for (int i = m; i < n; i++) {
            sum += arr[i] - arr[i - m];
            ans = Math.max(ans, sum);
        }

        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        System.out.println(solution(arr));
    }

}