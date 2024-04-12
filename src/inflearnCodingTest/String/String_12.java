package InflearnCodingTest.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_12 {
    //12. 암호
    public String solution(int n, String str) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < n; i++) {
            // 전체 문자열을 암호화
            String tmp = str.substring(i * 7, (i * 7) + 7)
                    .replaceAll("#", "1").replaceAll("\\*", "0");

            int num = Integer.parseInt(tmp, 2); // 암호화한 문자열을 2진수로 변환
            answer.append((char) num); // 이진수를 알파벳으로 변환후 저장
        }

        return answer.toString();
    }

    public static void main(String[] args) throws IOException {
        String_12 main = new String_12();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        System.out.println(main.solution(n, str));
    }
}
