package inflearnCodingTest.RecursiveAndTreeAndGraph;

import java.util.Scanner;

public class DFS_6 {
    // 6. 부분집합 구하기(DFS)
    static int n;
    static int[] ch;

    public void DFS(int L) {
        if (L == n + 1) {
            String tmp = "";
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1)
                    tmp += (i + " ");
            }
            if (!tmp.isEmpty()) {
                System.out.println(tmp);
            }
        } else {
            ch[L] = 1;
            DFS(L + 1);
            ch[L] = 0;
            DFS(L + 1);
        }
    }


    public static void main(String[] args) {
        DFS_6 main = new DFS_6();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        ch = new int[n + 1];
        main.DFS(1);
    }
}
