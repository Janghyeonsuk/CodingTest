package inflearnCodingTest.SortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class Searching_8 {
    // 8. 이진탐색
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = 0, rt = n - 1;
        Arrays.sort(arr);
        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            if (arr[mid] > m)
                rt = mid - 1;
            else if (arr[mid] < m)
                lt = mid + 1;
            else {
                answer = mid + 1;
                break;
            }
        }
        return answer;

    }

    public static void main(String[] args) {
        Searching_8 main = new Searching_8();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(main.solution(n, m, arr));
    }
}
