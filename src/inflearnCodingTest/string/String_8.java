package inflearnCodingTest.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_8 {
    //8. 유효한 팰린드롬
    public String solution(String str) {

        /*
        // 알파벳만 추출후 직접 비교 방법
        String s = str.replaceAll("[^a-z]", "");
        return s.equals(new StringBuilder(s).reverse().toString()) ? "YES" : "NO";
    }
    */

        // 정규식 사용 방법
        str = str.replaceAll("[^A-Z]", "");
        return str.equals(new StringBuilder(str).reverse().toString()) ? "YES" : "NO";
    }

    public static void main(String[] args) throws IOException {
        String_8 main = new String_8();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().toUpperCase();

        System.out.println(main.solution(str));
    }
}

