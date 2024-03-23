package Programmers.lv0;

public class 중복된문자제거 {
    public String solution(String my_string) {
        String answer = "";

        for(int i = 0; i < my_string.length(); i++)
            if(i == my_string.indexOf(my_string.charAt(i)))
                answer+=my_string.charAt(i);

        return answer;
    }
}
