package inflearnCodingTest.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_11 {
    // 11. 문자열 압축
    public String solution(String str) {
        //마지막 문자를 비교하기 위해서 빈 문자열을 추가해야함
        StringBuilder answer = new StringBuilder();
        str = str + " ";
        int cnt = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1))
                cnt++;
            else {
                answer.append(str.charAt(i));
                if (cnt > 1)
                    answer.append(cnt);
                cnt = 1;
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) throws IOException {
        String_11 main = new String_11();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(main.solution(str));
    }
}
