package inflearnCodingTest.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array_7 {
    // 7.점수 계산
    public int solution(int[] arr) {
        int answer = 0;
        int score = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                score++;
                answer += score;
            } else
                score = 0;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Array_7 main = new Array_7();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        System.out.println(main.solution(arr));
    }
}
