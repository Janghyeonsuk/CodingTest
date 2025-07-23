package baekjoon.Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ3460 {
    // 이진수 인덱스 구하기
    public static void solution(int n) {
        List<Integer> indexList = new ArrayList<>();
        String s = new StringBuilder(Integer.toBinaryString(n)).reverse().toString(); // 이진수 변환

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1') indexList.add(i);
        }

        for (Integer i : indexList) {
            System.out.print(i + " ");
        }
    }

    public static void solution2(int n) {
        List<Integer> indexList = new ArrayList<>();
        String s = Integer.toBinaryString(n);

        int idx = s.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1') indexList.add(idx);
            idx--;
        }

        Collections.sort(indexList);

        for (Integer i : indexList) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < T; tc++) {
            int n = Integer.parseInt(br.readLine());
            solution(n);
        }
    }
}