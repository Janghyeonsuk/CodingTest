package baekjoon.structure.linkedlist;

import java.io.*;
import java.util.*;
import java.util.LinkedList;

public class BOJ1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        sb.append('<');
        while(!list.isEmpty()) {
            for (int i = 0; i < k; i++) {
                if (i == k-1) {
                    if (list.size() == 1) {
                        sb.append(list.remove());
                    } else {
                        sb.append(list.remove()).append(", ");
                    }
                } else {
                    list.add(list.remove());
                }
            }
        }
        sb.append('>');
        System.out.println(sb);
    }
}
