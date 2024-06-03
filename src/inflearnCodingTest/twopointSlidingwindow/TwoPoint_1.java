package inflearnCodingTest.twopointSlidingwindow;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class TwoPoint_1 {
    //1. 두 배열 합치기
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        while (p1 < n && p2 < m) {
            if (a[p1] < b[p2])
                answer.add(a[p1++]);
            else
                answer.add(b[p2++]);
        }

        if (p1 == n) {
            while (p2 < m) {
                answer.add(b[p2++]);
            }
        } else if (p2 == m) {
            while (p1 < n) {
                answer.add(a[p1++]);
            }
        }


        return answer;
    }

    public static void main(String[] args) throws IOException {
        TwoPoint_1 T = new TwoPoint_1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr1 = new int[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++)
            arr1[i] = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());
        int[] arr2 = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++)
            arr2[i] = Integer.parseInt(st.nextToken());

        for (int i : T.solution(n, m, arr1, arr2))
            bw.write(i + " ");

        bw.flush();
        bw.close();
        br.close();
    }
}
