package programmers.lv0;

public class 옹알이1 {
    public int solution(String[] babbling) {
        int answer = 0;
        String s1 = "aya";
        String s2 = "ye";
        String s3 = "woo";
        String s4 = "ma";

        for(String s : babbling){
            s = s.replace(s1, " ").replace(s2," ").replace(s3," ").replace(s4, " ");
            if(s.isBlank())
                answer++;
        }

        return answer;
    }
}
