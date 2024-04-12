package baekjoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] charArray = br.readLine().toCharArray();

        int time = 0;

        for (char a : charArray) { // 'A' = 65, 'Z' = 90
            if (a <= 'C')
                time += 3;
            else if (a <= 'F')
                time += 4;
            else if (a <= 'I')
                time += 5;
            else if (a <= 'L')
                time += 6;
            else if (a <= 'O')
                time += 7;
            else if (a <= 'S')
                time += 8;
            else if (a <= 'V')
                time += 9;
            else if (a <= 'Z')
                time += 10;
            else {
                System.out.println("대문자를 입력하세요");
                break;
            }
        }
        System.out.println(time);

    }
}
