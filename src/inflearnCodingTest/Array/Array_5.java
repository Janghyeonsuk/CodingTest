package inflearnCodingTest.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array_5 {
    // 5. 소수(에라토스테네스체)
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n + 1];

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == 0) {
                answer++;
                for (int j = i; j < arr.length; j = j + i)
                    arr[j] = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Array_5 main = new Array_5();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        System.out.println(main.solution(n));
    }
}
