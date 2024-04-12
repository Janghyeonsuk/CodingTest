package inflearnCodingTest.TwoPointAndSlidingWindow;

import java.io.*;
import java.util.StringTokenizer;

public class Complex_6 {
    //6. 최대 길이 연속 부분 수열
    public int solution(int n, int k, int[] arr) {
        int answer = 0;
        int cnt = 0;
        int lt = 0;

        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) cnt++;
            if (cnt > k) {
                while (cnt > k) {
                    if (arr[lt++] == 0) cnt--;
                }
            }
            answer = Math.max(answer, rt - lt + 1);
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Complex_6 T = new Complex_6();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());


        bw.write(String.valueOf(T.solution(n, m, arr)));

        bw.flush();
        bw.close();
        br.close();
    }
}
