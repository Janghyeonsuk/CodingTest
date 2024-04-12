package baekjoon.array;

import java.util.Scanner;

public class num_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] avg = new int[n];
        int max = 0;
        double sum = 0.0;

        for (int i = 0; i < avg.length; i++) {
            avg[i] = sc.nextInt();

            if (avg[i] > max)
                max = avg[i];
            sum += avg[i];
        }
        System.out.println(((sum / max) * 100) / n);
    }
}