package Programmers.lv0;

public class 외계행성의나이 {
    public String solution(int age) {
        String answer = "";
        String p_age = Integer.toString(age);

        for(int i = 0; i < p_age.length(); i++)
            answer += (char)(p_age.charAt(i) + 49);

        return answer;
    }
}
