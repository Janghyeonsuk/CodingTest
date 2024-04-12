package programmers.lv0;

public class 코드처리하기 {
    public String solution(String code) {
        String answer = "";
        int mode = 0;

        for(int i = 0; i < code.length(); i++){
            if(code.charAt(i) == '1') mode = 1 - mode;
            else if(i % 2 == mode) answer += code.charAt(i);
        }

        return answer.isEmpty() ? "EMPTY" : answer;
    }
}
