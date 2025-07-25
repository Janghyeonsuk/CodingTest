package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BOJ10814 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<String[]> humans = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            humans.add(input);
        }

        humans.sort(Comparator.comparingInt(a -> Integer.parseInt(a[0])));

        StringBuilder sb = new StringBuilder();

        for (String[] human : humans) {
            sb.append(human[0]).append(" ").append(human[1]).append("\n");
        }

        System.out.println(sb);
    }
}