package baekjoon.Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ1292 {
    // 쉽게 푸는 문제
    public static int solution(int a, int b) {
        int sum = 0;
        int count = 0;

        for (int i = 1; count < b; i++) {
            for (int j = 0; j < i; j++) {
                count++;
                if (count >= a && count <= b)
                    sum += i;
            }
            if (count == b) break;
        }
        return sum;
    }

    public static int solution2(int a, int b) {
        List<Integer> list = new ArrayList<>();
        int num = 1;

        while (list.size() < b) {
            for (int i = 0; i < num; i++) {
                list.add(num);
            }
            num++;
        }
        List<Integer> result = list.subList(a - 1, b);
        return result.stream().mapToInt(i -> i).sum();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        System.out.println(solution(A, B));
    }
}
