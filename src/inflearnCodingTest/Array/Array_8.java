package inflearnCodingTest.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Array_8 {
    // 8. 등수 구하기
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int cnt = 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i])
                    cnt++;
            }
            answer.add(cnt);
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Array_8 main = new Array_8();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        for (int i : main.solution(arr)) {
            System.out.print(i + " ");
        }
    }
}
