package baekjoon.deep1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toLowerCase();

        //StringBuilder 사용
        String reverse = new StringBuilder(str).reverse().toString();

        if (str.equals(reverse))
            System.out.println(1);
        else
            System.out.println(0);
/*
        // 투 포인터
        int lt = 0, rt = str.length() - 1;

        while (lt < rt) {
            if (str.charAt(lt) == str.charAt(rt)) {
                lt++;
                rt--;
            } else {
                System.out.println(0);
                return;
            }
        }
        System.out.println(1);
*/
    }
}
