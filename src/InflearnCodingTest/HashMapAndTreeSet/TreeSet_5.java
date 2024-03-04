package InflearnCodingTest.HashMapAndTreeSet;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSet_5 {
    // 5. K번째 큰 수
    public int solution(int n, int k, int[] arr) {
        int answer = -1;
        // 기본은 오름차순
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder()); //내림 차순

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    Tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int cnt = 0;
//        Tset.remove(143);
//        System.out.println(Tset.size());
//        System.out.println(Tset.first()); // 오름차순 = 최솟값, 내림차순 = 최댓값
//        System.out.println(Tset.last()); // 오름차순 = 최댓값, 내림차순 = 최솟값

        for (int x : Tset) {
            System.out.println(x);
            cnt++;
            if (cnt == k)
                answer = x;
        }
        return answer;
    }

    public static void main(String[] args) {
        TreeSet_5 main = new TreeSet_5();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(main.solution(n, k, arr));
    }
}
