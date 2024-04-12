package inflearnCodingTest.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array_12 {
    // 12. 멘토링
    public int solution(int n, int m, int[][] arr) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int cnt = 0;
                if (i != j) {
                    for (int k = 0; k < m; k++) {
                        int pi = 0, pj = 0;
                        for (int l = 0; l < n; l++) {
                            if (arr[k][l] == i)
                                pi = l;
                            if (arr[k][l] == j)
                                pj = l;
                        }
                        if (pi < pj)
                            cnt++;
                    }
                }
                if (cnt == m)
                    answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Array_12 main = new Array_12();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(main.solution(n, m, arr));
    }
}
