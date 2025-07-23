package baekjoon.Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2309 {
    // 일곱 난쟁이
    public static void solution(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        int f1 = -1, f2 = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (sum - arr[i] - arr[j] == 100) {
                    f1 = i;
                    f2 = j;
                    break;
                }
            }
            if (f1 != -1) break;
        }

        for (int i = 0; i < arr.length; i++) {
            if (i != f1 && i != f2) System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        solution(arr);
    }
}
