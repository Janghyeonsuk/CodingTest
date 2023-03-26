package Baekjoon.배열1차원;

import java.util.*;
import java.io.*;

public class num_5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        Boolean students[] = new Boolean[31];

        for (int i = 0; i < students.length; i++) {
            students[i] = false;
        }

        for (int i = 1; i < 29; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            students[n] = true;
        }

        for (int i = 1; i < students.length; i++) {
            if (!students[i])
                System.out.println(i);
        }

        br.close();
    }
}
