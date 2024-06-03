package inflearnCodingTest.dfsbfs;

import java.util.Scanner;

public class DFS_1 {
    static String answer = "NO";
    static int n, total = 0;
    boolean flag = false;

    public void DFS(int L, int sum, int[] arr) {
        if (flag) return; // 이미 답이 나왔으므로 나머지 필요 x
        if (sum > total / 2) return; // 이미 절반 이상이 넘어가면 구할 필요 x
        if (L == n) {
            if ((total - sum) == sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            DFS(L + 1, sum + arr[L], arr);
            DFS(L + 1, sum, arr);
        }
    }

    public static void main(String[] args) {
        DFS_1 main = new DFS_1();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            total += arr[i];
        }
        main.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
