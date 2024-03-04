package Baekjoon.배열1차원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class num_1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] num = new int[10];
        String value = st.nextToken();

        for (char c : value.toCharArray()) {
            if (c - '0' == 6)
                num[9]++;
            else
                num[c - '0']++;
        }

        if (num[9] % 2 == 0)
            num[9] /= 2;
        else
            num[9] = num[9] / 2 + 1;

        System.out.println(Arrays.stream(num).max().getAsInt());
    }
}
