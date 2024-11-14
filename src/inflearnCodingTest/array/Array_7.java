package inflearnCodingTest.array;

import java.io.*;
import java.util.StringTokenizer;


public class Array_7 {
    // 7. 점수계산
    static int cnt;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static int solution() {
        int answer = 0;
        int bonus = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                answer++;
                answer += bonus++;
            } else
                bonus = 0;
        }


        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        solution();
        System.out.println(cnt);
        br.close();
    }
}
