package inflearnCodingTest.sortingsearching;

import java.util.Scanner;

public class Sorting_1 {

    // 1. 선택정렬
    public int[] solution(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            int idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[idx] > arr[j]) idx = j;
            }
            swap(i, idx, arr);
        }
        return arr;
    }

    public void swap(int i, int j, int[] arr) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
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
