package inflearnCodingTest.SortingAndSearching;

import java.util.Scanner;

public class LRU_4 {
    // 4. Least Recently Used
    public int[] solution(int size, int n, int[] arr) {
        int[] cashe = new int[size];
        for (int x : arr) {
            int pos = -1;
            for (int i = 0; i < size; i++)
                if (x == cashe[i])
                    pos = i;

            if (pos == -1) {
                for (int i = size - 1; i >= 1; i--)
                    cashe[i] = cashe[i - 1];
            } else {
                for (int i = pos; i >= 1; i--)
                    cashe[i] = cashe[i - 1];
            }
            cashe[0] = x;
        }


        return cashe;
    }

    public static void main(String[] args) {
        LRU_4 main = new LRU_4();
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int i : main.solution(s, n, arr)) {
            System.out.print(i + " ");
        }

    }
}