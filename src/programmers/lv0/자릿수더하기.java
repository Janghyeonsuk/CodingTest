package programmers.lv0;

public class 자릿수더하기 {
    public int solution(int n) {
        int answer = 0;
        String[] s = String.valueOf(n).split("");

        for(String str : s)
            answer += Integer.parseInt(str);

        return answer;
    }

    public int solution1(int n) {
        int answer = 0;

        while(n > 0){
            answer += n %10;
            n/=10;
        }

        return answer;
    }
}
