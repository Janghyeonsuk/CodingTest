package inflearnCodingTest.twopointSlidingwindow;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class TwoPoint_1 {
    //1. 두 배열 합치기
    static int n, m;

    public static ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> ans = new ArrayList<>();
        int p1 = 0, p2 = 0;

        while (p1 < n && p2 < m) {
            if (a[p1] < b[p2])
                ans.add(a[p1++]);
            else
                ans.add(b[p2++]);
        }
        if (p2 == m) {
            while (p1 < n) {
                ans.add(a[p1++]);
            }
        } else {
            while (p2 < m) {
                ans.add((b[p2++]));
            }
        }


        return ans;
    }

//    public static ArrayList<Integer> solution(int[] arr1, int[] arr2) {
//        ArrayList<Integer> ans = new ArrayList<>();
//        for (int i : arr1)
//            ans.add(i);
//        for (int i : arr2)
//            ans.add(i);
//
//        Collections.sort(ans);
//
//        return ans;
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int[] arr1 = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        m = Integer.parseInt(br.readLine());
        int[] arr2 = new int[m];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        for (Integer i : solution(n, m, arr1, arr2)) {
            System.out.print(i + " ");
        }
    }

}
