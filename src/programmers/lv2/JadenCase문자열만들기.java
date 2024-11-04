package programmers.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JadenCase문자열만들기 {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        Boolean isNew = true;

        for(char x : s.toCharArray()){
            if(x == ' '){
                answer.append(x);
                isNew = true;
            } else{
                if(isNew){
                    answer.append(Character.toUpperCase(x));
                    isNew = false;
                } else
                    answer.append(Character.toLowerCase(x));
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) throws IOException {
        JadenCase문자열만들기 T = new JadenCase문자열만들기();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.print(T.solution(s));
    }
}
