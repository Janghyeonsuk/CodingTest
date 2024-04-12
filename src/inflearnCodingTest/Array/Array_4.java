package inflearnCodingTest.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array_4 {
    // 4. 피보나치 수열
    public int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;

        for (int i = 2; i < n; i++) {
            answer[i] = answer[i - 2] + answer[i - 1];
        }
        // 손코딩
        /*public void solution(int n) {
            int a=1,b=1,c;
            System.out.println(a+ " " + b + " ");
            for (int i = 2; i < n; i++) {
                c = a + b;
                System.out.println(c + " ");
                a = b;
                b = c;
            }
        }*/

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Array_4 main = new Array_4();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        for (int i : main.solution(n))
            System.out.print(i + " ");
    }
}
