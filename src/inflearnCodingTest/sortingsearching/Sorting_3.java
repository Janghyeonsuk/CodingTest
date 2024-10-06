package inflearnCodingTest.sortingsearching;

import java.util.Scanner;

public class Sorting_3 {
    // 3. 삽입 정렬

    // 최적화 -> swap이 아닌 shift
    public int[] solution(int n, int[] arr) {
        for (int i = 1; i < n; i++) {
            int tmp = arr[i], j = i - 1;
            while (j >= 0 && arr[j] > tmp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = tmp;
        }
        return arr;
    }

    public void swap(int i, int j, int[] arr) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public int[] solution2(int n, int[] arr) {
        for (int i = 1; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[j + 1]) swap(j, j + 1, arr);
                else break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Sorting_3 main = new Sorting_3();
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
