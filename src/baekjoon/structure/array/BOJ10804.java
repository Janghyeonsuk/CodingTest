package baekjoon.structure.array;

import java.io.*;
import java.util.StringTokenizer;


public class BOJ10804 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] card = new int[21];

        for (int i = 1; i < card.length; i++)
            card[i] = i;

        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int lt = Integer.parseInt(st.nextToken());
            int rt = Integer.parseInt(st.nextToken());

            while (lt < rt) {
                int temp = card[lt];
                card[lt] = card[rt];
                card[rt] = temp;
                lt++;
                rt--;
            }
        }


        for (int i = 1; i < card.length; i++) {
            System.out.print(card[i] + " ");
        }
    }
}
