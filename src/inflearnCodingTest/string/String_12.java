package inflearnCodingTest.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_12 {
    //12. 암호
    public String solution(int n, String str) {
        StringBuilder sb = new StringBuilder();
        str = str.replace('#', '1').replace('*', '0');

        for (int i = 0; i < n; i++) {
            String tmp = str.substring(0, 7); //7개씩 자르기

            int num = Integer.parseInt(tmp, 2); //이진수를 숫자로 변환
            sb.append((char) num); //이진수를 char형으로 변환
            str = str.substring(7);
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        String_12 main = new String_12();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        System.out.println(main.solution(n, str));
    }
}
