package inflearnCodingTest.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_8 {
    //8. 유효한 팰린드롬
    public String solution(String str) {

        /*
        // 알파벳만 추출후 직접 비교 방법
        public String solution(String str) {
        String answer = "YES";
        StringBuilder sb = new StringBuilder();

        for (char x : str.toUpperCase().toCharArray()) {
            if (Character.isAlphabetic(x))
                sb.append(x);
        }

        if (!sb.toString().equals(sb.reverse().toString()))
            answer = "NO";

        return answer;
    }
    */

        // 정규식 사용 방법
        String answer = "No";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equals(tmp))
            answer = "Yes";

        return answer;
    }

    public static void main(String[] args) throws IOException {
        String_8 main = new String_8();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(main.solution(str));
    }
}

