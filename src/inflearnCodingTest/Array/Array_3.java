package InflearnCodingTest.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Array_3 {
    // 3. 가위바위보
    public ArrayList<Character> solution(int n, int[] arr1, int[] arr2) {
        ArrayList<Character> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr1[i] == arr2[i]) {
                answer.add('D');
            } else if (arr1[i] - arr2[i] == 1 || arr1[i] - arr2[i] == -2) {
                answer.add('A');
            } else {
                answer.add('B');
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Array_3 main = new Array_3();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            arr1[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            arr2[i] = Integer.parseInt(st.nextToken());

        for (char c : main.solution(n, arr1, arr2))
            System.out.println(c);
    }
}
