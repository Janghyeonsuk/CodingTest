package Programmers.lv0;

public class 팩토리얼 {
    public int fact(int n) {
        if (n == 1)
            return 1;
        return n * fact(n - 1);
    }

    public int solution(int n) {
        int answer = 1;

        while(fact(answer) <= n){
            if(fact(answer + 1) > n)
                return answer;
            answer++;
        }

        return answer;
    }
}
