package baekjoon.심화1;

import java.util.Scanner;

public class num_3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cnt = new int[6];
        int[] set = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < cnt.length; i++) {
            cnt[i] = sc.nextInt();
        }

        for (int i = 0; i < set.length; i++) {
            int chess = set[i] - cnt[i];
            System.out.print(chess + " ");
        }

    }
}