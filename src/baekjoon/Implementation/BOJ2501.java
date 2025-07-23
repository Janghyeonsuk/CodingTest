package baekjoon.Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ2501 {
    // k번째 작은 수 구하기
    public static int solution(int n, int k) {
        List<Integer> div = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                div.add(i);
            }
        }

        if (div.size() < k) return 0;

        return div.get(k - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        System.out.print(solution(N, K));

    }
}
