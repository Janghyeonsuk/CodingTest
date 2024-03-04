package InflearnCodingTest.TwoPointAndSlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TwoPoint_2 {
    // 2. 공통 원소 구하기
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int p1 = 0, p2 = 0;

        while (p1 < n && p2 < m) {
            if (a[p1] == b[p2]) {
                answer.add(a[p1++]);
                p2++;
            } else if (a[p1] < b[p2])
                p1++;
            else
                p2++;
        }
        return answer;
    }

    public static void main(String[] args) {
        TwoPoint_2 main = new TwoPoint_2();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = in.nextInt();
        }

        for (int x : main.solution(n, m, a, b)) {
            System.out.println(x + " ");
        }

    }
}
