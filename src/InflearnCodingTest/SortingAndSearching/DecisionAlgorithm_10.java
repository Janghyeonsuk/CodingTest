package InflearnCodingTest.SortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class DecisionAlgorithm_10 {
    // 10. 마굿간 정하기(결정 알고리즘)
    public int count(int[] arr, int distance) {
        int cnt = 1;
        int ep = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] - ep) >= distance) {
                cnt++;
                ep = arr[i];
            }
        }

        return cnt;
    }

    public int solution(int n, int c, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n - 1];

        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            if (count(arr, mid) >= c) {
                answer = mid;
                lt = mid + 1;
            } else
                rt = mid - 1;
        }
        return answer;

    }

    public static void main(String[] args) {
        DecisionAlgorithm_10 main = new DecisionAlgorithm_10();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();

        System.out.println(main.solution(n, c, arr));

    }
}
