package inflearnCodingTest.dp;
import java.io.*;
import java.util.*;

public class dp_1 {
    static int n;
    static int[] dy;

    public static int solution(int n) {
        dy[1] = 1;
        dy[2] = 2;

        for (int i = 3; i <= n; i++) {
            dy[i] = dy[i - 2] + dy[i - 1];
        }

        return dy[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        dy = new int[n + 1];
        System.out.println(solution(n));
    }
}
