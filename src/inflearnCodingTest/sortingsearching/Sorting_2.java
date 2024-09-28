package inflearnCodingTest.sortingsearching;

import java.util.Scanner;

public class Sorting_2 {
    // 2. 버블정렬

    public int[] solution(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j])
                    swap(i, j, arr);
            }
        }
        return arr;
    }

    public void swap(int i, int j, int[] arr) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        Sorting_2 main = new Sorting_2();
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
