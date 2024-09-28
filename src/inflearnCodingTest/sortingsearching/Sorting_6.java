package inflearnCodingTest.sortingsearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Sorting_6 {
    // 6. 장난 꾸러기
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] clone = arr.clone();
        Arrays.sort(clone);

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (cnt == 2) break;
            if (arr[i] != clone[i]) {
                ans.add(i + 1);
                cnt++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Sorting_6 main = new Sorting_6();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int i : main.solution(n, arr))
            System.out.print(i + " ");

    }
}
