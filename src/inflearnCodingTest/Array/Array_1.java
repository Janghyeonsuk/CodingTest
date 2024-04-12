package inflearnCodingTest.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Array_1 {
    // 1. 큰 수 출력하기
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1])
                answer.add(arr[i]);
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Array_1 main = new Array_1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        for (Integer i : main.solution(arr)) {
            System.out.print(i + " ");
        }
    }
}
