package swea.D3;

import java.util.Scanner;

public class SWEA1217 {
    static int T = 10;

    public static int solution(int n, int num) {
        if (n == 1)
            return num;

        return num * solution(n - 1, num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int tc = 1; tc <= T; tc++) {
            int t = sc.nextInt();
            int num = sc.nextInt();
            int N = sc.nextInt();
            System.out.println("#" + t + " " + solution(N, num));
        }
    }
}

