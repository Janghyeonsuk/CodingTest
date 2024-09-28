package inflearnCodingTest.sortingsearching;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Sorting_5 {
    // 5. 중복 확인
    public String solution(int n, int[] arr) {
        //O(n log n)
        String answer = "U";
        Arrays.sort(arr);

        for (int i = 0; i < n - 1; i++)
            if (arr[i] == arr[i + 1]) {
                answer = "D";
                break;
            }
        return answer;

//        //O(n)
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for (int x : arr)
//            map.put(x, map.getOrDefault(x, 0) + 1);
//
//        for (Integer value : map.values()) {
//            if(value > 1) return 'D';
//        }
//
//        return 'U';
    }

    public static void main(String[] args) {
        Sorting_5 main = new Sorting_5();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(main.solution(n, arr));

    }
}
