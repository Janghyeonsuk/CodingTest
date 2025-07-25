package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ2910 {

    public static void solution(List<Integer> list, LinkedHashMap<Integer, Integer> map) {
        list.sort((a, b) -> {
            int freqA = map.get(a);
            int freqB = map.get(b);

            if (freqA != freqB) return freqB - freqA;
            else return 0;
        });

        StringBuilder sb = new StringBuilder();
        for (Integer n : list) {
            for (int i = 0; i < map.get(n); i++) {
                sb.append(n).append(" ");
            }

        }

        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        List<Integer> list = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(st.nextToken());

            if (!list.contains(x))
                list.add(x);
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        solution(list, map);
    }
}