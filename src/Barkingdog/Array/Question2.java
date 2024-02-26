package Barkingdog.Array;

import java.io.IOException;

public class Question2 {
    public static void main(String[] args) throws IOException {
        int[] arr = {1, 23, 53, 77, 60};
        int[] flag = new int[101];

        for (int i = 0; i < arr.length; i++) {
            flag[arr[i]] = 1;
            if (flag[100 - arr[i]] == 1) {
                System.out.println(1);
                return;
            }
        }
        System.out.println(0);
    }
}
