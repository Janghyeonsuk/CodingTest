package inflearnCodingTest.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class dp_4 {
    static int n;
    static int[] dy;
    static ArrayList<Brick> arr;
    // 25, 16, 9, 4, 1
    // 3, 2, 2, 4, 5
    // 4, 5, 3, 6, 2

    // ans 25, 9, 1
    // -> 3 + 2 + 5 -> 10
    public static int solution() {
        dy[0] = arr.get(0).h;
        int ans = dy[0];
        for (int i = 1; i < n; i++) {
            int max_h = 0;

            for (int j = i - 1; j >= 0; j--) {
                if (arr.get(j).w > arr.get(i).w && dy[j] > max_h) {
                    max_h = dy[j];
                }

                dy[i] = max_h + arr.get(i).h;
                ans = Math.max(ans, dy[i]);
            }
        }

        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        dy = new int[n];
        arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            arr.add(new Brick(s, h, w));
        }
        Collections.sort(arr);

        System.out.println(solution());
    }
}
