package inflearnCodingTest.dfsbfs;

import java.util.Scanner;

public class DFS_1 {
    static String answer = "NO";
    static int n, total = 0;
    boolean flag = false;
    static boolean[] ch;
    static int[] arr;

    public void DFS(int L, int sum) {
        if (flag) return; // 이미 답이 나왔으므로 나머지 필요 x
        if (sum > total / 2) return; // 이미 절반 이상이 넘어가면 구할 필요 x
        if (L == n) {
            if ((total - sum) == sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            DFS(L + 1, sum + arr[L]);
            DFS(L + 1, sum);
        }
    }

    public void DFS2(int L, int sum) {
        if (flag) return;
        if (sum > total / 2) return;
        if (L == n) {
            if (total == sum * 2) {
                answer = "YES";
                flag = true;
            }
        } else {
            if (!ch[arr[L]]) {
                ch[arr[L]] = true;
                DFS2(L + 1, sum);
                DFS2(L + 1, sum + arr[L]);
                ch[arr[L]] = false;
            }
        }
    }

    public static void main(String[] args) {
        DFS_1 main = new DFS_1();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        ch = new boolean[1000];
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            total += arr[i];
        }
        main.DFS(0, 0);
        System.out.println(answer);
    }
}
