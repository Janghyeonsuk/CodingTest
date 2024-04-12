package inflearnCodingTest.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_7 {
    //7. 회문 문자열
    public String solution(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        String tmp = new StringBuilder(str).reverse().toString();
        if (!str.equals(tmp))
            answer = "NO";

        /*char[] charArr = str.toCharArray();
        int lt = 0, rt = str.length() - 1;
        while (lt < rt) {
            if (charArr[lt] == charArr[rt]) {
                lt++;
                rt--;
            } else
                answer = "NO";
        }*/

        return answer;
    }

    public static void main(String[] args) throws IOException {
        String_7 main = new String_7();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.print(main.solution(str));
    }
}
