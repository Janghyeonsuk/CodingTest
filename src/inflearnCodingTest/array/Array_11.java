package inflearnCodingTest.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array_11 {
    // 11. 임시 반장 구하기
    public int solution(int n, int[][] arr) {
        int answer = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= n; j++) {
                if (i != j) {
                    for (int k = 1; k <= 5; k++) {
                        if (arr[i][k] == arr[j][k]) {
                            count++;
                            break;
                        }
                    }
                }
            }
            if (count > max) {
                max = count;
                answer = i;
            }
        }


        return answer;
    }

    public static void main(String[] args) throws IOException {
        Array_11 main = new Array_11();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n + 1][6];

        for (int i = 1; i < n + 1; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(main.solution(n, arr));
    }
}
