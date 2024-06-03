package inflearnCodingTest.sortingsearching;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting_5 {
    // 5. 중복 확인
    public String solution(int n, int[] arr) {
        String answer = "U";
        Arrays.sort(arr);

        for (int i = 0; i < n - 1; i++)
            if (arr[i] == arr[i + 1]) {
                answer = "D";
                break;
            }
        return answer;

    }

    public static void main(String[] args) {
        Sorting_5 main = new Sorting_5();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(main.solution(n, arr));

    }
}
