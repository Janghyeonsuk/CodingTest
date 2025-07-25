package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BOJ11652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Long, Integer> map = new HashMap<>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            Long x = Long.parseLong(br.readLine());
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        Long answer = 0L;
        int cnt = 0;

        for (Long key : map.keySet()) {
            int cur = map.get(key);
            if (cnt < cur) {
                cnt = cur;
                answer = key;
            } else if (cnt == map.get(key))
                answer = Math.min(answer, key);
        }

        System.out.print(answer);
    }
}
