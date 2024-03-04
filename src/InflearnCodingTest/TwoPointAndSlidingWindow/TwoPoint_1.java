package InflearnCodingTest.TwoPointAndSlidingWindow;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoPoint_1 {
    //1. 두 배열 합치기
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            if (a[p1] < b[p2])
                answer.add(a[p1++]);
            else
                answer.add(b[p2++]);
        }

        if (p1 == n) {
            while (p2 < m)
                answer.add(b[p2++]);
        } else {
            while (p1 < n)
                answer.add(a[p1++]);
        }
        return answer;
    }

    public static void main(String[] args) {
        TwoPoint_1 main = new TwoPoint_1();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = in.nextInt();
        }

        for (int x : main.solution(n, m, arr1, arr2)) {
            System.out.print(x + " ");
        }
    }
}
