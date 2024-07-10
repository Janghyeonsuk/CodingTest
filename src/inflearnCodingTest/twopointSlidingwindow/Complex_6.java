package inflearnCodingTest.twopointSlidingwindow;

import java.io.*;
import java.util.StringTokenizer;

public class Complex_6 {
    //6. 최대 길이 연속 부분 수열
    static int n, k;

    public static int solution(int[] arr) {
        int ans = 0;
        int cnt = 0;
        int lt = 0;

        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) cnt++;

            while (cnt > k) {
                if (arr[lt++] == 0) cnt--;
            }
            ans = Math.max(ans, rt - lt + 1);
        }

        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(arr));
    }
}
