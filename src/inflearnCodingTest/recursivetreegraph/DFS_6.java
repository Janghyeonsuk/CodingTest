package inflearnCodingTest.recursivetreegraph;

import java.util.Scanner;

public class DFS_6 {
    // 6. 부분집합 구하기(DFS)
    static int n;
    static boolean[] ch;

    public void DFS(int L) {
        if (L == n + 1) {
            StringBuilder tmp = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                if (ch[i]) tmp.append(i).append(" ");
            }
            if (!tmp.isEmpty()) System.out.println(tmp.toString());
        } else {
            ch[L] = true;
            DFS(L + 1);
            ch[L] = false;
            DFS(L + 1);
        }
    }


    public static void main(String[] args) {
        DFS_6 main = new DFS_6();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        ch = new boolean[n + 1];
        main.DFS(1);
    }
}
