package InflearnCodingTest.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2.대소문자 변환
public class String_2 {
    public String solution(String str) {
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c))
                sb.append(Character.toUpperCase(c));
            else
                sb.append(Character.toLowerCase(c));
        }
        return sb.toString();
    }

    // 아스키 코드 값 사용
        /*for (char c : str.toCharArray()) {
            if (c >= 97 && c <= 122)
                answer.append((char) (c - 32));
            else
                answer.append((char) (c + 32));
        }*/

    public static void main(String[] args) throws IOException {
        String_2 main = new String_2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(main.solution(str));
    }
}