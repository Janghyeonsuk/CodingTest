package Baekjoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_2675 {
    public static void main(String[] args) throws IOException {
        /*Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int R = sc.nextInt();
            String S = sc.next();

            for (int j = 0; j < S.length(); j++) {
                for (int k = 0; k < R; k++) {
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println("");
        }
        sc.close();*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());

            String S = st.nextToken();
            /*char[] charArray = S.toCharArray(); //String을 Char배열로 변경

            for (char C : charArray) {
                for (int j = 0; j < R; j++) {
                    System.out.print(C);
                }
            }*/
            for (int j = 0; j < S.length(); j++) {
                for (int k = 0; k < R; k++) {
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println("");
        }
    }
}
