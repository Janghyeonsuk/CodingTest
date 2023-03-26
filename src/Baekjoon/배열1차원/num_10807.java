package Baekjoon.배열1차원;

import java.util.Scanner;

public class num_10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countV = 0;
        int N = sc.nextInt();
        int arr[] = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int v = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (v == arr[i])
                countV++;
        }
        System.out.print(countV);

        sc.close();
    }
}
