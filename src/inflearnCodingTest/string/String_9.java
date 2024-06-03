package inflearnCodingTest.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_9 {
    // 9.숫자만 추출
    public String solution(String str) {
        String answer;
        StringBuilder sb = new StringBuilder();
        char[] c = str.toCharArray();

        for (char x : c)
            if (Character.isDigit(x))
                sb.append(x);

        answer = sb.toString();

        return answer;

        /*
        int answer = 0;
        for (char x : c) {
            if (x >= 48 && x <= 57)
                // 처음 나온 문자열을 10의 자리씩 증가시키며 자연수로 만듦
                answer = answer * 10 + (x - 48);
        }
        return answer;
        */
    }

    public static void main(String[] args) throws IOException {
        String_9 main = new String_9();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(main.solution(str));
    }
}






