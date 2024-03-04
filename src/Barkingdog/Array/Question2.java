package Barkingdog.Array;

import java.io.IOException;

public class Question2 {
    public static void main(String[] args) throws IOException {
        int[] arr = {1, 23, 53, 77, 60};
        int[] flag = new int[101];

        int ans = 0;

        for (int i = 0; i < arr.length; i++)
            flag[arr[i]] = 1;

        for (int i = 0; i < arr.length; i++) {
            if (flag[100 - arr[i]] == 1) {
                ans++;
            }
        }
        System.out.println(ans / 2);
    }
}
