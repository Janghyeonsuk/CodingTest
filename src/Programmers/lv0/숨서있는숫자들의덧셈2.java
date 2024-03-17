package Programmers.lv0;

public class 숨서있는숫자들의덧셈2 {
    public int solution(String my_string) {
        int answer = 0;

        String[] num = my_string.replaceAll("[a-zA-Z]", " ").split(" ");

        for(String s : num)
            if(!s.isEmpty())
                answer += Integer.parseInt(s);

        return answer;
    }
}
