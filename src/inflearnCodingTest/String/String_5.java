package InflearnCodingTest.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_5 {
    // 5. 특정 문자 뒤집기
    public String solution(String str) {
        String answer;
        char[] charArr = str.toCharArray();
        int lt = 0, rt = charArr.length - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(charArr[lt])) lt++;
            else if (!Character.isAlphabetic(charArr[rt])) rt--;
            else {
                char tmp = charArr[lt];
                charArr[lt] = charArr[rt];
                charArr[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(charArr);

        return answer;
    }

    public static void main(String[] args) throws IOException {
        String_5 main = new String_5();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(main.solution(str));
    }
}