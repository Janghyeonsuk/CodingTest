package inflearnCodingTest.SortingAndSearching;

import java.util.Scanner;

public class Sorting_1 {
    // 1. 선택정렬
    public int[] solution(int n, int[] arr) {

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minIndex] > arr[j])
                    minIndex = j;
            }
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }

        return arr;
    }

    public static void main(String[] args) {
        Sorting_1 main = new Sorting_1();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int x : main.solution(n, arr))
            System.out.print(x + " ");

    }
}
